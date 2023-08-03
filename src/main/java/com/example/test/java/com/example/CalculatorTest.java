package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.function.Executable;

public class CalculatorTest {

    @Test
    public void testAddition() {
        Calculator calculator = new Calculator();
        int result = calculator.add(3, 4);
        assertEquals(7, result);
    }

    @Test
    public void testSubtraction() {
        Calculator calculator = new Calculator();
        int result = calculator.subtract(7, 2);
        assertEquals(5, result);
    }

    @Test
    public void testMultiplication() {
        Calculator calculator = new Calculator();
        int result = calculator.multiply(5, 6);
        assertEquals(30, result);
    }

    @Test
    public void testDivision() {
        Calculator calculator = new Calculator();
        double result = calculator.divide(10, 3);
        assertEquals(3.333, result, 0.001);
    }

    @Test
    public void testDivisionByZero() {
        Calculator calculator = new Calculator();
        Executable executable = () -> calculator.divide(10, 0);
        assertThrows(ArithmeticException.class, executable);
    }
}
