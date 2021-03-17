// DataSource-ot kap konstruktorba. A DogTypesTest hívja meg, ott van a DataSource deklarálva. Nyugodtan írd át a benne lévő értékeket.
//Legyen egy List<String> getDogsByCountry(String country) metódusa, mely adatbázisból visszaadja az adott országhoz tartozó kutyafajtákat!
// A teszteset a V1__dogs.sql állományt futtatja le Flyway-jel. Létrehoz egy dog_types táblát, amiből a lényeges a name és a country oszlop.
// Adatokat is beszúrja. Ha lassú, akkor csak azokat a sorokat hagyd benne, amiben szerepel a HUNGARY szó!
//Vigyázz, a metódus kisbetűsen kapja az ország nevét, de az adatbázisban csupa nagybetűsen szerepel.
// Vigyázz, a kutyák fajtái nagybetűkkel vannak, de kisbetűkkel kell visszaadni. (Konvertálásokat végezheted Javaban vagy SQL-ben is.)
//Név szerint sorbarendezve add vissza őket!
package hu.nive.ujratervezes.zarovizsga.dogtypes;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DogTypes {

    private DataSource dataSource;

    public DogTypes(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<String> getDogsByCountry(String country) {
        try (Connection conn = dataSource.getConnection();

             PreparedStatement ps = conn.prepareStatement("SELECT name FROM dog_types WHERE country = ? ORDER BY name")) {

            ps.setString(1, country.toUpperCase());
            if (getResult(ps).isEmpty()) {
                throw new IllegalArgumentException("Not found");
            }
            return getResult(ps);

        } catch (SQLException sqle) {
            throw new IllegalStateException("Cannot query", sqle);
        }
    }

    private List<String> getResult(PreparedStatement ps) {
        try (ResultSet rs = ps.executeQuery()) {
            return getNames(rs);
        } catch (SQLException sqle) {
            throw new IllegalStateException("Cannot query", sqle);
        }
    }


    private List<String> getNames(ResultSet rs) throws SQLException {
        List<String > result = new ArrayList<>();

        while (rs.next()) {
            result.add(rs.getString("name").toLowerCase());
        }
        return result;
    }
}