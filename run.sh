#!/bin/bash

# Compile the application.
find src/main/java/AjavLuncher/ -name "*.java" > src.txt
mkdir -p out
javac -d out @src.txt

# Launch the application with the scenario file as argument.
java -classpath out src/main/java/AjavLuncher/Main.java scenario.txt
