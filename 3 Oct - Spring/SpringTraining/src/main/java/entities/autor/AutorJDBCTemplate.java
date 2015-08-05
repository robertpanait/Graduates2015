package entities.autor;

import javax.sql.DataSource;
import java.util.List;

import entities.carte.Carte;
import entities.carte.CarteMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * Created by rpanait on 8/3/2015.
 */
@Repository
public class AutorJDBCTemplate implements AutorDAO {
    @Autowired
    private DataSource dataSource;
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public void setDataSource(DataSource ds) {
        this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public void create(Autor a) {
        String SQL = "insert into autor (id_Autor, nume_Autor) values (?, ?)";

        jdbcTemplate.update(SQL, a.getId(), a.getNume());
        System.out.println("Created Record = " + a.getId() + " Nume autor = " + a.getNume());
    }

    @Override
    public Autor get(int idAutor) {
        String SQL = "select * from autor where id_Autor = ?";
        Autor autor = jdbcTemplate.queryForObject(SQL,
                new Object[]{idAutor}, new AutorMapper());
        return autor;
    }
    @Override
    public List<Autor> list() {
        String SQL = "select * from autor";
        List<Autor> autori = jdbcTemplate.query(SQL,
                new AutorMapper());
        return autori;
    }

    @Override
    public void delete(Integer idAutor) {
        String SQL = "delete from autor where id_Autor = ?";
        jdbcTemplate.update(SQL, idAutor);
        System.out.println("Deleted Record with ID = " + idAutor);
    }

    @Override
    public void update(Autor a) {
        String SQL = "update entities.autor set nume_Autor = ? where id_Autor = ?";
        jdbcTemplate.update(SQL, a.getNume(), a.getId());
        System.out.println("Updated Record with ID = " + a.getId());
    }
}
