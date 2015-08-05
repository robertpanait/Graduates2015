package entities.autor;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by rpanait on 8/3/2015.
 */
public interface AutorDAO {
    /**
     * This is the method to be used to initialize
     * database resources ie. connection.
     */
    public void setDataSource(DataSource ds);

    /**
     * This is the method to be used to create
     * a record in the Graduate table.
     */
    public void create(Autor a);

    /**
     * This is the method to be used to list down
     * a record from the Graduate table corresponding
     * to a passed graduate id.
     */
    public Autor get(int id);

    /**
     * This is the method to be used to list down
     * all the records from the Graduate table.
     */
    public List<Autor> list();
    /**
     * This is the method to be used to delete
     * a record from the Graduate table corresponding
     * to a passed graduate id.
     */
    public void delete(Integer idAutor);

    /**
     * This is the method to be used to update
     * a record into the Graduate table.
     */
    public void update(Autor a);
}
