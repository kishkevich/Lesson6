package by.itacademy.calculator.operation;

import by.itacademy.calculator.Exceptions.DivisionByZeroException;
import by.itacademy.calculator.Main;

import java.util.logging.Logger;

public class Division extends KeyBoardOperation implements Operation {
    Logger logger = Logger.getLogger(Main.class.getName());

    @Override
    public double getResult() throws DivisionByZeroException {
        try {
            if (input().read() == 0)
                throw new DivisionByZeroException("division by zero is forbidden");
        } catch (ArithmeticException e) {
            logger.info("Exception:" + e);
        }

        return input().read()/ input().read();
    }
}