package by.itacademy.calculator;

import java.util.Scanner;
import by.itacademy.calculator.Exception.*;
import by.itacademy.calculator.Operation.*;

public class Main {
    public static void main(String[] args) throws NegativeNumberException {
        System.out.println("Выберите операцию 1-сложение,2- вычитание, 3-умножение, 4-деление,5-инверсия,6-извлечение корня");
        Scanner scanner = new Scanner(System.in);
        int in = scanner.nextInt();
        switch (in) {
            case 1:
                Addition addition = new Addition();
                System.out.println(addition.getResult());
                break;
            case 2:
                Difference difference = new Difference();
                System.out.println (difference.getResult());
                break;
            case 3:
                Multiplication multiplication = new Multiplication();
                System.out.println (multiplication.getResult());
                break;
            case 4:
                Division division = new Division();
                try {
                    System.out.println (division.getResult());
                } catch (DivisionByZeroException e) {
                    e.printStackTrace();
                }
                break;
            case 5:
                Inversion inversion = new Inversion();
                System.out.println (inversion.getResult());
                break;

            case 6:
                ExtractingRoot extractingRoot = new ExtractingRoot();
                System.out.println (extractingRoot.getResult());
                break;
        }
    }
}
