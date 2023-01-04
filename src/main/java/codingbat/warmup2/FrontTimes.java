package codingbat.warmup2;

/**
 * https://codingbat.com/prob/p101475
 */
public class FrontTimes {
    public String frontTimes(String str, int n) {
        String repeatString;
        if (str.length() < 3) repeatString = str;
        else repeatString = str.substring(0, 3);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(repeatString);
        }
        return result.toString();
    }
}
