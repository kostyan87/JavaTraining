package codingbat.warmup1;

/**
 * https://codingbat.com/prob/p191914
 */
public class NotString {
    public String notString(String str) {
        if (str.startsWith("not")) return str;
        return "not " + str;
    }
}
