package hangman;

public class MessageHelper {
    public static String startMessageForFirstLetter() {
        return "Starting the game. Enter the first letter: ";
    }

    public static String messageForNextLetter() {
        return "Enter the next letter: ";
    }

    public static String remainingAttempts(int remainingAttempts) {
        return String.format("Your number of remaining attempts: %s", remainingAttempts);
    }

    public static String currentWordProgress(String wordProgress) {
        return String.format("Current progress of the guessed word: %s", wordProgress);
    }

    public static String victoryMessage() {
        return "You won";
    }

    public static String defeatMessage() {
        return "You lost";
    }

    public static String letterCannotBeMoreThanOneSymbol() {
        return "The entered value cannot be more than one symbol";
    }

    public static String correctGuess() {
        return "Correct";
    }

    public static String incorrectGuess() {
        return "Incorrect";
    }
}
