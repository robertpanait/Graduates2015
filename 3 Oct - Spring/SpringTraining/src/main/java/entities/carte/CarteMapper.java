package entities.carte;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by rpanait on 8/4/2015.
 */
public class CarteMapper implements RowMapper<Carte> {

    @Override
    public Carte mapRow(ResultSet resultSet, int i) throws SQLException {
        Carte carte1 = new Carte();
        carte1.setId(resultSet.getInt("idCarte"));
        carte1.setNrPagini(resultSet.getInt("nrPagini"));
        carte1.setNume(resultSet.getString("nume"));
        return carte1;
    }
}
