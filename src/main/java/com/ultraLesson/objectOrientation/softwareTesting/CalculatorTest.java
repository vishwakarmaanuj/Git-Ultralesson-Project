package com.ultraLesson.objectOrientation.softwareTesting;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    private void testAdditionOfTwoNumbers(){
        //Arrange
        int number1 = 1;
        int number2 = 2;

        //Act
        Calculator calculator = new Calculator();
        int addition = calculator.add(number1, number2);

        //Assert
        Assert.assertEquals(addition, 3);
    }

    @Test
    private void testSubtractionOfTwoNumbers(){
        int number1 = 3;
        int number2 = 2;

        Calculator calculator = new Calculator();
        int value = calculator.subtract(number1, number2);

        Assert.assertEquals(value, 1);
    }

    @Test
    private void testMultiplicationOfTwoNumbers(){
        int number1 = 3;
        int number2 = 2;

        Calculator calculator = new Calculator();
        int value = calculator.multiply(number1, number2);

        Assert.assertEquals(value, 6);
    }

    @Test
    private void testPercentageCalculation(){
        int number = 3;
        int total = 10;

        Calculator calculator = new Calculator();
        double value = calculator.percentage(number, total);

        Assert.assertEquals(value, 30);
    }

    @Test
    private void testSquareOfANumber(){
        int number = 3;

        Calculator calculator = new Calculator();
        int value = calculator.square(number);

        Assert.assertEquals(value, 9);
    }
}
