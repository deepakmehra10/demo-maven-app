package com.knoldus;

public class SampleApp {
    
    public static void main(String[] args) {
        
        // Add two number
        int addResult = Operation.calculate('+', 10, 10);
        System.out.println("Adding two numbers - " + addResult);
        
        // Subtract two number
        int subtractResult = Operation.calculate('-', 10, 10);
        System.out.println("Subtracting two numbers - " + subtractResult);
        
        // Divide two numbers
        int divideResult = Operation.calculate('/', 10, 10);
        System.out.println("Dividing two numbers - " + divideResult);
        
        // Multiply two numbers
        int multiplyResult = Operation.calculate('*', 10, 10);
        System.out.println("Multiplying two numbers - " + multiplyResult);
        
        // Default
        int defaultValue = Operation.calculate('?', 10, 10);
        System.out.println("Fall back value - " + defaultValue);
    }
}
