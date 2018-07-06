package com.knoldus;

public class Operation {
    
    public static int calculate(Character operator, int firstNumber, int secondNumber) {
        
        int result;
        
        switch (operator) {
            
            case '+':
                result = add(firstNumber, secondNumber);
                break;
            
            case '-':
                result = subtract(firstNumber, secondNumber);
                break;
            
            case '/':
                result = divide(firstNumber, secondNumber);
                break;
            
            case '*':
                result = multiply(firstNumber, secondNumber);
                break;
                
            default: result = 0;
        }
        
        return result;
    }
    
    private static int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
    
    private static int subtract(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }
    
    private static int divide(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }
    
    private static int multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }
    
}
