package codingbat.warmup1;

/**
 * https://codingbat.com/prob/p173784
 */
public class StringE {
    public boolean stringE(String str) {
        int countOfE = 0;
        for (char c:
             str.toCharArray()) {
            if (c == 'e') countOfE++;
        }
        return countOfE >= 1 && countOfE <= 3;
    }
}
