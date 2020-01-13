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
import java.util.List;

@WebServlet(name = "update", urlPatterns = "/contact/update")
public class UpdateContact extends HttpServlet {

    protected void doGet(
            HttpServletRequest req,
            HttpServletResponse res
    ) {
        try {
            Contacts contactDao = DaoFactory.getContactsDao();
            long id = Long.parseLong(req.getParameter("id"));
            Contact contact = contactDao.getContactById(id);
            if(contact != null){
                req.setAttribute("id", id);
                req.setAttribute("firstName", contact.getFirstName());
                req.setAttribute("lastName", contact.getLastName());
                req.setAttribute("phoneNumber", contact.getPhoneNumber());
                req.getRequestDispatcher("/contacts/updateContact.jsp").forward(req,res);
            }
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
            String firstName = req.getParameter("first");
            String lastName = req.getParameter("last");
            String phoneNumber = trimPhoneNumber(req.getParameter("number"));

            Contact contact = new Contact(id,firstName,lastName,phoneNumber);

            Contacts contactDao = DaoFactory.getContactsDao();
            List<Contact> allContacts = contactDao.getContacts();

            for (int i = 0; i < allContacts.size(); i++) {
                Contact temp = allContacts.get(i);
                if(temp.getId() == contact.getId())  allContacts.set(i, contact);
                break;
            }
            res.sendRedirect("/contact");
        } catch(IOException ex) {
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
