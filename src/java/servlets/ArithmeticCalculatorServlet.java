/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 760483
 */
public class ArithmeticCalculatorServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String first = request.getParameter("firstNumber");
        String second = request.getParameter("secondNumber");
        String invalidResponse = "Invalid.";
        if (first == null || first.isEmpty() || second == null || second.isEmpty()
                || verifyNumbers(first, second) == false) {
            request.setAttribute("response", invalidResponse);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp")
                .forward(request, response);
            return;
        }
        
        int firstNum = Integer.parseInt(first);
        int secondNum = Integer.parseInt(second);
        int answer = 0;
        
        if (request.getParameter("addition") != null) {
            answer = firstNum + secondNum;
        } else if (request.getParameter("subtraction") != null) {
            answer = firstNum - secondNum;
        } else if (request.getParameter("multiplication") != null) {
            answer = firstNum * secondNum;
        } else if (request.getParameter("modulus") != null) {
            answer = firstNum % secondNum;
        }
        
        String result = "Result: " + answer +".";
        request.setAttribute("response", result);
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp")
                .forward(request, response);
           
    }

    private boolean verifyNumbers(String first, String second) {
        int i;
        for (i = 0; i < first.length(); i++) {
            if (!Character.isDigit(first.charAt(i))){
                return false;
            }
        }
        for (i = 0; i < second.length(); i++) {
            if (!Character.isDigit(second.charAt(i))){
                return false;
            }
        }
        return true;
    }
}
