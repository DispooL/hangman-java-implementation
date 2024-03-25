package hangman;

import hangman.Enums.UserActionEnum;
import hangman.Games.Hangman;
import hangman.Games.HangmanInterface;

import java.util.Scanner;

public class HangmanGameHandler {
    public static void run() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            HangmanInterface hangman = new Hangman(WordSupplier.getWord());
            System.out.println("Select action type 1 - To start. 2 - To exit: ");
            int userInputAction = scanner.nextInt();

            UserActionEnum userAction = UserActionEnum.fromInt(userInputAction);

            switch (userAction) {
                case START:
                    handleGame(hangman);
                    break;
                case EXIT:
                    return;
            }
        }
    }

    private static void handleGame(HangmanInterface hangman) {
        int madeMistakes = hangman.getMadeMistakesCount();
        printMessage(MessageHelper.startMessageForFirstLetter());

        while (hangman.getMaxAllowedMistakesCount() != madeMistakes) {
            Scanner scanner = new Scanner(System.in);
            String letter = scanner.next().toLowerCase();
            if (letter.length() > 1) {
                printMessage(MessageHelper.letterCannotBeMoreThanOneSymbol());
                continue;
            }

            hangman.guess(letter.charAt(0));
            // Notifying user about the victory
            if (hangman.isSolved()) {
                printMessage(MessageHelper.victoryMessage());
                return;
            }
            // Notifying user about correctness of the word
            if (madeMistakes == hangman.getMadeMistakesCount()) {
                printMessage(MessageHelper.correctGuess());
            } else {
                printMessage(MessageHelper.incorrectGuess());
            }
            madeMistakes = hangman.getMadeMistakesCount();
            // Notifying user about remaining attempts and progress
            printMessage(MessageHelper.remainingAttempts(hangman.getMaxAllowedMistakesCount() - madeMistakes));
            printMessage(MessageHelper.currentWordProgress(hangman.wordProgress()));
        }

        printMessage(MessageHelper.defeatMessage());
    }

    private static void printMessage(Object message) {
        System.out.println(message);
    }
}
