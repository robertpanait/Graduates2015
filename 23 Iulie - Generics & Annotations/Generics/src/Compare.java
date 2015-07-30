/**
 * Created by rpanait on 7/23/2015.
 */
public class Compare {
    public static String compare(String s1, String s2) {
        if (s1.compareTo(s2)>0)
            return s1;
            else
            return s2;

    }

    public static void main(String[] args) {
        String s1="abc";
        String s2="abcd";
        System.out.println(compare(s1,s2));
    }
}
