package quest.com.service.answer;

public class WinAnswer extends Answer{
    private final String winText;

    public WinAnswer(String text, String winText) {
        super(text, AnswerType.WIN);
        this.winText = winText;
    }
}
