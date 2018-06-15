package by.itacademy.calculator.Operation;

import java.util.Scanner;

public class Addition implements Operation {
    Scanner scanner = new Scanner(System.in);
    double number1 = scanner.nextDouble();
    double number2 = scanner.nextDouble();

    @Override
    public double getResult() {
        return number1 + number2;
    }
}
