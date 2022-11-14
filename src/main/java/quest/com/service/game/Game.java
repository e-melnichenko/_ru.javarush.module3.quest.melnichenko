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
        ArrayList<Answer> answers1 = new ArrayList<>(Arrays.asList(
                new WinAnswer("win answer", AnswerType.WIN, "you win!")
        ));
        ArrayList<Answer> answers2 = new ArrayList<>(Arrays.asList(
                new WinAnswer("win answer", AnswerType.WIN, "you win!"),
                new NextQuestionAnswer("next question answer", AnswerType.NEXT_QUESTION,  new Question("question 2", answers1))
        ));
        ArrayList<Question> questions2 = new ArrayList<>(Arrays.asList(
                new Question("question 2", answers2)
        ));
        Storyline storyline = new Storyline(questions2);
        return new Story("my-story", storyline);
    }
}
