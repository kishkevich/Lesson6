package by.itacademy.calculator.Operation;

import by.itacademy.calculator.Exception.DivisionByZeroException;
import java.util.Scanner;

public class Division implements Operation {
    Scanner scanner = new Scanner(System.in);
    double number1 = scanner.nextDouble();
    double number2 = scanner.nextDouble();

    @Override
    public double getResult() throws DivisionByZeroException {
        try {
            if (number2 == 0)
                throw new DivisionByZeroException("Деление на ноль запрещено");
            //System.out.println("Деление на ноль");
        } catch (java.util.InputMismatchException e) {
            System.out.println("Введите число еще раз");
        }

        return number1 / number2;
    }
}
