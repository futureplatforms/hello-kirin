#!/bin/bash
#

pwd

# This runs from within the ios folder

if [ "${USER}" == "jenkins" ]
then

# Use --refresh-dependencies on Jenkins

    ../gradlew \
        :ios:build \
        :gwt:build \
        -PgwtModule=org.hello.HelloKirin_safari_${CONFIGURATION} \
        -Pconfiguration=${CONFIGURATION} \
        -PbuildDir=build_gradle \
        --refresh-dependencies \
        --no-daemon
else
    ../gradlew \
        :ios:build \
        :gwt:build \
        -PgwtModule=org.hello.HelloKirin_safari_${CONFIGURATION} \
        -Pconfiguration=${CONFIGURATION} \
        -PbuildDir=build_gradle \
        --no-daemon
fi
