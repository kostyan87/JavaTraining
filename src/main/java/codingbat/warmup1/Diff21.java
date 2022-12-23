package codingbat.warmup1;

/**
 * https://codingbat.com/prob/p116624
 */
public class Diff21 {
    public int diff21(int n) {
        if (n >= 21) return (n - 21)*2;
        else return 21 - n;
    }
}
