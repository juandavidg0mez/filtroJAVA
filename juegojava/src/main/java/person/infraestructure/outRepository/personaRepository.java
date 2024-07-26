package person.infraestructure.outRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import javax.swing.JOptionPane;

import com.javaplay.DatabaseConfig;

import person.domain.entity.person;
import person.domain.service.personService;

public class personaRepository implements personService{

    @Override
    public person agregaPerson(person perso) {
        String query = "INSERT INTO persons (name,lastname,idcity,address,age,email,idgender) VALUES\n" + //
                        "(?,?,?,?,?,?, ?);";

        
        try(Connection conec = DatabaseConfig.getConnection();
            PreparedStatement stm = conec.prepareStatement(query)){
            
            stm.setString(1, perso.getName());
            stm.setString(2, perso.getLastname());

            stm.setInt(3, perso.getId_city());
            stm.setString(4, perso.getAddress());
            stm.setInt(5, perso.getAge());
            stm.setString(6, perso.getEmail());
            stm.setInt(7, perso.getIdgenser());
    
            int rowsAffected = stm.executeUpdate();
            if (rowsAffected > 0) {
                try (ResultSet generatedKeys = stm.getGeneratedKeys()) {
                    if (generatedKeys.next()) {
                        int id_persona = generatedKeys.getInt(1);
                        perso.setId_person(id_persona); }
                        return perso;
                    }
                }
            }
            catch(SQLException e){
                 e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Registro Fallido!", "Denied", JOptionPane.WARNING_MESSAGE);
            }
            
        return null;
    }

   

    @Override
    public void eliminarPerson(int id_person) {
        
        
    }



    @Override
    public person asignarHabilidad(int id_skill) {
        
        return null;
    }

    

  
    
}
