package controllers.contacts;

import dao.Contacts;
import dao.DaoFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "delete", urlPatterns = "/contact/delete")
public class DeleteContactServlet extends HttpServlet {

    protected void doGet(
            HttpServletRequest req,
            HttpServletResponse res
    ) {
        try {
            req.setAttribute("id", req.getParameter("id"));
            req.getRequestDispatcher("/contacts/deleteContact.jsp").forward(req,res);
        } catch(IOException | ServletException ex) {
            System.out.printf("ERROR: %s\n", ex);
        }

    }

    protected void doPost(
            HttpServletRequest req,
            HttpServletResponse res
    ) {
        try {
            long id = Long.parseLong(req.getParameter("id"));

            Contacts contactDao = DaoFactory.getContactsDao();
            contactDao.deleteContactById(id);

            res.sendRedirect("/contact");
        } catch(IOException ex) {
            System.out.printf("ERROR: %s\n", ex);
        }


    }
}
