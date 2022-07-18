package com.calculator.homework;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    @GetMapping
    public String helloWork(){
        return "<b> Весь код лежит на дополнительной ветке !!! </b>";
    }
}
