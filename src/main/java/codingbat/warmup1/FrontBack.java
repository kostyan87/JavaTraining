package codingbat.warmup1;

/**
 * https://codingbat.com/prob/p123384
 */
public class FrontBack {
    public String frontBack(String str) {
        int len = str.length();
        if (len < 2) return str;
        char firstSymbol = str.charAt(0);
        char lastSymbol = str.charAt(len - 1);
        return  lastSymbol + str.substring(1, len - 1) + firstSymbol;
    }
}
