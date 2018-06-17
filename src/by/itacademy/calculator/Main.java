package by.itacademy.calculator;

import by.itacademy.calculator.Exceptions.DivisionByZeroException;
import by.itacademy.calculator.Exceptions.NegativeNumderException;
import by.itacademy.calculator.menu.MenuItems;
import by.itacademy.calculator.operation.Operation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NegativeNumderException, DivisionByZeroException {
        MenuItems menu = new MenuItems();
        System.out.println("Выберите операцию 1-сложение,2- вычитание, 3-деление, 4-умножение, 5-инверсия,6-извлечь корня");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        Operation operation = menu.getOperation(i);
        System.out.println(operation.getResult());
    }
}