package codingbat.warmup1;

/**
 * https://codingbat.com/prob/p199720
 */
public class StartOz {
    public String startOz(String str) {
        if (str.length() == 0)  return "";
        if (str.equals("o")) return str;
        StringBuilder result = new StringBuilder(str.substring(0, 2));
        if (result.charAt(1) != 'z') result.deleteCharAt(1);
        if (result.charAt(0) != 'o') result.deleteCharAt(0);
        return result.toString();
    }
}
