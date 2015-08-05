/**
 * Created by rpanait on 7/20/2015.
 */
public class StudentTest {

    public static void modifica(Student s) {
        s.averageGrade=14;
    }
    public static void main(String[] args) {
        Grupa g1=new Grupa();
        Student s1=new Student("Ion",8);
       // System.out.println(s1.name);
        //s1.setAverageGrade(11);
        modifica(s1);
        System.out.println(s1.averageGrade);
    }
}



