package by.itacademy.calculator.operation;

import by.itacademy.calculator.Exceptions.DivisionByZeroException;
import by.itacademy.calculator.Exceptions.NegativeNumderException;

public interface Operation {
    double getResult() throws DivisionByZeroException, NegativeNumderException;
}
