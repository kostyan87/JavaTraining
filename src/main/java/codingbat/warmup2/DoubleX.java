package codingbat.warmup2;

/**
 * https://codingbat.com/prob/p186759
 */
public class DoubleX {
    boolean doubleX(String str) {
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'x' && str.charAt(i + 1) == 'x')
                return true;
            else if (str.charAt(i) == 'x') return false;
        }
        return false;
    }
}
