package cr.ac.ucr.ie.sigie.entity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;


@Entity
public class Enfasis {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEnfasis;
    private String descripcion;
    @ManyToMany
    private List<Curso> cursos;
    @ManyToOne
    private PlanEstudio planEstudio;

    public Enfasis() {
        cursos = new ArrayList<>();
        planEstudio = new PlanEstudio();
    }

    public int getIdEnfasis() {
        return idEnfasis;
    }

    public void setIdEnfasis(int idEnfasis) {
        this.idEnfasis = idEnfasis;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    public PlanEstudio getPlanEstudio() {
        return planEstudio;
    }

    public void setPlanEstudio(PlanEstudio planEstudio) {
        this.planEstudio = planEstudio;
    }
}
