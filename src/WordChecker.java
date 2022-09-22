import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class WordChecker {
    private String text;

    public WordChecker(String text) {
        this.text = text;
    }

    public boolean hasWord(String word) {
        boolean result = false;
        String[] strings = text.split("\\P{IsAlphabetic}+");
        Set<String> set = new HashSet<>();
        set.addAll(Arrays.asList(strings));
        if (set.contains(word)) {
            result = true;
        }
        return result;
    }
}
