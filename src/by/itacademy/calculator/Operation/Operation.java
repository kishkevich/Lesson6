package by.itacademy.calculator.Operation;

import by.itacademy.calculator.Exception.DivisionByZeroException;
import by.itacademy.calculator.Exception.NegativeNumberException;


public interface Operation {
    double getResult() throws DivisionByZeroException, NegativeNumberException;
}
