import basics.first.ArrayFinder;
import basics.first.ArrayMaxFinder;
import basics.first.ArrayMeanValueFinder;
import basics.first.ArrayMinFinder;

public class Main {
    public static void main(String[] args) {
        ArrayFinder arrayMinFinder = new ArrayMinFinder(1, 2, 3, 4, 5);
        ArrayFinder arrayMaxFinder = new ArrayMaxFinder(1, 2, 3, 4, 5);
        ArrayFinder arrayMeanFinder = new ArrayMeanValueFinder(1, 2, 3, 4, 5);

        System.out.println(arrayMinFinder.findElement());
        System.out.println(arrayMaxFinder.findElement());
        System.out.println(arrayMeanFinder.findElement());
    }
}