package by.itacademy.calculator.operation;

public abstract class KeyBoardOperation implements Operation {
    private OperandInput input = new KeyBoardInput();

    public OperandInput input(){
        return input;
    }
}