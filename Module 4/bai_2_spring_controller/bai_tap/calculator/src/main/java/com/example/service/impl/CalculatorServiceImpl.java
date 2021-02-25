package com.example.service.impl;

import com.example.service.CalculatorService;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    public  double calculate(double number1, double number2, String operator){
        double result = 0;
        if(operator.equalsIgnoreCase("addition")){
            result = number1 + number2;
        }else if(operator.equalsIgnoreCase("subtraction")){
            result = number1 - number2;
        }else if(operator.equalsIgnoreCase("multiplication")){
            result = number1* number2;
        }else {
            result = number1/number2;
        }
        return result;
    }
}
