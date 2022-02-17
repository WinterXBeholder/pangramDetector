import java.util.Locale;

public class pangram {
    public static boolean run(String phrase) {
        String[] characters = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
                "s", "t", "u", "v", "w", "x", "y", "z"};

        phrase = phrase.toLowerCase(Locale.ROOT);
        int check = 0;
        for(String ch : characters) {
            if (!phrase.contains(ch)) {
                return false;
            }
        }

        return true;
    }
}
