#!/bin/sh

set -e

git clone --depth 1 https://github.com/simpligility/maven-android-sdk-deployer
cd maven-android-sdk-deployer
mvn install 
cd -
rm -rf maven-android-sdk-deployer

echo "Done!"
