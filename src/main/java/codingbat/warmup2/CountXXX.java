package codingbat.warmup2;

/**
 * https://codingbat.com/prob/p194667
 */
public class CountXXX {
    int countXX(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == 'x' && str.charAt(i + 1) == 'x')
                count++;
        }
        return count;
    }
}
