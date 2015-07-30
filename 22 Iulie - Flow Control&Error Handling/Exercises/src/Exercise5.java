/**
 * Created by rpanait on 7/22/2015.
 */
public class Exercise5 {
    public String everyNth(String str, int n) {
        String strnew = "";
        for (int i = 0; i < str.length(); i += n)
            strnew = strnew + str.charAt(i);
        return strnew;
    }
}