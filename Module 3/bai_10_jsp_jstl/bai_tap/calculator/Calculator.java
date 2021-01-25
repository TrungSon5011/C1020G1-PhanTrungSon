package bai_tap.calculator;

public class Calculator {
    public static double calculate(double firstNum, double secondNum, String operator) throws Exception {
        double result = 0;
        if(operator.equals("+")){
            result = firstNum + secondNum;
        }else if(operator.equals("-")){
            result = firstNum - secondNum;
        }else if(operator.equals("x")){
            result = firstNum * secondNum;
        }else {
                if(secondNum != 0){
                result = firstNum / secondNum;
                }
                else {
                    throw new Exception("Cant divide by zero");
                }
        }
        return result;
    }
}
