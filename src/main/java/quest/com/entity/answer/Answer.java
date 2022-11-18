package quest.com.entity.answer;

import com.fasterxml.uuid.Generators;
import lombok.Getter;

import java.util.UUID;

public abstract class Answer {
    @Getter
    final private UUID id;
    @Getter
    final private String text;
    @Getter
    final private AnswerType answerType;

    public Answer(String text, AnswerType answerType) {
        this.id = Generators.randomBasedGenerator().generate();
        this.text = text;
        this.answerType = answerType;
    }

    public boolean is(AnswerType answerType) {
        return this.answerType == answerType;
    }
}
