package habr.first;

public class ArrayMaxFinder extends ArrayFinder {

    public ArrayMaxFinder(int... arr) {
        super(arr);
    }

    @Override
    public int findElement() {
        if (this.arr.length == 0) throw new EmptyArrayException("Array is Empty");
        int max = this.arr[0];

        for (int i:
                this.arr) {
            if (i > max) max = i;
        }

        return max;
    }
}
