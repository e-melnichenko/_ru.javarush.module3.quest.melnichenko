package quest.com.service.answer;

import quest.com.service.question.Question;

public class NewQuestionAnswer extends Answer {
    public final Question newQuestion;

    public NewQuestionAnswer(String text, AnswerType answerType, Question newQuestion) {
        super(text, answerType);
        this.newQuestion = newQuestion;
    }
}
