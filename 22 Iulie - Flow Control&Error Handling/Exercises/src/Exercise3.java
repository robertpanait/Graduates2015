/**
 * Created by rpanait on 7/22/2015.
 */
public class Exercise3 {
    public boolean posNeg(int a, int b, boolean negative) {
        if(((a<0 && b>0) || (a>0 && b<0)) || ((a<0 && b<0) && (negative=true)) )
        return true;
        else{
            return false;
        }
    }
}
