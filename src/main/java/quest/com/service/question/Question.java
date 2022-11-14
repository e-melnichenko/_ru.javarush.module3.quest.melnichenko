package quest.com.service.question;

import com.fasterxml.uuid.Generators;
import lombok.Getter;
import quest.com.service.answer.Answer;

import java.util.List;
import java.util.UUID;

public class Question {
    private final UUID id;
    @Getter
    private final String text;
    @Getter
    private final List<Answer> answerList;

    public Question(String text, List<Answer> answerList) {
        this.id = Generators.randomBasedGenerator().generate();
        this.text = text;
        this.answerList = answerList;
    }
}
