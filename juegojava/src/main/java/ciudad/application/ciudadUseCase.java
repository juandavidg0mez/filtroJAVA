package ciudad.application;

import java.util.List;

import ciudad.domain.entity.ciudad;
import ciudad.domain.service.ciudadService;

public class ciudadUseCase {
    private ciudadService  ciudadservice;

    public ciudadUseCase(ciudadService ciudadservice) {
        this.ciudadservice = ciudadservice;
    }
    
    public List<ciudad> listarCiudades(){
        return ciudadservice.listarCiudades();
    }
}
