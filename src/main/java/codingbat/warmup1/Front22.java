package codingbat.warmup1;

/**
 * https://codingbat.com/prob/p183592
 */
public class Front22 {
    public String front22(String str) {
        if (str.length() > 1)
            return str.substring(0, 2) + str + str.substring(0, 2);
        if (str.length() == 1)
            return str.charAt(0) + str + str.charAt(0);
        return "";
    }
}
