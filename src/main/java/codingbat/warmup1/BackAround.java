package codingbat.warmup1;

/**
 * https://codingbat.com/prob/p161642
 */
public class BackAround {
    public String backAround(String str) {
        return str.charAt(str.length() - 1) + str + str.charAt(str.length() - 1);
    }
}
