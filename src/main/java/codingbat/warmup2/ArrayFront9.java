package codingbat.warmup2;

/**
 * https://codingbat.com/prob/p186031
 */
public class ArrayFront9 {
    public boolean arrayFront9(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (i > 3) return false;
            if (nums[i] == 9) return true;
        }
        return false;
    }
}
