package codingbat.warmup1;

/**
 * https://codingbat.com/prob/p196441
 */
public class EveryNth {
    public String everyNth(String str, int n) {
        StringBuilder resultString = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            if (i % n == 0) resultString.append(str.charAt(i));
        }
        return resultString.toString();
    }
}
