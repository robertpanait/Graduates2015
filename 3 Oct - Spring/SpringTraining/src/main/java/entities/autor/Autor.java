package entities.autor;

import entities.generics.Entity;

/**
 * Created by rpanait on 8/3/2015.
 */
public class Autor extends Entity{
    private String prenume;
public Autor() {

}
    public Autor(int id, String nume) {
        super(id, nume);
    }

    public Autor(int id, String nume, String prenume) {
        super(id, nume);
        this.prenume = prenume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }
}
