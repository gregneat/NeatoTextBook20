@echo off
echo Compiling...
javac *.java 
echo Compile complete
java -cp .; starter
pause
REM this is a comment in a .bat file
REM the following is an explanation of each line of code:
REM @echo off             //tells cmd to not print any comments
REM echo Compiling...     //prints "Compiling..."
REM javac *.java          //javac is Java's compile command; javac *.java means compile all files ending in .java 
REM echo Compile complete //prints "Compile complete"
REM java -cp .; starter   //run the starter class
REM pause                 //trigger the "Press any key to continue..." message when all previous lines have finished
REM written by Ravi Riley