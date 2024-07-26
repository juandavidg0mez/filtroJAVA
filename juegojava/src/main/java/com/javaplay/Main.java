package com.javaplay;

import person.application.personUseCase;
import person.domain.service.personService;
import person.infraestructure.inController.personaController;
import person.infraestructure.outRepository.personaRepository;

public class Main {
    public static void main(String[] args) {
        personService personaservice = new personaRepository();
        personUseCase personausecase = new personUseCase(personaservice);
        personaController personacontroller = new personaController(personausecase);
        personacontroller.crearpersona();
    }
}