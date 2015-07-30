import java.util.List;

/**
 * Created by rpanait on 7/22/2015.
 */
public class Exercise9 {
    public int add(int a,int b) throws OverflowException,UnderflowException{
        long sum=0;
        sum=(long)a+(long)b;
            if(sum>Integer.MAX_VALUE)
                throw new OverflowException();
        else
            if(sum<Integer.MIN_VALUE)
                throw new UnderflowException();
        return (int)sum;
    }
    public int divide(int a,int b) {
       int div=1;
        div=a/b;

        return div;
    }
    public int average(List<Integer> list) {
        int sum=0;
        try {
            for (int i : list) {
                sum = add(sum, i);
            }
        }
        catch (OverflowException e) {
            e.printStackTrace();
        } catch (UnderflowException e) {
            e.printStackTrace();
        }
        return divide(sum,list.size());
    }
}
