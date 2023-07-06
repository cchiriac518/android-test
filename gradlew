#!/bin/bash

set -eo pipefail

if [[ -x "./gradlew" ]]; then
  ./gradlew "$@"
else
  echo "Gradle wrapper not found. Please make sure to commit the 'gradlew' and 'gradlew.bat' files to your repository."
  exit 1
fi
