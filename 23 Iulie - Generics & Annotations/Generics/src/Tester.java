import java.util.ArrayList;
import java.util.List;

/**
 * Created by rpanait on 7/23/2015.
 */
public class Tester <T> {
    private List<T> bugs;
    public Tester() {
        bugs=new ArrayList<T>();
    }
    public void addBug(T newBug) {
        bugs.add(newBug);
    }
    public T getLastBug() {
        T lastElement = bugs.get(bugs.size() - 1);
        return lastElement;
    }
    public void print() {
        for (int i = 0; i < bugs.size(); i++) {
            System.out.println(bugs.get(i));
    }
}
    public static void main(String[] args){

        Tester <Float> t1=new Tester();
        Tester <Integer> t2=new Tester();
        t1.addBug(43.5f);
        t1.addBug(87.23f);
        t2.addBug(12);
        t2.addBug(14);
        t1.print();

    }
}
