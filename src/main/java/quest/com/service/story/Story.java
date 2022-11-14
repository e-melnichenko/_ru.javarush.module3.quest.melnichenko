package quest.com.service.story;

import quest.com.service.question.Question;
import quest.com.service.storyline.Storyline;

public class Story {
    private final String name;
    private final Storyline storyline;

    public Story(String name, Storyline storyline) {
        this.name = name;
        this.storyline = storyline;
    }

    public Question start() {
        return storyline.getQuestionList().get(0);
    }
}
