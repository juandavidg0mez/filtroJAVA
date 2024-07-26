package ciudad.infraestructure.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.javaplay.DatabaseConfig;

import ciudad.domain.entity.ciudad;
import ciudad.domain.service.ciudadService;

public class ciudadRepository  implements ciudadService{

    @Override
    public List<ciudad> listarCiudades() {
        String query = "select name from city;";
        List <ciudad> listaCiudades = new ArrayList<>();
          

        try (Connection connection = DatabaseConfig.getConnection();
            PreparedStatement statement = connection.prepareStatement(query)) {

            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    ciudad city = new ciudad();

                    city.setNombreCiudad(resultSet.getString("name"));

                    listaCiudades.add(city);

                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listaCiudades;
    }

}
