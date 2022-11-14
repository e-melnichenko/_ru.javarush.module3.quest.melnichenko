package quest.com.service.auth;

import quest.com.Route;
import quest.com.repository.UsersTable;
import quest.com.service.user.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

import static java.util.Objects.isNull;

@WebServlet(name = "SignInServlet", value = Route.SIGN_IN)
public class SignInServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userName = request.getParameter("name");
        String userPassword = request.getParameter("password");
        User user = UsersTable.getInstance().getUserByNameAndPassword(userName, userPassword);

        if(isNull(user)) {
            response.sendRedirect(Route.USER_NOT_FOUND);
            return;
        }

        HttpSession session = request.getSession();
        session.setAttribute("user", user);
        response.sendRedirect(Route.HOME);
    }
}
