package JavaEE;

import JavaEE.Entity.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "HelloServlet")
public class HelloServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        User user = new User("Tom", 34);
        request.setAttribute("user", user);

        getServletContext()
                .getRequestDispatcher("/hello.jsp")
                .forward(request, response);
    }
}
