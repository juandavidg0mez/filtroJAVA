package person.domain.entity;

import java.util.List;

import habilidad.domain.entity.habilidad;

public class person {
    private int id_person;
    private String name;
    private String lastname;
    private int id_city;
    private String address;
    private int age;
    private String email;
    private int idgenser;
    List<habilidad> lsitaHabilidades;

    public person() {
    }
    
    public person(int id_person, String name, String lastname, int id_city, String address, int age, String email,
            int idgenser, List<habilidad> lsitaHabilidades) {
        this.id_person = id_person;
        this.name = name;
        this.lastname = lastname;
        this.id_city = id_city;
        this.address = address;
        this.age = age;
        this.email = email;
        this.idgenser = idgenser;
        this.lsitaHabilidades = lsitaHabilidades;
    }

    public int getId_person() {
        return id_person;
    }
    public void setId_person(int id_person) {
        this.id_person = id_person;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public int getId_city() {
        return id_city;
    }
    public void setId_city(int id_city) {
        this.id_city = id_city;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getIdgenser() {
        return idgenser;
    }
    public void setIdgenser(int idgenser) {
        this.idgenser = idgenser;
    }

    public List<habilidad> getLsitaHabilidades() {
        return lsitaHabilidades;
    }

    public void setLsitaHabilidades(List<habilidad> lsitaHabilidades) {
        this.lsitaHabilidades = lsitaHabilidades;
    }
    

}


