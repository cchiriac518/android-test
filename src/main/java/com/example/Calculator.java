package com.example;

public class Calculator {
    public int add(int a, int b) {
        Addition addition = new Addition();
        return addition.add(a, b);
    }

    public int subtract(int a, int b) {
        Subtraction subtraction = new Subtraction();
        return subtraction.subtract(a, b);
    }

    public int multiply(int a, int b) {
        Multiplication multiplication = new Multiplication();
        return multiplication.multiply(a, b);
    }

    public double divide(double a, double b) {
        Division division = new Division();
        return division.divide(a, b);
    }
}
