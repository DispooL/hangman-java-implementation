package hangman;

import java.util.List;
import java.util.Random;

public class WordSupplier {
    private static final List<String> words = List.of(
            "apple",
            "banana",
            "cherry",
            "date",
            "elephant",
            "flamingo",
            "grape",
            "honeydew",
            "iguana",
            "jaguar",
            "kiwi",
            "lemon",
            "mango",
            "nectarine",
            "orange",
            "papaya",
            "quince",
            "raspberry",
            "strawberry",
            "tangerine",
            "umbrella",
            "violet",
            "watermelon",
            "xenops",
            "yam",
            "zebra"
    );

    public static String getWord() {
        Random rand = new Random();

        return words.get(rand.nextInt(words.size()));
    }
}
