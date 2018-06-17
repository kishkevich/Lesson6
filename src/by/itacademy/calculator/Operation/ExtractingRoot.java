package by.itacademy.calculator.operation;

import by.itacademy.calculator.Main;
import by.itacademy.calculator.Exceptions.NegativeNumderException;

import java.util.logging.Logger;

public class ExtractingRoot extends KeyBoardOperation implements Operation {
    @Override
    public double getResult() throws NegativeNumderException {
        Logger logger = Logger.getLogger(Main.class.getName());

        try {
            if (input().read() <=0)
                throw new NegativeNumderException("Extracting a root from a negative number");
        } catch (ArithmeticException e){
            logger.info("Exception:" + e);
        }
        return Math.sqrt(input().read());
    }
}
