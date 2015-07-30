/**
 * Created by rpanait on 7/22/2015.
 */
public class Exercise7 {
    public int sumHeights(int[] heights, int start, int end) {
        int sum=0;
        for(int i=start;i<end;i++) {
            if(heights[i]<heights[i+1]) {
                sum = sum + (heights[i + 1] - heights[i]);
            }
            else {
                sum = sum + (heights[i] - heights[i+1]);
            }
        }
        return sum;
    }
}
