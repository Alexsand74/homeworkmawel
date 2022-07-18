package com.calculator.homework;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServic implements CalculatorServicInterface {

    public String hello() {
        return "<b> Введите в адресную строку  http://localhost:8080/calculator  или дополните " +
                                                                   "просто словом  /calculator  </b>";
    }

    public String helloCalculator() {
        return "<b>    Добро пожаловать в калькулятор ! ) </b>";
    }

    public Integer plusCalculator(Integer num1, Integer num2) {
         return  num1 + num2;
    }

    public Integer minusCalculator(Integer num1, Integer num2) {
        return num1 - num2;
    }

    public Integer multiplyCalculator(Integer num1, Integer num2) {
        return  num1 * num2;
    }

    public Double divideCalculator(Integer num1, Integer num2) {
            return  num1 / (num2 * 1.0);
    }
}
