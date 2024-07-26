package habilidad.domain.entity;

import java.util.List;

public class habilidad {
    private int id_habilidad;
    private String  nombre_habilidad;
    private String nombre_persona;
    private List<String> listhabilidad;
    public habilidad() {
    }
    
    public habilidad(int id_habilidad, String nombre_habilidad, String nombre_persona, List<String> listhabilidad) {
        this.id_habilidad = id_habilidad;
        this.nombre_habilidad = nombre_habilidad;
        this.nombre_persona = nombre_persona;
        this.listhabilidad = listhabilidad;
    }
    
    public int getId_habilidad() {
        return id_habilidad;
    }
    public void setId_habilidad(int id_habilidad) {
        this.id_habilidad = id_habilidad;
    }
    public String getNombre_habilidad() {
        return nombre_habilidad;
    }
    public void setNombre_habilidad(String nombre_habilidad) {
        this.nombre_habilidad = nombre_habilidad;
    }
    public List<String> getListhabilidad() {
        return listhabilidad;
    }
    public void setListhabilidad(List<String> listhabilidad) {
        this.listhabilidad = listhabilidad;
    }

    public String getNombre_persona() {
        return nombre_persona;
    }

    public void setNombre_persona(String nombre_persona) {
        this.nombre_persona = nombre_persona;
    }

    
}
