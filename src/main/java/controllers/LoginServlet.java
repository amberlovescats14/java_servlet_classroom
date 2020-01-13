package controllers;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "login", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(
            HttpServletRequest req,
            HttpServletResponse res
    ) {

    }

    @Override
    protected void doPost(
            HttpServletRequest req,
            HttpServletResponse res
    ){
        try {
            String username = req.getParameter("username");
            String password = req.getParameter("password");
            if(username.equals("admin"))
                if(password.equals("password")){
                    req.setAttribute("user", username);
                    req.getRequestDispatcher("/profile.jsp").forward(req,res);
                }


                  req.setAttribute("alert", true);
//            req.getRequestDispatcher("/login.jsp").forward(req,res);

        } catch(IOException | ServletException ex) {
            System.out.printf("ERROR: %s\n", ex);
        }
    }


}
