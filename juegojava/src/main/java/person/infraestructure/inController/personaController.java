package person.infraestructure.inController;


import java.awt.GridLayout;
import java.util.List;
import java.util.function.Consumer;

import javax.swing.BorderFactory;

import javax.swing.JButton;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import ciudad.application.ciudadUseCase;
import ciudad.domain.entity.ciudad;
import ciudad.domain.service.ciudadService;
import ciudad.infraestructure.controller.ciudadController;
import ciudad.infraestructure.repository.ciudadRepository;

import java.awt.Dimension;

import person.application.personUseCase;
import person.domain.entity.person;

public class personaController {
    private final personUseCase personausecase;

    public personaController(personUseCase personausecase) {
        this.personausecase = personausecase;
    }
    
    public person crearpersona(){

        person humano = new person();
        JPanel panel = new JPanel(new GridLayout(8, 2, 10, 5));
        panel.setPreferredSize(new Dimension(400,300));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 80, 20, 80));

        // Crear etiquetas y agregarlas al panel
        JLabel labelName = new JLabel("Name : ");
        JTextField txtName = new JTextField();
        txtName.setText(humano.getName());

        JLabel labelLastName = new JLabel("Last Name : ");
        JTextField txtLastName = new JTextField();
        txtLastName.setText(humano.getLastname());

        JButton bottonCiudad = new JButton("City");
        JTextField ciudadText = new JTextField();

        JLabel labelAddres = new JLabel("Address:");
        JTextField txtAddress = new JTextField();
        txtAddress.setText(humano.getAddress());

        JLabel labelage = new JLabel("Age : ");
        JTextField txtage = new JTextField();
        txtage.setText(Integer.toString(humano.getAge()));

        JLabel labelemail = new JLabel("Email : ");
        JTextField textEmail = new JTextField("Email : ");
        textEmail.setText(humano.getEmail());

        JButton genero = new JButton("Genero: ");
        JTextField generoText = new JTextField();

        ciudadService ciudadservice = new ciudadRepository(); 
        ciudadUseCase ciudadusecase = new ciudadUseCase(ciudadservice);
        ciudadController ciudadcontrolador = new ciudadController(ciudadusecase);
        List<ciudad> listaciudades = ciudadcontrolador.listarCiudad();

        String [] opcionesCiudad;

        Consumer<ciudad> getCiudad = ciudad

        panel.add(labelName);
        panel.add(txtName);
        panel.add(labelLastName);
        panel.add(txtLastName);
        panel.add(bottonCiudad);
        panel.add(ciudadText);
        panel.add(labelAddres);
        panel.add(txtAddress);
        panel.add(labelage);
        panel.add(txtage);
        panel.add(labelemail);
        panel.add(textEmail);
        panel.add(genero);
        panel.add(generoText);
        








        int option = JOptionPane.showConfirmDialog(
            null, 
            panel, 
            "Airline, Hight All  The Time!", 
            JOptionPane.OK_CANCEL_OPTION, 
            JOptionPane.QUESTION_MESSAGE
        );

        if (option == JOptionPane.OK_OPTION) {
            
        }

        return null;
    }
}
