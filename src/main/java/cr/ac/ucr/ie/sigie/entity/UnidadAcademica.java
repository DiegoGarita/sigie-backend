package cr.ac.ucr.ie.sigie.entity;

import java.util.ArrayList;
import java.util.List;

public class UnidadAcademica {
    private int idUnidadAcademica;
    private String nombreUnidadAcademica;
    private List<Curso> cursosPropios;
    private List<PlanEstudio> planesEstudio;

    public UnidadAcademica() {
        cursosPropios = new ArrayList<>();
        planesEstudio = new ArrayList<>();
    }

    public int getIdUnidadAcademica() {
        return idUnidadAcademica;
    }

    public void setIdUnidadAcademica(int idUnidadAcademica) {
        this.idUnidadAcademica = idUnidadAcademica;
    }

    public String getNombreUnidadAcademica() {
        return nombreUnidadAcademica;
    }

    public void setNombreUnidadAcademica(String nombreUnidadAcademica) {
        this.nombreUnidadAcademica = nombreUnidadAcademica;
    }

    public List<Curso> getCursosPropios() {
        return cursosPropios;
    }

    public void setCursosPropios(List<Curso> cursosPropios) {
        this.cursosPropios = cursosPropios;
    }

    public List<PlanEstudio> getPlanesEstudio() {
        return planesEstudio;
    }

    public void setPlanesEstudio(List<PlanEstudio> planesEstudio) {
        this.planesEstudio = planesEstudio;
    }
}
