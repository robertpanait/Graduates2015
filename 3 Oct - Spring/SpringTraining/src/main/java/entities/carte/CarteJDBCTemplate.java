package entities.carte;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by rpanait on 8/3/2015.
 */
@Repository
public class CarteJDBCTemplate implements CarteDAO {
    @Autowired
    private DataSource dataSource;
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void setDataSource(DataSource ds) {
        dataSource = dataSource;
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public void create(Carte c) {
        String SQL = "insert into carte (id_Carte, nr_Pagini, nume, id_Autor) values (?, ?, ?, ?)";

        jdbcTemplate.update(SQL, c.getId(), c.getNrPagini(), c.getNume(), c.getAutor().getId());
        System.out.println("Created Record = " + c.getId() + " Nr pagini = " + c.getNrPagini() + " Nume = " + c.getNume() + " idAutor= " + c.getAutor().getId());
    }

    @Override
    public Carte get(int idCarte) {
        String SQL = "select * from carte where id_Carte = ?";
        Carte carte = jdbcTemplate.queryForObject(SQL,
                new Object[]{idCarte}, new CarteMapper());
        return carte;
    }

    @Override
    public List<Carte> list() {
        String SQL = "select * from carte";
        List<Carte> carti = jdbcTemplate.query(SQL,
                new CarteMapper());
        return carti;
    }

    @Override
    public void delete(Integer idCarte) {
        String SQL = "delete from carte where id_Carte = ?";
        jdbcTemplate.update(SQL, idCarte);
        System.out.println("Deleted Record with ID = " + idCarte);
    }

    @Override
    public void update(Carte c) {
        String SQL = "update carte set nr_Pagini = ? where id_Carte = ?";
        jdbcTemplate.update(SQL, c.getNrPagini(), c.getId());
        System.out.println("Updated Record with ID = " + c.getId());
    }
}
