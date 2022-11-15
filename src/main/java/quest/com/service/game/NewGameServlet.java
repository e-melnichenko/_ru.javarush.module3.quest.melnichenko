package quest.com.service.game;

import quest.com.Route;
import quest.com.service.user.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "NewGameServlet", value = Route.NEW_GAME)
public class NewGameServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        session.setAttribute("game", new Game());
        User user = (User) session.getAttribute("user");
        user.setGamesCount(user.getGamesCount() + 1);

        response.sendRedirect(Route.GAME);
    }
}
