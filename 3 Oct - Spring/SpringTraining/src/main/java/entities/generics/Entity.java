package entities.generics;

/**
 * Created by rpanait on 8/4/2015.
 */
public class Entity {
    private int id;
    private String nume;
    public Entity(){

    }
    public Entity(int id, String nume) {
        this.id = id;
        this.nume = nume;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }
}
