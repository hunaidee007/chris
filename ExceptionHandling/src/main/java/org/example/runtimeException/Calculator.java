package org.example.runtimeException;

import org.example.MoreThan100Exception;
import org.example.NegativeValueException;

public class Calculator {

    public int add(int i, int j) {
        i = i/j;
        return i+j;
    }
}
