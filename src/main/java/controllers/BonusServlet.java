package controllers;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "bonus", urlPatterns = "/name")
public class BonusServlet extends HttpServlet {

    @Override
    protected void doGet(
            HttpServletRequest req,
            HttpServletResponse res
    ) {
        res.setContentType("text/html");
        try {
            PrintWriter writer = res.getWriter();
            writer.println("<h1>test</h1>");
        } catch(IOException ex) {
            System.out.printf("ERROR: %s\n", ex);
        }
    }
}
