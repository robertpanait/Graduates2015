/**
 * Created by rpanait on 7/23/2015.
 */
public class Generics2 {
    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x;
        if(y.compareTo(max)>0) {
            max=y;
        }
        if(z.compareTo(max)>0) {
            max=z;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println("Max is " + maximum(54,21,56));
    }
}
