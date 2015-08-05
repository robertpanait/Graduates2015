/**
 * Created by rpanait on 7/20/2015.
 */
public class Grupa {
    private int crt;
    private Student[] studenti;

    Grupa() {
        crt=0;
        studenti = new Student[10];
    }
    public boolean addStudent(String nume,int media) {
        if(crt<studenti.length) {
            studenti[crt++]=new Student(this, nume, media);
            return true;
        }
        return false;
    }
}
