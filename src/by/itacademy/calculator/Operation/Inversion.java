package by.itacademy.calculator.Operation;

import java.util.Scanner;

public class Inversion implements Operation {
    Scanner scanner = new Scanner(System.in);
    double number = scanner.nextDouble();

    @Override
    public double getResult()  {
        return (-number);
    }
}
