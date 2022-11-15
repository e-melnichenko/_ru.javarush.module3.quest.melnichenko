package quest.com.service.answer;

import lombok.Getter;

public class WinAnswer extends Answer{
    @Getter
    private final String winText;

    public WinAnswer(String text, String winText) {
        super(text, AnswerType.WIN);
        this.winText = winText;
    }
}
