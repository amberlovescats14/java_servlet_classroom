package controllers;

import dao.Ahoy;
import dao.DaoFactory;
import models.AhoyBean;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "create", urlPatterns = "/ahoy/create")
public class CreateAhoyServlet extends HttpServlet {

    @Override
    protected void doGet(
            HttpServletRequest req,
            HttpServletResponse res
    ) {
        try {
            req.getRequestDispatcher("create.jsp").forward(req,res);
        } catch(IOException | ServletException ex) {
            System.out.printf("ERROR: %s\n", ex);
        }
    }


    @Override
    protected void doPost(
            HttpServletRequest req,
            HttpServletResponse res
    ) {
        try {
            // get the object
            Ahoy ahoyDao = DaoFactory.getAhoyDao();

            //create new product with submitted data
            long number = Long.parseLong(req.getParameter("number"));
            String first = req.getParameter("first");
            String last = req.getParameter("last");
            AhoyBean ahoyBean = new AhoyBean(number,first, last);
            System.out.println(first);
            System.out.println(last);
            System.out.println(number);

            //post the new data
            ahoyDao.insert(ahoyBean);
            res.sendRedirect("/ahoy");
        } catch(IOException ex) {
            System.out.printf("ERROR: %s\n", ex);
        }
    }
}
