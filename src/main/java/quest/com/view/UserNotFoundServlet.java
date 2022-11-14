package quest.com.view;

import quest.com.Route;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "UserNotFoundServlet", value = Route.USER_NOT_FOUND)
public class UserNotFoundServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/user-not-found.jsp").forward(request, response);
    }
}
