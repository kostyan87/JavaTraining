package habr.first;

public abstract class ArrayFinder {
    protected int[] arr;

    public ArrayFinder(int ...arr) {
        this.arr = arr;
    }

    public abstract int findElement() throws EmptyArrayException;
}
