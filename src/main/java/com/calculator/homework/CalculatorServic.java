package com.calculator.homework;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServic implements CalculatorServicInterface{

    public String hello(){
        return "<b> Введите в адресную строку  http://localhost:8080/calculator  или дополните просто словом  /calculator  </b>";
    }

    public String helloCalculator(){
        return "<b>    Добро пожаловать в калькулятор ! ) </b>";
    }
    public String plusCalculator (String num1, String num2){

         int a = Integer.valueOf(num1);
         int b = Integer.valueOf(num2);
         return " Результат сложения чисел " + num1 + " + " + num2 + " = " + (a + b);

    }
    public String minusCalculator (String num1, String num2) {

        int a = Integer.valueOf(num1);
        int b = Integer.valueOf(num2);
        return " Результат вычитания чисел " + num1 + " - " + num2 + " = " + (a - b);
    }
    public String multiplyCalculator (String num1, String num2) {

        int a = Integer.valueOf(num1);
        int b = Integer.valueOf(num2);
        return " Результат умножения чисел " + num1 + " * " + num2 + " = " + (a * b);
    }
    public String divideCalculator (String num1, String num2) {

        int a = Integer.valueOf(num1);
        int b = Integer.valueOf(num2);
        if (b != 0){
        return " Результат деления чисел " + num1 + " / " + num2 + " = " + (a / (b * 1.0) );
        }
        return  " На Ноль делить нельзя !!!";
    }
//    private boolean isInteger(String value) {
//        if ((int)Integer.parseInt(value) == Integer.parseInt(value)) {
//            return true;
//        }
//        return false;
//    }
}
