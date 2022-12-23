package book.objects.task1;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class LinkChecker<T> {

    public boolean isNull(T obj) {
        return obj == null;
    }

    /**
     * Подсчитать количество вхождений каждого символа в строку
     */
    public static class CharactersCounter {
        private String s;

        public CharactersCounter(String s) {
            this.s = s;
        }

        // Можно переделать так, чтобы сразу идти по строке символов, но я пока не знаю как
        public Map<Character, Integer> countCharacters() {
            Map<Character, Integer> charactersFrequenciesMap = new TreeMap<>();
            if (s.length() == 0) return charactersFrequenciesMap;
            Arrays.stream(this.s.split("")).forEach(s -> {
                Character c = s.charAt(0);
                if (!charactersFrequenciesMap.containsKey(c)) charactersFrequenciesMap.put(c,1);
                else charactersFrequenciesMap.put(c, charactersFrequenciesMap.get(c) + 1);
            });
            return charactersFrequenciesMap;
        }
    }
}
