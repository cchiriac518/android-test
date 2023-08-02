package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class DivisionTest {

    @Test
    public void testDivide() {
        Division division = new Division();
        double result = division.divide(10, 2);
        assertEquals(5.0, result, 0.001);
    }

    @Test
    public void testDivideByZero() {
        Division division = new Division();
        assertThrows(IllegalArgumentException.class, () -> division.divide(10, 0));
    }
}
