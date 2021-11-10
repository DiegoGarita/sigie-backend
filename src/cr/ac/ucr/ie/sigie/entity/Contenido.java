package cr.ac.ucr.ie.sigie.entity;

import java.util.ArrayList;
import java.util.List;

public class Contenido {
    private int idContenido;
    private String tema;
    private int ordenContenido;
    private List<SubContenido> subContenidos;
    private Curso curso;

    public Contenido() {
        subContenidos = new ArrayList<>();
        curso = new Curso();
    }

    public int getIdContenido() {
        return idContenido;
    }

    public void setIdContenido(int idContenido) {
        this.idContenido = idContenido;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public int getOrdenContenido() {
        return ordenContenido;
    }

    public void setOrdenContenido(int ordenContenido) {
        this.ordenContenido = ordenContenido;
    }

    public List<SubContenido> getSubContenidos() {
        return subContenidos;
    }

    public void setSubContenidos(List<SubContenido> subContenidos) {
        this.subContenidos = subContenidos;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
}
