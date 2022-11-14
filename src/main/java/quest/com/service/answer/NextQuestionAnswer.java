package quest.com.service.answer;

import lombok.Getter;
import lombok.Setter;
import quest.com.service.question.Question;

public class NextQuestionAnswer extends Answer {
    @Getter
    @Setter
    private Question nextQuestion;

    public NextQuestionAnswer(String text) {
        super(text, AnswerType.NEXT_QUESTION);
    }
}
