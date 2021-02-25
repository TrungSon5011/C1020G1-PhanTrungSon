package com.example.controller;

import com.example.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {
    @Autowired
    private CalculatorService calculatorService;
    @GetMapping
    public String calculator(@RequestParam(value = "number1") double number1, @RequestParam(value = "number2") double number2,
                             @RequestParam(value = "operator") String operator, Model model){
        double result = calculatorService.calculate(number1,number2,operator);
        model.addAttribute("result",result);
        model.addAttribute("operator",operator);
        model.addAttribute("number1",number1);
        model.addAttribute("number2",number2);
        return "result";
    }
}
