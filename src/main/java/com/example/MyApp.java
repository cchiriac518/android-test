package com.example;

public class MyApp {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int resultAdd = calculator.add(3, 4);
        System.out.println("Addition Result: " + resultAdd);

        int resultSubtract = calculator.subtract(7, 2);
        System.out.println("Subtraction Result: " + resultSubtract);

        int resultMultiply = calculator.multiply(5, 6);
        System.out.println("Multiplication Result: " + resultMultiply);

        double resultDivide = calculator.divide(10, 3);
        System.out.println("Division Result: " + resultDivide);
    }
}
