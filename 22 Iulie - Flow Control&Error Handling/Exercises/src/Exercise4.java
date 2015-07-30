/**
 * Created by rpanait on 7/22/2015.
 */
public class Exercise4 {
    public String backAround(String str) {
        char c;
        c = str.charAt(str.length() - 1);
        str = c + str + c;
        return str;
    }
}
