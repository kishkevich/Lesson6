package by.itacademy.calculator.menu;

import by.itacademy.calculator.operation.Multuplication;
import by.itacademy.calculator.operation.Operation;
import by.itacademy.calculator.operation.Sum;
import by.itacademy.calculator.operation.Diff;
import by.itacademy.calculator.operation.Division;
import by.itacademy.calculator.operation.Inversion;

import java.util.HashMap;
import java.util.Map;

public class MenuItems {
    Map<Integer, Operation> items = new HashMap<>();


    public Operation getOperation(int i) {

        {
            items.put(1, new Sum());
            items.put(2, new Diff());
            items.put(3, new Division());
            items.put(4, new Multuplication());
            items.put(5, new Inversion());
            items.put(6, new Diff());
        }
        return items.get(i);

    }




}