/**
 * Created by rpanait on 7/20/2015.
 */
public class Verificari {
    public Boolean verificaDuplicat(Carte c1, Carte c2) {

        if ((c1.getTitlu()).equals(c2.getTitlu()) && (c1.getAutor()).equals(c2.getAutor())) {
            return true;
        } else
            return false;

    }

    public Carte verifG(Carte c1, Carte c2) {
        if (c1.getNumarPagini() > c2.getNumarPagini()) {
            return c1;
        } else
            return c2;
    }

}
