package codingbat.warmup1;

/**
 * https://codingbat.com/prob/p165701
 */
public class LoneTeen {
    public boolean loneTeen(int a, int b) {
        return isTeen(a) && !isTeen(b) || isTeen(b) && !isTeen(a);
    }

    public boolean isTeen(int a) {
        return (a >= 13 && a <= 19);
    }
}
