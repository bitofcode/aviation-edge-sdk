#!/usr/bin/env bash

set  -euo pipefail
IFS=$'\n\t'

function do_run() {

  for container in $(ls ./util/build-environments/Dockerfiles/) ; do
    docker build --file ./util/build-environments/Dockerfiles/${container} -t ${container} . || exit 1

    docker run -it -v $(pwd):/mnt -e"SONAR_CLOUD_TOKEN=$SONAR_CLOUD_TOKEN" -w /mnt ${container} \
      mkdir /tmp/ae-jdk && cp -rf /mnt/util/scripts/ci-build.sh  all \
      ${@} \
      --quiet || exit 1
  done
}


SCRIPT_NAME="$(basename $0)"
SCRIPT_PATH_DIR="$(dirname $0)"
cd ${SCRIPT_PATH_DIR}
cd ../../
PROJECT_ROOT="$(pwd)"

if [[ $# -lt 1 ]]; then
  ARGS=(
    -P sonar
    -s /mnt/util/configurations/settings.xml
  )
else
  ARGS=("${@}")
fi

do_run ${ARGS[@]}
