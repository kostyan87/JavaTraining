package codingbat.warmup1;

/**
 *
 */
public class HasTeen {
    public boolean hasTeen(int a, int b, int c) {
        int[] arr = {a, b, c};

        for (int num:
             arr) {
            if (num >= 13 && num <= 19) return true;
        }

        return false;
    }
}
