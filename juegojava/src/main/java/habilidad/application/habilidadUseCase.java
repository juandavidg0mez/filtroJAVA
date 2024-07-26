package habilidad.application;

import java.util.List;

import habilidad.domain.entity.habilidad;
import habilidad.domain.service.habilidadService;

public class habilidadUseCase {
    private habilidadService habilidadservice;

    public habilidadUseCase(habilidadService habilidadservice) {
        this.habilidadservice = habilidadservice;
    }
    
    public List<habilidad> listarHabilidadesPersonas(String skill){
        return habilidadservice.listarHabilidadesPersonas(skill);
    }
    public  habilidad crearHabilidad(habilidad skill){
        return habilidadservice.crearHabilidad(skill);
    }
}
