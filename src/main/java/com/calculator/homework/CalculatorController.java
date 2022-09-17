package com.calculator.homework;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    private final CalculatorServicInterface calculator;
    public CalculatorController (CalculatorServicInterface calculator){
        this.calculator = calculator;
    }
    @GetMapping
    public String hello (){
        return calculator.hello();
    }
    @GetMapping(path = "/calculator")
    public String helloCalculator (){
        return calculator.helloCalculator();
    }
    @GetMapping(path = "/calculator/plus")
    public String plusCalculator (@RequestParam (name = "num1",required = false) Integer num1,
                                  @RequestParam (name ="num2",required = false) Integer num2){

        if (num1 == null || num2 == null) {
            return " Не введен какой то из параметров !!!!";
          } else {
           return " Результат сложения чисел " + num1 + " + " + num2 + " = "
                                            + calculator.plusCalculator(num1,num2);

        }
    }
    @GetMapping(path = "/calculator/minus")
    public String minusCalculator (@RequestParam (name = "num1",required = false) Integer num1,
                                   @RequestParam (name ="num2",required = false) Integer num2){

        if (num1 == null || num2 == null) {
            return " Не введен какой то из параметров !!!!";
          } else {
            return " Результат вычитания чисел " + num1 + " - " + num2 + " = "
                                            + calculator.minusCalculator(num1,num2);
        }
    }
    @GetMapping(path = "/calculator/multiply")
    public String multiplyCalculator (@RequestParam (name = "num1",required = false) Integer num1,
                                      @RequestParam (name ="num2",required = false) Integer num2){
        if (num1 == null || num2 == null) {
            return " Не введен какой то из параметров !!!!";
          } else {
            return  " Результат умножения чисел " + num1 + " * " + num2 + " = "
                                           + calculator.multiplyCalculator(num1,num2);
        }
    }
    @GetMapping(path = "/calculator/divide")
    public String divideCalculator (@RequestParam (name = "num1",required = false) Integer num1,
                                    @RequestParam (name ="num2",required = false) Integer num2){
        if (num1 == null || num2 == null) {
            return " Не введен какой то из параметров !!!!"; }
        if (num2 != 0) {
            return " Результат деления чисел " + num1 + " / " + num2 + " = "
                                               + calculator.divideCalculator(num1, num2);
            } else { return " Делить на 0 нельзя !"; }
     }
    private boolean isInteger(String value1, String value2 ) {
        if ( value1 == "" || value2 == ""){
            return true;
        }
        if ((int)Integer.parseInt(value1) != Integer.parseInt(value1)
                                || (int)Integer.parseInt(value2) != Integer.parseInt(value2)) {
            return true;
        }
        return false;
    }
}
