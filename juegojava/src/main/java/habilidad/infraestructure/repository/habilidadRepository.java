package habilidad.infraestructure.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import com.javaplay.DatabaseConfig;

import habilidad.domain.entity.habilidad;
import habilidad.domain.service.habilidadService;

public class habilidadRepository implements habilidadService {

    @Override
    public habilidad crearHabilidad(habilidad skill) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<habilidad> listarHabilidadesPersonas(String skill) {
             List<habilidad> listHabilidades = new ArrayList<>();
        String query = "CALL buscar_persona_habilidad(?);";


        try(Connection conec = DatabaseConfig.getConnection();
            PreparedStatement stm = conec.prepareStatement(query)){

                stm.setString(1, skill);
                try(ResultSet  rs = stm.executeQuery()){
                    while (rs.next()){
                        habilidad habilidaRegistrar = new habilidad();
                        habilidaRegistrar.setNombre_persona(rs.getString("name"));
                        habilidaRegistrar.setNombre_habilidad(rs.getString("Habilidad"));
                    }   
                }
            }catch(SQLException e){
                e.printStackTrace();

                String mensaje = "Registro Fallido!"; 
                JOptionPane.showMessageDialog(null, mensaje, "Denied", JOptionPane.WARNING_MESSAGE);
                return null;
            }


        return listHabilidades;
        
    } 

}
