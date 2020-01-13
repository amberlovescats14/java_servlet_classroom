package controllers.contacts;

import dao.Contacts;
import dao.DaoFactory;
import models.Contact;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "addContact" , urlPatterns = "/contact/create")
public class SaveContactServlet extends HttpServlet {

    @Override
    protected void doGet(
            HttpServletRequest req,
            HttpServletResponse res
    ) {
        try {
            if(req.getParameter("alert") != null)
                req.setAttribute("alert", true);
            req.getRequestDispatcher("/contacts/createContact.jsp").forward(req,res);
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
            Contacts contactsDao = DaoFactory.getContactsDao();

            String firstName = req.getParameter("first");
            String lastName = req.getParameter("last");
            String phoneNumber = trimPhoneNumber(req.getParameter("number"));
            if(phoneNumber.length() == 10){
                Contact contact = new Contact(firstName, lastName, phoneNumber);
                contactsDao.saveContact(contact);
                res.sendRedirect("/contact");
                return;
            }
            res.sendRedirect("/contact/create?alert");


        } catch(IOException  ex) {
            System.out.printf("ERROR: %s\n", ex);
        }

    }

    private String trimPhoneNumber(String number){
        String result = "";
        for (int i = 0; i < number.length(); i++) {
            char letter = number.charAt(i);
            if(Character.isDigit(letter)) {
                String addLetter = String.valueOf(number.charAt(i));
                 result += addLetter;
            }
        }
        return result;
    }


}
