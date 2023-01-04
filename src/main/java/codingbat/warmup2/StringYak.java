package codingbat.warmup2;

/**
 * https://codingbat.com/prob/p126212
 */
public class StringYak {
    public String stringYak(String str) {
        StringBuilder resultString = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            if (i >= str.length() - 2) {
                resultString.append(str.substring(i));
                break;
            }
            if (str.charAt(i) == 'y' && str.charAt(i + 2) == 'k') {
                i += 2;
            }
            else resultString.append(str.charAt(i));
        }
        return resultString.toString();
    }

    public static void main(String[] args) {
        new StringYak().stringYak("yakpak");
    }
}
