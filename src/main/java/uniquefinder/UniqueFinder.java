package uniquefinder;

import java.util.ArrayList;
import java.util.List;

public class UniqueFinder {

    public List<Character> getUniqueChars(String word) {
        if (word == null) {
            throw new IllegalArgumentException("Text is null.");
        }

        List<Character> charList = new ArrayList<>();
        for (int i = 0; i < word.length(); i++) {
            if (isRepeated(charList, word.charAt(i))) {
                charList.add(word.charAt(i));
            }
        }
        return charList;
    }

    public boolean isRepeated(List<Character> charList, char c) {
        for (char tempChar : charList) {
            if (tempChar == c) {
                return false;
            }
        }
        return true;
    }
}
