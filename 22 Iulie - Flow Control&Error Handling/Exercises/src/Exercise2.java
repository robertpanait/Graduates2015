/**
 * Created by rpanait on 7/22/2015.
 */
public class Exercise2 {
    public boolean parrotTrouble(boolean talking, int hour) {
        if (talking ==true &&(hour < 7 || hour > 20))
            return true;
        else {
            return false;
        }
    }
}