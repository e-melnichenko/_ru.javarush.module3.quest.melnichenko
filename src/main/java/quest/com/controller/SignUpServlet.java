package quest.com.controller;

import quest.com.repository.UserTable;
import quest.com.service.user.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "SignUpServlet", value = Route.SIGN_UP)
public class SignUpServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userName = request.getParameter("name");
        String userPassword = request.getParameter("password");
        User user = new User(userName, userPassword);
        UserTable.getInstance().add(user);

        HttpSession session = request.getSession();
        session.setAttribute("user", user);
        response.sendRedirect(Route.HOME);
    }
}
