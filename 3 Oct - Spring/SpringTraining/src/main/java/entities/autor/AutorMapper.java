package entities.autor;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by rpanait on 8/4/2015.
 */
public class AutorMapper implements RowMapper<Autor> {

    @Override
    public Autor mapRow(ResultSet resultSet, int i) throws SQLException {
        Autor autor1 = new Autor();
        autor1.setId(resultSet.getInt("id_Autor"));
        autor1.setNume(resultSet.getString("nume_Autor"));
        return autor1;
    }
}
