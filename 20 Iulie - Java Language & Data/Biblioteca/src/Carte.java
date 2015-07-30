import java.util.Scanner;

/**
 * Created by rpanait on 7/20/2015.
 */
public class Carte {
    private String titlu;
    private String autor;
    private String editura;
    private int numarPagini;

    public Carte(String titlu, String autor, String editura, int numarPagini) {

        this.titlu=titlu;
        this.autor=autor;
        this.editura=editura;
        this.numarPagini=numarPagini;
        }

    public void setTitlu(String ttl) {
        titlu=ttl;
    }
    public String getTitlu() {
        return titlu;
    }
    public String getAutor() {
        return autor;
    }
    public int getNumarPagini() {
        return numarPagini;
    }
    public String toString() {
        return titlu.toUpperCase()+" "+autor+" "+editura.toLowerCase();
    }

}
