package by.itacademy.calculator.operation;

public class Inversion extends KeyBoardOperation implements Operation {
    @Override
    public double getResult()  {
        return (-input().read());
    }
}
