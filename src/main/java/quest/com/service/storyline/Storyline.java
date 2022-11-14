package quest.com.service.storyline;

import lombok.Getter;
import quest.com.service.answer.AnswerType;
import quest.com.service.answer.LoseAnswer;
import quest.com.service.answer.NextQuestionAnswer;
import quest.com.service.answer.WinAnswer;
import quest.com.service.question.Question;

import java.util.ArrayList;
import java.util.List;

import static java.util.Objects.isNull;

public class Storyline implements StorylineDecorator {
    @Getter
    private final List<Question> questionList = new ArrayList<>();
    private final String name;
    private Question constructedQuestion;

    public Storyline(String name) {
        this.name = name;
    }

    @Override
    public StorylineDecorator addQuestion(String text) {
        Question nextQuestion = new Question(text);

        if(!isNull(constructedQuestion)) {
            NextQuestionAnswer nextQuestionAnswer = (NextQuestionAnswer) constructedQuestion.getAnswerList().stream()
                    .filter(answer -> answer.is(AnswerType.NEXT_QUESTION))
                    .findFirst()
                    .orElseThrow();

            nextQuestionAnswer.setNextQuestion(nextQuestion);
            questionList.add(constructedQuestion);
        }

        constructedQuestion = nextQuestion;
        return this;
    }

    @Override
    public StorylineDecorator addNextQuestionAnswer(String text) {
        checkConstructedQuestion();
        checkIfAlreadyExist();

        constructedQuestion.addAnswer(new NextQuestionAnswer(text));

        return this;
    }

    @Override
    public StorylineDecorator addLoseAnswer(String text, String loseText) {
        checkConstructedQuestion();

        constructedQuestion.addAnswer(new LoseAnswer(text, loseText));

        return this;
    }

    @Override
    public StorylineDecorator addWinAnswer(String text, String winText) {
        checkConstructedQuestion();

        constructedQuestion.addAnswer(new WinAnswer(text, winText));
        return this;
    }

    private void checkConstructedQuestion() {
        if(isNull(constructedQuestion)) {
            throw new RuntimeException("There isn't question for answer in Storyline " + name);
        }
    }

    private void checkIfAlreadyExist() {
        Boolean isExist = constructedQuestion.getAnswerList().stream()
                .anyMatch(answer -> answer.is(AnswerType.NEXT_QUESTION));

        if(isExist) {
            throw new RuntimeException("AnswerType.NEXT_QUESTION already exist in question: " + constructedQuestion.getText());
        }
    }
}
