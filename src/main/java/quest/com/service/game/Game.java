package quest.com.service.game;

import lombok.Getter;
import quest.com.service.answer.Answer;
import quest.com.service.answer.AnswerType;
import quest.com.service.answer.WinAnswer;
import quest.com.service.question.Question;
import quest.com.service.story.Story;
import quest.com.service.storyline.Storyline;

import java.util.ArrayList;
import java.util.Arrays;

public class Game {
    @Getter
    private Question currentQuestion;

    public Game() {
        Story story = createStory();
        currentQuestion = story.start();
    }

    private Story createStory() {
        ArrayList<Answer> answers = new ArrayList<>(Arrays.asList(
                new WinAnswer("win answer", AnswerType.WIN, "you are win!")
        ));
        ArrayList<Question> questions = new ArrayList<>(Arrays.asList(
                new Question("question 1", answers)
        ));
        Storyline storyline = new Storyline(questions);
        return new Story("my-story", storyline);
    }
}
