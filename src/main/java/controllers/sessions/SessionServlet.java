package controllers.sessions;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "SessionServlet", urlPatterns = "/session/demo")
public class SessionServlet extends HttpServlet {
    protected void doGet(
            HttpServletRequest req,
            HttpServletResponse res) {

        try {

            HttpSession session = req.getSession();

            //set interval 1800:
            session.setMaxInactiveInterval(5);

            //create cart
            Cart cart = new Cart();
            cart.setNumItems(3);

            session.setAttribute("cart", cart);
            session.setAttribute("session", "I am session");

            //!!
            //setting a req attribute
            req.setAttribute("reqAtt", "I am request");


            // set context attribute
            ServletContext context = getServletContext();
            context.setAttribute("context", "i am in context");

            req.getRequestDispatcher("session.jsp").forward(req, res);



        } catch(IOException | ServletException ex) {
            System.out.printf("ERROR: %s\n", ex);
        }

    }


}
