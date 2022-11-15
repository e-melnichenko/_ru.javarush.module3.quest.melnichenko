package quest.com.service.game;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import quest.com.service.question.Question;
import quest.com.service.story.Story;

public class Game {
    @Getter
    @Setter(AccessLevel.PACKAGE)
    private Question currentQuestion;

    public Game(Story story)  {
        currentQuestion = story.getStartQuestion();
    }
}
