package quest.com.controller;

import quest.com.service.game.Game;
import quest.com.service.user.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

import static java.util.Objects.isNull;

@WebServlet(name = "StartServlet", value = "/start")
public class StartServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");

        if(isNull(user)) {
            response.sendRedirect("/register.jsp");
            return;
        }

        Game game = (Game) session.getAttribute("game");

        if(isNull(game)) {
            session.setAttribute("game", new Game());
        }

        response.sendRedirect("_index.jsp");
    }
}
