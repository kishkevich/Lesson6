IF NOT EXIST bin MKDIR bin
javac -sourcepath ./src -d bin src/by\itacademy\calculator\*.java src/by\itacademy\calc\Exception\*.java src/by\itacademy\calc\Operation\*.java
java -classpath ./bin by.itacademy.calculator.Main
pause