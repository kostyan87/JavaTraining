package codingbat.warmup1;

/**
 * https://codingbat.com/prob/p190570
 */
public class MissingChar {
    public String missingChar(String str, int n) {
        return new StringBuilder(str).deleteCharAt(n).toString();
    }
}
