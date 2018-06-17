package by.itacademy.calculator.operation;

import java.util.Scanner;

public class KeyBoardInput implements OperandInput {
    private Scanner scanner = new Scanner(System.in);

    @Override
    public double read() {
        return scanner.nextDouble();
    }
}
