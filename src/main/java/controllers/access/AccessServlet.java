package controllers.access;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "AccessServlet", urlPatterns = "/access")
public class AccessServlet extends HttpServlet {


    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        req.getSession().setAttribute("access_code", "br548");
        req.getRequestDispatcher("/WEB-INF/sessions/access.jsp").forward(req,res);

    }


    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

    }
}
