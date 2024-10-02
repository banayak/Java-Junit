package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        assertEquals(30,Calculator.add(10,20));
    }

    @Test
    void multiply() {
        assertEquals(30,Calculator.multiply(5,6));
    }
}