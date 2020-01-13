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
import java.util.List;

@WebServlet(name = "show all", urlPatterns = "/ahoy")
public class ShowAhoyServlet extends HttpServlet {


    protected void doGet(
            HttpServletRequest req,
            HttpServletResponse res
    ){
        res.setContentType("text/html");
        try {
            //get the object
            Ahoy ahoyDao = DaoFactory.getAhoyDao();

            //use the method to get all
            List<AhoyBean> allAhoy = ahoyDao.getAll();

            //pass data to jsp
            req.setAttribute("allAhoy", allAhoy);
            req.getRequestDispatcher("/ahoy/all.jsp").forward(req,res);

        } catch(IOException | ServletException ex) {
            System.out.printf("ERROR: %s\n", ex);
        }
    }
}












//    @Override
//    protected void doGet(
//            HttpServletRequest req,
//            HttpServletResponse res
//    ) {
//        res.setContentType("text/html");
//        try {
//            String name = req.getParameter("name");
//            if(req.getParameter("name").equals("bgates")){
//                res.sendRedirect("www.microsoft.com");
//                return;
//            }
//            if(name.isEmpty()) name = "World";
//
//            req.setAttribute("name", name);
//            req.getRequestDispatcher("/hello.jsp").forward(req, res);
//
//
//        } catch(IOException | ServletException ex) {
//            System.out.printf("ERROR: %s\n", ex);
//        }
//    }