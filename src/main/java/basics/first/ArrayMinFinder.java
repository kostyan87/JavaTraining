package basics.first;

import java.util.Arrays;

public class ArrayMinFinder extends ArrayFinder {

    public ArrayMinFinder(int... arr) {
        super(arr);
    }

    @Override
    public int findElement() throws EmptyArrayException {
        if (this.arr.length == 0) throw new EmptyArrayException("Array is Empty");
        int min = this.arr[0];

        for (int i:
             this.arr) {
            if (i < min) min = i;
        }

        return min;
    }
}
