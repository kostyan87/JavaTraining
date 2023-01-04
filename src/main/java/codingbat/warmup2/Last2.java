package codingbat.warmup2;

/**
 * https://codingbat.com/prob/p178318
 */
public class Last2 {
    public int last2(String str) {
        int len = str.length();
        if (len < 2) return 0;
        String searchingSubstring = str.substring(len - 2);
        int result = 0;
        for (int i = 0; i < len - 2; i++) {
            if (str.substring(i, i + 2).equals(searchingSubstring))
                result++;
        }
        return result;
    }
}
