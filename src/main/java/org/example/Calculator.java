package org.example;

public class Calculator {
    static double add(int val1, int val2) {
        /*return DoubleStream.of(operands).sum();*/
        return val1 + val2;
    }

    static double multiply(int val1, int val2) {
        return val1 * val2;
    }
}