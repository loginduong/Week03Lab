
package servlets;

import java.io.IOException;
import java.util.InputMismatchException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 760483
 */
public class AgeCalculatorServlet extends HttpServlet {

 
  

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp")
                .forward(request, response);
    }

  
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String age = request.getParameter("inputAge");
        request.setAttribute("inputAgeValue", age);
        String empty = "You must give your current age.";
        String mismatch = "You must enter a number.";
        if (age == null || age.isEmpty()) {
            request.setAttribute("response", empty);
            
            getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp")
                .forward(request, response);
            return;
        }
        
        if (!verifyAge(age)) {
            request.setAttribute("response", mismatch);
            
            getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp")
                .forward(request, response);
            return;
        }
        
        String calculatedResponse = "Your age next birthday will be " + Integer.parseInt(age) +".";
        request.setAttribute("response", calculatedResponse);
        getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp")
                .forward(request, response);
    }
    
    private boolean verifyAge(String age) {
        for (int i = 0; i < age.length(); i++) {
            if (!Character.isDigit(age.charAt(i))) {
                return false;
            }
        }
        return true;
    }


}
