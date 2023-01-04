package codingbat.warmup2;

/**
 * https://codingbat.com/prob/p198640
 */
public class StringMatch {
    public int stringMatch(String a, String b) {
        int countOfSameSubstring = 0;
        int lenOfSmallestString = Math.min(a.length(), b.length());
        for (int i = 0; i < lenOfSmallestString - 1; i++) {
            if (a.substring(i, i + 2).equals(b.substring(i, i + 2)))
                countOfSameSubstring++;
        }
        return countOfSameSubstring;
    }
}
