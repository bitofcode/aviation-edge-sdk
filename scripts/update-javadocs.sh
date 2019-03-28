#!/usr/bin/env bash

set  -euo pipefail
IFS=$'\n\t'

SCRIPT_NAME="$(basename $0)"
SCRIPT_PATH_DIR="$(dirname $0)"
cd ${SCRIPT_PATH_DIR}
cd ../
PROJECT_ROOT="$(pwd)"
JAVA_DOC_API="${PROJECT_ROOT}/javadoc" 

TEMP_DIR="${PROJECT_ROOT}/.tmp"

if [[ -d ${TEMP_DIR} ]];
then
  rm -rf ${TEMP_DIR}
fi

mkdir ${TEMP_DIR}

URL="https://repo.maven.apache.org/maven2/com/bitofcode/oss/sdk/aviation-edge-sdk/0.2.0/aviation-edge-sdk-0.2.0-javadoc.jar"
JAVA_DOC_ARCHIVE="${TEMP_DIR}/aviation-edge-sdk.javadoc.jar"
JAVA_DOC="${TEMP_DIR}/aviation-edge-sdk.javadoc"

curl ${URL} --output ${JAVA_DOC_ARCHIVE}

unzip -d ${JAVA_DOC} ${JAVA_DOC_ARCHIVE}

if [[ -d ${JAVA_DOC_API} ]];
then
  rm -rf ${JAVA_DOC_API}
fi

mkdir ${JAVA_DOC_API}

cp -rf ${JAVA_DOC}/*  ${JAVA_DOC_API}/

rm -rf ${TEMP_DIR}