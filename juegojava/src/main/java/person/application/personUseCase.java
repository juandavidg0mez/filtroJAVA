package person.application;


import person.domain.entity.person;
import person.domain.service.personService;

public class personUseCase {

    private personService personaservice;


    public personUseCase(personService personaservice) {
        this.personaservice = personaservice;
    }

    public person  agregaPerson(person perso){
        return personaservice.agregaPerson(perso);
    }

    public void eliminarPerson(int id_person){
        personaservice.eliminarPerson(id_person);
    }

    public  person asignarHabilidadApersona(int skill){
        return personaservice.asignarHabilidad(skill);
    }
      
}
