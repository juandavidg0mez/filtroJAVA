package person.domain.service;




import person.domain.entity.person;

public interface personService {
    person  agregaPerson(person perso);
    void eliminarPerson(int id_person);
    person asignarHabilidad(int id_skill);
}
