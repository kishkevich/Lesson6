package by.itacademy.calculator.operation;

public class Diff extends KeyBoardOperation implements Operation {

    @Override
    public double getResult() {
        return input().read() - input().read();
    }
}