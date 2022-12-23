package basics.first;

import habr.first.ArrayFinder;
import habr.first.ArrayMaxFinder;
import habr.first.EmptyArrayException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ArrayMaxFinderTests {
    private final ArrayFinder arrayFinder1 = new ArrayMaxFinder();
    private final ArrayFinder arrayFinder2 = new ArrayMaxFinder(1, 2, 3, 4, 5);

    @Test
    void emptyArrayTest() {
        assertThrows(EmptyArrayException.class, () -> arrayFinder1.findElement());
    }

    @Test
    void notEmptyArrayTest() {
        assertEquals(arrayFinder2.findElement(), 5);
    }
}
