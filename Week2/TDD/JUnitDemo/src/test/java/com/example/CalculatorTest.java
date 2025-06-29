package com.example;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calculator;

    // 🛠️ Setup - runs before every @Test method
    @Before
    public void setUp() {
        System.out.println("Setting up Calculator instance...");
        calculator = new Calculator();
    }

    // 🧹 Teardown - runs after every @Test method
    @After
    public void tearDown() {
        System.out.println("Cleaning up after test...");
        calculator = null;
    }

    @Test
    public void testAddition() {
        // Arrange
        int a = 10;
        int b = 20;

        // Act
        int result = calculator.add(a, b);

        // Assert
        assertEquals(30, result);
    }

    @Test
    public void testSubtraction() {
        // Arrange
        int a = 20;
        int b = 5;

        // Act
        int result = calculator.subtract(a, b);

        // Assert
        assertEquals(15, result);
    }
}
