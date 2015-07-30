/**
 * Created by rpanait on 7/20/2015.
 */
public class VeterinaryTest {
    public static void main(String[] args) {
        VeterinaryReport vr = new VeterinaryReport();
        vr.cats = 99;
        vr.dogs = 1;
        vr.displayStatistics();
        System.out.println("The class method sais there are " + vr.getAnimalsNo());
    }
}
