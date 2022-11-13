package controller;

import repository.UsersTable;
import service.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "controller.SignUpServlet", value = "/sign-up")
public class SignUpServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userName = request.getParameter("name");
        String userPassword = request.getParameter("password");
        User user = new User(userName, userPassword);
        UsersTable.getInstance().add(user);

        HttpSession session = request.getSession();
        session.setAttribute("user", user);
        response.sendRedirect("/");
    }
}
