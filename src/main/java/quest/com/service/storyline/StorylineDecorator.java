package quest.com.service.storyline;

public interface StorylineDecorator {
    StorylineDecorator addQuestion(String text);
    StorylineDecorator addNextQuestionAnswer(String text);
    StorylineDecorator addLoseAnswer(String text, String loseText);
    StorylineDecorator addWinAnswer(String text, String winText);
}
