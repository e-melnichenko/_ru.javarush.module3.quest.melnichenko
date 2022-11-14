package quest.com.service.game;

import quest.com.Route;
import quest.com.service.answer.Answer;
import quest.com.service.answer.AnswerType;
import quest.com.service.answer.NextQuestionAnswer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
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
        } else if(answer.is(AnswerType.NEXT_QUESTION)) {
            NextQuestionAnswer nextQuestionAnswer = (NextQuestionAnswer) answer;
            game.setCurrentQuestion(nextQuestionAnswer.getNextQuestion());
            response.sendRedirect(Route.GAME);
        }
    }
}
