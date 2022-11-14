package quest.com.service.answer;

public class LoseAnswer extends Answer {
    private final String looseText;

    public LoseAnswer(String text, AnswerType answerType, String looseText) {
        super(text, answerType);
        this.looseText = looseText;
    }
}
