package codingbat.warmup2;

/**
 * https://codingbat.com/prob/p165666
 */
public class StringBits {
    public String stringBits(String str) {
        StringBuilder resultString = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) resultString.append(str.charAt(i));
        }
        return resultString.toString();
    }
}
