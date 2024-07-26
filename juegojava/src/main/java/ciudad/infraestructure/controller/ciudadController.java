package ciudad.infraestructure.controller;


import java.util.List;

import ciudad.application.ciudadUseCase;
import ciudad.domain.entity.ciudad;

public class ciudadController {
     private final ciudadUseCase ciudadusecase;

    public ciudadController(ciudadUseCase ciudadusecase) {
        this.ciudadusecase = ciudadusecase;
    }

    public List<ciudad> listarCiudad(){
        List<ciudad> listaCiudada = ciudadusecase.listarCiudades();
        return listaCiudada;
    }

}
