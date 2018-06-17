package by.itacademy.calculator.operation;

public class Multuplication extends KeyBoardOperation implements Operation {
    @Override
    public double getResult() {
        return input().read()*input().read();
    }
}
