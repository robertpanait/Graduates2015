import java.util.ArrayList;

/**
 * Created by rpanait on 7/20/2015.
 */
public class ComplexTest {
    public static void main(String[] args) {
        Complex c1 = new Complex(4.0, 8.5);
        Complex c2 = new Complex(8.0, 4.5);
        Complex result = new Complex();
        result.add(c1, c2);
        result.print();
/*
        ArrayList<Integer> elements = new ArrayList<>();
        elements.add(10);
        elements.add(15);
        elements.add(20);

        int count = elements.size();
        System.out.println("Count: " +count);

        for(int i=0;i<elements.size();i++) {
            int value= elements.get(i);
            System.out.println("Element: " +value);

        }*/
    }
}