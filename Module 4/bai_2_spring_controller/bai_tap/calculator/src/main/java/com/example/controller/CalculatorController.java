package com.example.controller;

import com.example.service.CalculatorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {
    @GetMapping
    public String calculator(@RequestParam(value = "num1") String num1, @RequestParam(value = "num2") String num2,
                             @RequestParam(value = "calculator") String operator, Model model){
        double result = CalculatorService.calculator(Double.parseDouble(num1), Double.parseDouble(num2),operator);
        model.addAttribute("result",result);
        model.addAttribute("operator",operator);
        model.addAttribute("num1",num1);
        model.addAttribute("num2",num2);
        return "result";
    }
}
