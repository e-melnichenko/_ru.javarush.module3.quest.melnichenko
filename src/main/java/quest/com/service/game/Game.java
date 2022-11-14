package quest.com.service.game;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import quest.com.service.answer.*;
import quest.com.service.question.Question;
import quest.com.service.story.Story;
import quest.com.service.storyline.Storyline;

import java.util.ArrayList;
import java.util.Arrays;

public class Game {
    @Getter
    @Setter(AccessLevel.PACKAGE)
    private Question currentQuestion;

    public Game() {
        Story story = createStory();
        currentQuestion = story.start();
    }

    private Story createStory() {
        Storyline storyline = new Storyline("my storyline");
        storyline
                .addQuestion("quest 1")
                .addLoseAnswer("lose answer", "lose text")
                .addWinAnswer("win answer", "win text")
                .addNextQuestionAnswer("next question")
                .addQuestion("quetsion 2")
                .addWinAnswer("win answer", "win text");

        return new Story("my-story", storyline);
    }
}
