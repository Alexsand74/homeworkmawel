package com.calculator.homework;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    private final CalculatorServicInterface helloServic;
    public CalculatorController (CalculatorServicInterface helloServic){
        this.helloServic = helloServic;
    }
    @GetMapping
    public String hello (){
        return helloServic.hello();
    }
    @GetMapping(path = "/calculator")
    public String helloCalculator (){
        return helloServic.helloCalculator();
    }
    @GetMapping(path = "/calculator/plus")
    public String plusCalculator (@RequestParam (required = true) String num1,@RequestParam (required = true) String num2){
        return helloServic.plusCalculator(num1,num2);
    }
    @GetMapping(path = "/calculator/minus")
    public String minusCalculator (@RequestParam (required = true) String num1,@RequestParam (required = true) String num2){
        return helloServic.minusCalculator(num1,num2);
    }
    @GetMapping(path = "/calculator/multiply")
    public String multiplyCalculator (@RequestParam (required = true) String num1,@RequestParam (required = true) String num2){
        return helloServic. multiplyCalculator(num1,num2);
    }
    @GetMapping(path = "/calculator/divide")
    public String divideCalculator (@RequestParam (required = true) String num1,@RequestParam (required = true) String num2){
        return helloServic.divideCalculator(num1,num2);
    }
}
