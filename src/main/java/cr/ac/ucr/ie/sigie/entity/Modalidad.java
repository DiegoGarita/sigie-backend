package cr.ac.ucr.ie.sigie.entity;

import java.util.ArrayList;
import java.util.List;

public class Modalidad {
    private int idModalidad;
    private String tipoModalidad;
    private List<Curso> cursos;

    public Modalidad() {
        cursos = new ArrayList<>();
    }

    public int getIdModalidad() {
        return idModalidad;
    }

    public void setIdModalidad(int idModalidad) {
        this.idModalidad = idModalidad;
    }

    public String getTipoModalidad() {
        return tipoModalidad;
    }

    public void setTipoModalidad(String tipoModalidad) {
        this.tipoModalidad = tipoModalidad;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }
}
