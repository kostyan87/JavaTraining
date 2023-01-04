package codingbat.warmup2;

/**
 * https://codingbat.com/prob/p171260
 */
public class StringX {
    public String stringX(String str) {
        if (str.length() < 2) return str;
        char[] charsFromString = str.toCharArray();
        StringBuilder resultString = new StringBuilder(charsFromString.length);
        resultString.append(charsFromString[0]);
        for (int i = 1; i < charsFromString.length - 1; i++) {
            if (charsFromString[i] != 'x')
                resultString.append(charsFromString[i]);
        }
        resultString.append(charsFromString[charsFromString.length - 1]);
        return resultString.toString();
    }
}
