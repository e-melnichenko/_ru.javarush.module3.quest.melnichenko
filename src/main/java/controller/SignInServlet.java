package controller;

import repository.UsersTable;
import service.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

import static java.util.Objects.isNull;

@WebServlet(name = "SignInServlet", value = "/sign-in")
public class SignInServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userName = request.getParameter("name");
        String userPassword = request.getParameter("password");
        User user = UsersTable.getInstance().getUserByNameAndPassword(userName, userPassword);
        if(isNull(user)) {
            response.sendRedirect("/user-not-found.jsp");
            return;
        }

        HttpSession session = request.getSession();
        session.setAttribute("user", user);
        response.sendRedirect("/");
    }
}
