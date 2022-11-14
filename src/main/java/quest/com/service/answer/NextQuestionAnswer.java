package quest.com.service.answer;

import quest.com.service.question.Question;

public class NextQuestionAnswer extends Answer {
    public final Question nextQuestion;

    public NextQuestionAnswer(String text, AnswerType answerType, Question nextQuestion) {
        super(text, answerType);
        this.nextQuestion = nextQuestion;
    }
}
