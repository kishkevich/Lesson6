IF NOT EXIST bin MKDIR bin
javac -encoding utf8 -sourcepath src -d bin src/by/itacademy/calculator/Main.java
java -classpath bin by.itacademy.calculator.Main
pause