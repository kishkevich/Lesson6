package by.itacademy.calculator.Operation;

import java.util.Scanner;

public class Difference implements Operation {
    Scanner scanner = new Scanner(System.in);
    double input = scanner.nextDouble();

    @Override
    public double getResult() {
        return input - input;
    }
}
