package cr.ac.ucr.ie.sigie.entity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;


@Entity
public class UnidadAcademica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUnidadAcademica;
    private String nombreUnidadAcademica;
    @ManyToMany
    private List<Curso> cursosPropios;
    @ManyToMany
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
