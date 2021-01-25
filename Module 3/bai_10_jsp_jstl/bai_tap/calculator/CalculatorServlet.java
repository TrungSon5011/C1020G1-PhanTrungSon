package bai_tap.calculator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CalculatorServlet", urlPatterns = "/simple_calculator")
public class CalculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double firstNum = Double.parseDouble(request.getParameter("firstNumber"));
        double secondNum = Double.parseDouble(request.getParameter("secondNumber"));
        String operator = request.getParameter("operator");
        double result = 0;
        int check = 0;
        try {
            result = Calculator.calculate(firstNum,secondNum,operator);
        } catch (Exception e) {
            check = 1;
        }
        request.setAttribute("firstNum", firstNum);
        request.setAttribute("secondNum", secondNum);
        request.setAttribute("operator", operator);
        request.setAttribute("operator2Number", result);
        request.setAttribute("check", check);
        request.getRequestDispatcher("result.jsp").forward(request, response);
    }
}
