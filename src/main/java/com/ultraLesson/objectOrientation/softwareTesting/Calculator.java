package com.ultraLesson.objectOrientation.softwareTesting;

import org.junit.jupiter.api.Test;

public class Calculator {
    protected  int add(int number1,int number2){
        return number1+number2;
    }
    @Test
    protected  int subtract(int number1,int number2){
        return number1-number2;
    }
    protected  int multiply(int number1,int number2){
        return number1*number2;
    }
    protected  int divide(int number1,int number2){
        return number1/number2;
    }
    protected double percentage(int number, int total) {
        return number * 100 / total;
    }

    public int square(int number) {
        return number * number;
    }

}
