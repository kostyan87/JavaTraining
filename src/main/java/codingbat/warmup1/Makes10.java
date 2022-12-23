package codingbat.warmup1;

/**
 * https://codingbat.com/prob/p182873
 */
public class Makes10 {
    public boolean makes10(int a, int b) {
        if (a == 10 || b == 10) return true;
        return a + b == 10;
    }
}
