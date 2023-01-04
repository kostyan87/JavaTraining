package codingbat.warmup2;

/**
 * https://codingbat.com/prob/p170221
 */
public class NoTriples {
    public boolean noTriples(int[] nums) {
        int counter = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = 1; j < 3; j++) {
                if (nums[i] == nums[i + j]) counter++;
                else counter = 0;
            }
            if (counter == 2) return false;
        }
        return true;
    }
}
