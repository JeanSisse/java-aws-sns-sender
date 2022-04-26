#!/bin/bash
export CLASSPATH=target/java-aws-sns-0.0.1-SNAPSHOT.jar
export className=JavaAwsSnsApplication
echo "## Running $className..."
shift
mvn exec:java -Dexec.mainClass="br.com.jean.app.$className"