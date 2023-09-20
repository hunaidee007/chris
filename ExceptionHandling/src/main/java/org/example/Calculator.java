package org.example;

public class Calculator {

    public int add(int i, int j) throws NegativeValueException, MoreThan100Exception {
        if (i < 0 || j < 0) {
            throw new NegativeValueException("Negative values passed, I cannot do addition");
        } else if (i > 100 || j > 100) {
            throw new MoreThan100Exception("Value more than 100, I cannot do addition");
        }
        return i + j;
    }
}
