package codingbat.warmup2;

/**
 * https://codingbat.com/prob/p142270
 */
public class StringTimes {
    public String stringTimes(String str, int n) {
        String resultString = "";
        for (int i = 0; i < n; i++) resultString += str;
        return resultString;
    }
}
