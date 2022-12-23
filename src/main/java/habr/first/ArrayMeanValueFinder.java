package habr.first;

public class ArrayMeanValueFinder extends ArrayFinder {

    public ArrayMeanValueFinder(int... arr) {
        super(arr);
    }

    @Override
    public int findElement() {
        if (this.arr.length == 0) throw new EmptyArrayException("Array is Empty");
        int sumOfElements = 0;

        for (int i:
                this.arr) {
            sumOfElements += i;
        }

        return sumOfElements/ arr.length;
    }
}
