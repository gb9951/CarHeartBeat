#!/bin/bash
echo "Removing Old Class Files..."
rm bin/*.class
echo "Old Class Files Removed..."
echo "Compiling CarHeartBeat Source Files..."
javac src/*.java
echo "Compilation Complete..."
echo "Moving Class Files to Runtime Directory..."
mv src/*.class bin/
echo "Class Files moved to Runtime Director..."
echo "Running Class Files..."
java -cp bin CarHeartBeatMain