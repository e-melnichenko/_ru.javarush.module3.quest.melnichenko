package quest.com.service.answer;

public class LoseAnswer extends Answer {
    private final String loseText;

    public LoseAnswer(String text, String loseText) {
        super(text, AnswerType.LOSE);
        this.loseText = loseText;
    }
}
