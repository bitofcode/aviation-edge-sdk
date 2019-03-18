#!/usr/bin/env bash

SCRIPT_NAME="$(basename $0)"
SCRIPT_PATH_DIR="$(dirname $0)"
cd ${SCRIPT_PATH_DIR}
cd ../../
PROJECT_ROOT="$(pwd)"

if [ "$TRAVIS_BRANCH" = 'master' ] && [ "$TRAVIS_PULL_REQUEST" == 'false' ]; then
    openssl aes-256-cbc \
      -K $encrypted_0aa8d5faa4a4_key \
      -iv $encrypted_0aa8d5faa4a4_iv \
      -in util/configurations/codesigning.asc.enc \
      -out util/configurations/codesigning.asc \
      -d

    gpg --fast-import util/configurations/codesigning.asc


fi