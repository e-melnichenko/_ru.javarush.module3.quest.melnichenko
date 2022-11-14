package quest.com.service.answer;

public class WinAnswer extends Answer{
    private final String winText;

    public WinAnswer(String text, AnswerType answerType, String winText) {
        super(text, answerType);
        this.winText = winText;
    }
}
