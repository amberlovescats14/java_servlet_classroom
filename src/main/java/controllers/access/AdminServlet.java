package controllers.access;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "AdminServlet", urlPatterns = "/access/admin")
public class AdminServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        // if not logged in, this will re direct REJECT

    }

    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        //get master code
        String sessionCode = (String)req.getSession().getAttribute("access_code");
        // get form code
        String requestCode = req.getParameter("code");


        if(sessionCode == null || requestCode == null){
            req.getRequestDispatcher("/WEB-INF/sessions/rejected.jsp").forward(req,res);
            return;
        }

        if(requestCode.equals(sessionCode)){
            req.getRequestDispatcher("/WEB-INF/sessions/admin.jsp").forward(req,res);
            return;
        }

        else {
            req.getRequestDispatcher("/WEB-INF/sessions/rejected.jsp").forward(req,res);
            return;
        }

    }
}
