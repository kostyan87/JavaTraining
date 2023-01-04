package codingbat.warmup2;

/**
 * https://codingbat.com/prob/p184031
 */
public class ArrayCount9 {
    public int arrayCount9(int[] nums) {
        int nineCounter = 0;
        for (int n:
             nums) {
            if (n == 9) nineCounter++;
        }
        return nineCounter;
    }
}
