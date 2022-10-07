package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import java.util.concurrent.Callable;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {

    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    }
    @Test
    public void testSubstract() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int substractResult = calculator.subtract(a, b);
        assertEquals(-3, substractResult);
    }
    @Test
    public void testSquared() {
        Calculator calculator = new Calculator();
        int a = 5;
        int squaredResult = calculator.squared(a);
        assertEquals(25, squaredResult);
    }
}