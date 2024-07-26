package person.domain.service;

import habilidad.domain.entity.habilidad;
import person.domain.entity.person;

public interface personService {
    person  agregaPerson(person perso);
    void eliminarPerson(int id_person);
    person asignarHabilidad(habilidad skill);
}
