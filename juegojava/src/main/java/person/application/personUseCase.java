package person.application;

import habilidad.domain.entity.habilidad;
import person.domain.entity.person;
import person.domain.service.personService;

public class personUseCase {

    private personService personaservice;


    public person  agregaPerson(person perso){
        return personaservice.agregaPerson(perso);
    }

    public void eliminarPerson(int id_person){
        personaservice.eliminarPerson(id_person);
    }

    public person asignarHabilidad(habilidad skill){
        return personaservice.asignarHabilidad(skill);
    }
}
