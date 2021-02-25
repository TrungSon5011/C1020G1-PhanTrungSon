package com.example.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    public  double calculator(double num1, double num2, String operator){
        double result = 0;
        if(operator.equalsIgnoreCase("addition")){
            result = num1 + num2;
        }else if(operator.equalsIgnoreCase("subtraction")){
            result = num1 - num2;
        }else if(operator.equalsIgnoreCase("multiplication")){
            result = num1* num2;
        }else {
            result = num1/num2;
        }
        return result;
    }
}
