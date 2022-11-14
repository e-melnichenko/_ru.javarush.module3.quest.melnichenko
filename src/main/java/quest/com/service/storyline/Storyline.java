package quest.com.service.storyline;

import lombok.Getter;
import quest.com.service.question.Question;

import java.util.List;

public class Storyline {
    @Getter
    private final List<Question> questionList;

    public Storyline(List<Question> questionList) {
        this.questionList = questionList;
    }
}
