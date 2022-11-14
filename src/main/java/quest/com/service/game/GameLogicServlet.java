package quest.com.service.game;

import quest.com.Route;
import quest.com.service.answer.Answer;
import quest.com.service.answer.AnswerType;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.UUID;

import static java.util.Objects.isNull;

@WebServlet(name = "GameLogicServlet", value = Route.GAME_ANSWER)
public class GameLogicServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        Game game = (Game) session.getAttribute("game");
        UUID answerId = UUID.fromString(request.getParameter("answerId"));
        System.out.println("answerId: " + answerId);
        Answer answer = game.getCurrentQuestion().getAnswerList().stream()
                .filter(answerItem -> answerId.equals(answerItem.getId()))
                .findFirst()
                .orElse(null);

        if(isNull(answer)) {
//            todo
            System.out.println("answer is null");
        }

        if(answer.is(AnswerType.WIN)) {
            response.sendRedirect(Route.WIN);
        }

    }
}
