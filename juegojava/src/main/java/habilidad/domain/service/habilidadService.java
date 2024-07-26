package habilidad.domain.service;

import java.util.List;

import habilidad.domain.entity.habilidad;

public interface habilidadService {
    List<habilidad> listarHabilidadesPersonas(String skill);
    habilidad crearHabilidad(habilidad skill);
}
