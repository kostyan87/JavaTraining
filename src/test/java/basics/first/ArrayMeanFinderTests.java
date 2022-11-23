package basics.first;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ArrayMeanFinderTests {

    private final ArrayFinder arrayFinder1 = new ArrayMeanValueFinder();
    private final ArrayFinder arrayFinder2 = new ArrayMeanValueFinder(1, 2, 3, 4, 5);

    @Test
    void emptyArrayTest() {
        assertThrows(EmptyArrayException.class, () -> arrayFinder1.findElement());
    }

    @Test
    void notEmptyArrayTest() {
        assertEquals(arrayFinder2.findElement(), 3);
    }
}
