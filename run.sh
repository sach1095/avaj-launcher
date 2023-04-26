#!/bin/bash

# Compile the application.
find ./src -name "*.java" > sources.txt
mkdir -p out
javac -d out @sources.txt

# Launch the application with the scenario file as argument.
java -classpath out src/Main.java scenario.txt
