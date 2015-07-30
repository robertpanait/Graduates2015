import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by rpanait on 7/23/2015.
 */
public class CollectionEx {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<String>();
        c.add("Test1");
        c.add("Test2");
        Iterator<String> it = c.iterator();

        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }
    }
}
