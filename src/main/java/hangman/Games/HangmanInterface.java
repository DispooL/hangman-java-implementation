package hangman.Games;

public interface HangmanInterface {
    int getMadeMistakesCount();
    int getMaxAllowedMistakesCount();

    void addMistake();
    void guess(char letter);
    boolean isSolved();
    String wordProgress();
}
