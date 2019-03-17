#!/usr/bin/env bash

set  -euo pipefail
IFS=$'\n\t'

SCRIPT_NAME="$(basename $0)"
SCRIPT_PATH_DIR="$(dirname $0)"
cd ${SCRIPT_PATH_DIR}
cd ../../
PROJECT_ROOT="$(pwd)"

for dockerfile in $(ls util/build-environments/Dockerfiles/*);
do
	container=$(basename $dockerfile)
	echo "$container => $dockerfile";
	container_tag="bitofcode/$container"
	docker build --file $dockerfile  --tag $container_tag  .
	docker push $container_tag
done;