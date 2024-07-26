package habilidad.domain.entity;

import java.util.List;

public class habilidad {
    private int id_habilidad;
    private String  nombre_habilidad;
    private List<String> listhabilidad;
    public habilidad() {
    }
    public habilidad(int id_habilidad, String nombre_habilidad, List<String> listhabilidad) {
        this.id_habilidad = id_habilidad;
        this.nombre_habilidad = nombre_habilidad;
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

    
}
