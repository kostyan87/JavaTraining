package strings;

import book.objects.task1.LinkChecker;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CharactersCounterTest {

    @Test
    void notEmptyStringTest() {
        assertEquals("{ =3, I=1, e=1, g=1, i=2, n=1, r=1, s=3, t=4}",
                new LinkChecker.CharactersCounter("It is test string").countCharacters().toString());
    }

    @Test
    void emptyStringTest() {
        assertEquals("{}",
                new LinkChecker.CharactersCounter("").countCharacters().toString());
    }
}
