package codingbat.warmup2;

/**
 * https://codingbat.com/prob/p121596
 */
public class AltPairs {
    public String altPairs(String str) {
        StringBuilder resultString = new StringBuilder(str.length());
        int selectedIndex = 0;
        for (int i = 0; i < str.length(); i++) {
            selectedIndex++;
            if (selectedIndex == 3) {
                selectedIndex = 0;
                i++;
                continue;
            }
            resultString.append(str.charAt(i));
        }
        return resultString.toString();
    }
}
