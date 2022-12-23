package basics.first;

import habr.first.ArrayFinder;
import habr.first.ArrayMinFinder;
import habr.first.EmptyArrayException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ArrayMinFinderTests {

    private final ArrayFinder arrayFinder1 = new ArrayMinFinder();
    private final ArrayFinder arrayFinder2 = new ArrayMinFinder(1, 2, 3, 4, 5);

    @Test
    void emptyArrayTest() {
        assertThrows(EmptyArrayException.class, () -> arrayFinder1.findElement());
    }

    @Test
    void notEmptyArrayTest() {
        assertEquals(arrayFinder2.findElement(), 1);
    }
}
