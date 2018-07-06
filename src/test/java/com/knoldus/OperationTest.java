package com.knoldus;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OperationTest {
    
    //private static Operation operation;
    
    @BeforeClass
    public static void setUp() {
        //No-op
    }
    
    @Test
    public void testCalculateForAddition() {
        int actualResult = Operation.calculate('+', 10, 10);
        assertEquals(20, actualResult);
    }
    
    @Test
    public void testCalculateForSubtraction() {
        int actualResult = Operation.calculate('-', 10, 10);
        assertEquals(0, actualResult);
    }
    
    @Test
    public void testCalculateForDivision() {
        int actualResult = Operation.calculate('/', 10, 10);
        assertEquals(1, actualResult);
    }
    
    @Test
    public void testCalculateForMultiplication() {
        int actualResult = Operation.calculate('*', 10, 10);
        assertEquals(100, actualResult);
    }
    
    @Test
    public void testCalculateForDefaultCase() {
        int actualResult = Operation.calculate('?', 10, 10);
        assertEquals(0, actualResult);
    }
}
