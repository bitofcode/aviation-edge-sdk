#!/usr/bin/env bash

set  -euo pipefail
IFS=$'\n\t'


VERSION="0.2.0"
if [[ $# -gt 0 ]]; then
  VERSION=$1
else
  echo "Option version is missing"
  exit 1
fi

SCRIPT_NAME="$(basename $0)"
SCRIPT_PATH_DIR="$(dirname $0)"
cd ${SCRIPT_PATH_DIR}
cd ../
PROJECT_ROOT="$(pwd)"
JAVA_DOC_API="${PROJECT_ROOT}/javadoc" 
TEMP_DIR="${PROJECT_ROOT}/.tmp"

function clear_or_create_folder(){
  FOLDER=$1
  if [[ -d ${FOLDER} ]];
  then
    rm -rf ${FOLDER}
  fi
  mkdir ${FOLDER}
}


clear_or_create_folder ${TEMP_DIR}

URL="https://repo.maven.apache.org/maven2/com/bitofcode/oss/sdk/aviation-edge-sdk/${VERSION}/aviation-edge-sdk-${VERSION}-javadoc.jar" 
JAVA_DOC_ARCHIVE="${TEMP_DIR}/aviation-edge-sdk.javadoc.jar"
JAVA_DOC="${TEMP_DIR}/aviation-edge-sdk.javadoc"

curl --silent --show-error --fail --output ${JAVA_DOC_ARCHIVE}  ${URL}  || {
  rm -rf ${TEMP_DIR}
  echo "Can not download ${URL}"
  exit 1
}

unzip -d ${JAVA_DOC} ${JAVA_DOC_ARCHIVE} || {
  rm -rf ${TEMP_DIR}
  echo "Can not unzip ${JAVA_DOC_ARCHIVE} "
  exit 1
}

clear_or_create_folder ${JAVA_DOC_API}

cp -rf ${JAVA_DOC}/*  ${JAVA_DOC_API}/

rm -rf ${TEMP_DIR}
