package com.example.controller;

import com.example.service.CalculatorService;
import com.example.service.CalculatorServiceImpl;
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
    public String calculator(@RequestParam(value = "number1") double num1, @RequestParam(value = "number2") double num2,
                             @RequestParam(value = "operator") String operator, Model model){
        double result = calculatorService.calculator(num1,num2,operator);
        model.addAttribute("result",result);
        model.addAttribute("operator",operator);
        model.addAttribute("number1",num1);
        model.addAttribute("number2",num2);
        return "result";
    }
}
