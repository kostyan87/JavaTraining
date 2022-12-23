package codingbat.warmup1;

/**
 * https://codingbat.com/prob/p187868
 */
public class SleepIn {
    public boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }
}
