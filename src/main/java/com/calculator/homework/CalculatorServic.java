package com.calculator.homework;

import exception.CalculatorWrongParameterException;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServic implements CalculatorServicInterface {
    @Override
    public String hello() {
        return "<b> Введите в адресную строку  http://localhost:8080/calculator  или дополните " +
                                                                   "просто словом  /calculator  </b>";
    }
    @Override
    public String helloCalculator() {
        return "<b>    Добро пожаловать в калькулятор ! ) </b>";
    }

    @Override
    public Integer plusCalculator(Integer num1, Integer num2) {
//        Integer um1 =  Integer.valueOf(num1); // перевод со стринг в интеджер
//        Integer um2 =  Integer.valueOf(num2);
//                 return  um1 + um2;
        return num1 + num2;
    }
    @Override
    public Integer minusCalculator(Integer num1, Integer num2) {
        return num1 - num2;
    }
    @Override
    public Integer multiplyCalculator(Integer num1, Integer num2) {
        return  num1 * num2;
    }
    @Override
    public Double divideCalculator(Integer num1, Integer num2) {
        if (num2 == 0){
            throw  new CalculatorWrongParameterException(" Нельзя делить на ноль !");
        }

        return  num1 / (num2 * 1.0);
    }
}
