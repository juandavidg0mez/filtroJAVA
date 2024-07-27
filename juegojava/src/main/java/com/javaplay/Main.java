package com.javaplay;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JPanel;

import java.awt.*;
import person.application.personUseCase;
import person.domain.service.personService;
import person.infraestructure.inController.personaController;
import person.infraestructure.outRepository.personaRepository;

public class Main {
    public static void main(String[] args) {
        JPanel panelpcincipal = new JPanel();
        JButton crearpersona = new JButton("New Person");
        JButton AsignarHabilidad = new JButton("asignar habiliad");
        JButton crearHabilidad = new JButton("Creat skill");
        panelpcincipal.setPreferredSize(new Dimension(400, 300));

        panelpcincipal.setLayout(new GridLayout(2, 1));

        panelpcincipal.add(crearpersona);
        panelpcincipal.add(AsignarHabilidad);
        panelpcincipal.add(crearHabilidad);
        

        crearpersona.addActionListener(e -> {
            personService personaservice = new personaRepository();
            personUseCase personausecase = new personUseCase(personaservice);
            personaController personacontroller = new personaController(personausecase);
            personacontroller.crearpersona();
        });  

        AsignarHabilidad.addActionListener(e->{
            // Hexagonal de habilidad
        });
        crearHabilidad.addActionListener(e->{
            // Hexagonal de crear Habilidad
        });
        
    }
}