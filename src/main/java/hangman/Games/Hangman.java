package hangman.Games;

public class Hangman implements HangmanInterface {
    private static final int MAX_ALLOWED_MISTAKES_COUNT = 11;
    private int madeMistakesCount = 0;
    private final String oddWord;
    private final Character[] progressWord;

    public Hangman(String word) {
        this.oddWord = word.toLowerCase();
        this.progressWord = new Character[word.length()];
    }

    @Override
    public void guess(char letter) {
        if (this.oddWord.indexOf(letter) >= 0) {
            for (int i = 0; i < oddWord.length(); i++) {
                if (oddWord.charAt(i) == letter) {
                    progressWord[i] = letter;
                }
            }
        } else {
            this.addMistake();
        }
    }

    @Override
    public String wordProgress() {
        StringBuilder wordProgress = new StringBuilder();
        for (int i = 0; i < oddWord.length(); i++) {
            if (this.progressWord[i] == null) {
                wordProgress.append("_");
            } else {
                wordProgress.append(progressWord[i]);
            }
        }

        return wordProgress.toString();
    }

    @Override
    public boolean isSolved() {
        return Arrays.stream(this.progressWord)
                .noneMatch(Objects::isNull);
    }

    @Override
    public int getMadeMistakesCount() {
        return this.madeMistakesCount;
    }

    @Override
    public int getMaxAllowedMistakesCount() {
        return MAX_ALLOWED_MISTAKES_COUNT;
    }

    @Override
    public void addMistake() {
        this.madeMistakesCount += 1;
    }
}
