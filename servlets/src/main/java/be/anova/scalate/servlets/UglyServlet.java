package be.anova.scalate.servlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Just a little, ugly servlet
 */
public class UglyServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // START SNIPPET: rd
        RequestDispatcher dispatcher = request.getRequestDispatcher("/ssp_page");
        dispatcher.forward(request, response);
        // END SNIPPET: rd
    }
}
