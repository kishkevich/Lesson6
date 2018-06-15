package by.itacademy.calculator.Operation;

import java.util.Scanner;
import by.itacademy.calculator.Exception.NegativeNumberException;

public class ExtractingRoot implements Operation {
    Scanner scanner = new Scanner(System.in);
    double input = scanner.nextDouble();

    @Override
    public double getResult() throws NegativeNumberException {
        try {
            if (input <=0)
                throw new NegativeNumberException("Извлечение корня из отрицательного числа");
        } catch (ArithmeticException e){
            System.err.println("Введите число еще раз");
        }

        return Math.sqrt(input);
    }
}
