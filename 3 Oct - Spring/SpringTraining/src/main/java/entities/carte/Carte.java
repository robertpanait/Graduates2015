package entities.carte;

import entities.autor.Autor;
import entities.generics.Entity;

/**
 * Created by rpanait on 8/3/2015.
 */
public class Carte extends Entity {
    private int nrPagini;
    private Autor autor;
    public Carte() {

    }
    public Carte(int id, String nume, int nrPagini, Autor autor) {
        super(id, nume);
        this.nrPagini = nrPagini;
        this.autor = autor;
    }

    public int getNrPagini() {
        return nrPagini;
    }

    public void setNrPagini(int nrPagini) {
        this.nrPagini = nrPagini;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
}
