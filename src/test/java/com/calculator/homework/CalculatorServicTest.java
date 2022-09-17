package com.calculator.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServicTest {

    private CalculatorServic servic = new CalculatorServic();
    @Test
    void hello() {
        servic.hello();
       //  http://localhost:8080
        System.out.println("тест пройден !");
    }

    @Test
    void helloCalculator() {
        servic.helloCalculator();
       // http://localhost:8080/calculator
        System.out.println("тест пройден !");
    }

    @Test
    void plusCalculator() {
        var result = servic.plusCalculator(5,-3);
        assertEquals(2,result);
            result = servic.plusCalculator(5,3);
        assertEquals(8,result);
        System.out.println("тест пройден !");
    }

    @Test
    void minusCalculator() {
        assertEquals(8,servic.minusCalculator(5,-3));
        assertEquals(5,servic.minusCalculator(8,3));
        System.out.println("тест пройден !");
    }

    @Test
    void multiplyCalculator() {
        assertEquals(-15,servic.multiplyCalculator(5,-3));
        assertEquals(20,servic.multiplyCalculator(5,4));
        System.out.println("тест пройден !");
    }

    @Test
    void divideCalculator() {
        var result = servic.divideCalculator(2,2);
        assertEquals(1,result);
            result = servic.divideCalculator(9,-2);
        assertEquals(-4.5,result);
        System.out.println("тест пройден !");
    }
}