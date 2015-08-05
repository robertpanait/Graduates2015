import entities.autor.Autor;
import entities.autor.AutorDAO;
import entities.autor.AutorJDBCTemplate;
import entities.carte.Carte;
import entities.carte.CarteDAO;
import entities.carte.CarteJDBCTemplate;
import entities.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by rpanait on 8/4/2015.
 */
public class MainJdbc {
    private static AutorDAO autorJDBCTemplate;
    private static CarteDAO carteJDBCTemplate;
    public static void main(String[] args) {
        ApplicationContext a= new ClassPathXmlApplicationContext("application-context.xml");
        autorJDBCTemplate = a.getBean(AutorDAO.class);
       // AutorJDBCTemplate autor1 = a.getBean("autorJDBCTemplate",AutorJDBCTemplate.class);

        // Inserarea unui entities.autor in tabela "Autor" -->
        Autor autor = new Autor(6, "Ion Creanga");
        autorJDBCTemplate.create(autor);

        //Update in tabela "Autor" -->
       // autorJDBCTemplate.update(4,"Ion FaraCreanga");

        //Delete pe o inregistrare din tabela "Autor"
       // autorJDBCTemplate.delete(4);

        //Listare autori -->
       listareAutori();

        //Aducerea unei inregistrari din tabela "Autor" -->
        //getAutori(2);

        carteJDBCTemplate = a.getBean(CarteDAO.class);
        // Inserarea unei carti in tabela "Carte" -->
        carteJDBCTemplate.create(new Carte(5,"E",101,autor));

    }
    private static Autor getAutori(int id) {
        System.out.println("------Autori get by id--------");
        Autor autor = autorJDBCTemplate.get(id);
        System.out.println(autor.getId() + " " + autor.getNume());
        return autor;
    }
    private static List<Autor> listareAutori() {
        System.out.println("------Autori listAutori--------");
        List<Autor> autori = autorJDBCTemplate.list();
        for (Autor autor : autori) {
            System.out.println(autor.getId() + " " + autor.getNume());
        }
        return autori;
    }
}
