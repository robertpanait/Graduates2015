/**
 * Created by rpanait on 7/22/2015.
 */
public class Exercise8 {
    public void method() {
        Long maxMemory = Runtime.getRuntime().maxMemory();
        System.out.println(maxMemory);
        int[] x = new int[(int) (maxMemory + 1)];
        for(int i = 0; i < x.length; ++i)
        x[i] = i+1;
    }
    public void outOfMemory() throws OutOfMemoryError {

            throw new OutOfMemoryError();
        }

    public void stackOverFl() throws StackOverflowError {
            throw new StackOverflowError();

    }
}
