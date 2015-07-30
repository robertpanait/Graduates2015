/**
 * Created by rpanait on 7/20/2015.
 */
public class VeterinaryReport {
    int dogs;
    int cats;

    public int getAnimalsNo() {
        return dogs + cats;
    }

    public void displayStatistics() {
        System.out.println("Total number of animals is " + getAnimalsNo());
    }
}
