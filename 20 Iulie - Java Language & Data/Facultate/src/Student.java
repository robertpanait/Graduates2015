/**
 * Created by rpanait on 7/20/2015.
 */
public class Student {
    private String name;
    public int averageGrade;
   // private final Grupa grupa;
    private static final int COD_UNIVERSITATE =15;

    public Student(String name, int avg) {

       // this.grupa=grupa;
        this.name = name;
        this.averageGrade = averageGrade;
    }
//    public Student(Grupa grupa) {
//        this.grupa=grupa;
//    }

    public void setName(String n) {
        name = n;
    }

    public void setAverageGrade(int averageGrade) {
        this.averageGrade=averageGrade;
    }

    public String getName() {
        return name;
    }
}
