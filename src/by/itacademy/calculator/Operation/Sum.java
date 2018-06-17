package by.itacademy.calculator.operation;

import by.itacademy.calculator.operation.KeyBoardOperation;
import by.itacademy.calculator.operation.Operation;

public class Sum extends KeyBoardOperation implements Operation {


    @Override
    public double getResult() {
        System.out.println("Введите числа");
        return input().read() + input().read();
    }
}