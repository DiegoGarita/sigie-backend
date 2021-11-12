package cr.ac.ucr.ie.sigie.entity;

import java.util.ArrayList;
import java.util.List;

public class AreaDisciplinaria {
    private int idAreaDisciplinaria;
    private String nombreDisciplinaria;
    private List<Curso> cursos;

    public AreaDisciplinaria() {
        cursos = new ArrayList<>();
    }

    public int getIdAreaDisciplinaria() {
        return idAreaDisciplinaria;
    }

    public void setIdAreaDisciplinaria(int idAreaDisciplinaria) {
        this.idAreaDisciplinaria = idAreaDisciplinaria;
    }

    public String getNombreDisciplinaria() {
        return nombreDisciplinaria;
    }

    public void setNombreDisciplinaria(String nombreDisciplinaria) {
        this.nombreDisciplinaria = nombreDisciplinaria;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }
}
