package cr.ac.ucr.ie.sigie.entity;


import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;


@Entity
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCurso;
    private String sigla;
    private String nombre;
    private int creditos;
    private String ciclo;
    private boolean electivo;
    private int horasTeoria;
    private int horasPractica;
    private int horasLaboratorio;
    private int horasTeoricoPractica;
    private String objetivoGeneral;
    @OneToMany
    private List<Curso> electivos;
    @ManyToMany
    private List<Curso> requisitos;
    @ManyToMany
    private List<Curso> correquisitos;
    @OneToMany
    private List<Contenido> contenidos;
    @OneToMany
    private List<ItemDescripcion> itemesDescripcion;
    @OneToMany
    private List<ReferenciaBibliografica> referenciasBibliograficas;
    @OneToMany
    private List<ResultadosAprendizaje> resultadosDeAprendizaje;
    @ManyToOne
    private Modalidad modalidad;
    @ManyToOne
    private AreaDisciplinaria areaDisciplinaria;
    @ManyToMany
    private List<Enfasis> enfasis;
    @ManyToOne
    private PlanEstudio planEstudio;
    @ManyToMany
    private List<UnidadAcademica> unidadesAcademicasPropietarias;

    public Curso() {
        electivos = new ArrayList<>();
        requisitos = new ArrayList<>();
        correquisitos = new ArrayList<>();
        contenidos = new ArrayList<>();
        itemesDescripcion = new ArrayList<>();
        referenciasBibliograficas = new ArrayList<>();
        resultadosDeAprendizaje = new ArrayList<>();
        modalidad = new Modalidad();
        areaDisciplinaria = new AreaDisciplinaria();
        enfasis = new ArrayList<>();
        planEstudio = new PlanEstudio();
        unidadesAcademicasPropietarias = new ArrayList<>();
    }

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public String getCiclo() {
        return ciclo;
    }

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }

    public boolean isElectivo() {
        return electivo;
    }

    public void setElectivo(boolean electivo) {
        this.electivo = electivo;
    }

    public int getHorasTeoria() {
        return horasTeoria;
    }

    public void setHorasTeoria(int horasTeoria) {
        this.horasTeoria = horasTeoria;
    }

    public int getHorasPractica() {
        return horasPractica;
    }

    public void setHorasPractica(int horasPractica) {
        this.horasPractica = horasPractica;
    }

    public int getHorasLaboratorio() {
        return horasLaboratorio;
    }

    public void setHorasLaboratorio(int horasLaboratorio) {
        this.horasLaboratorio = horasLaboratorio;
    }

    public int getHorasTeoricoPractica() {
        return horasTeoricoPractica;
    }

    public void setHorasTeoricoPractica(int horasTeoricoPractica) {
        this.horasTeoricoPractica = horasTeoricoPractica;
    }

    public String getObjetivoGeneral() {
        return objetivoGeneral;
    }

    public void setObjetivoGeneral(String objetivoGeneral) {
        this.objetivoGeneral = objetivoGeneral;
    }

    public List<Curso> getElectivos() {
        return electivos;
    }

    public void setElectivos(List<Curso> electivos) {
        this.electivos = electivos;
    }

    public List<Curso> getRequisitos() {
        return requisitos;
    }

    public void setRequisitos(List<Curso> requisitos) {
        this.requisitos = requisitos;
    }

    public List<Curso> getCorrequisitos() {
        return correquisitos;
    }

    public void setCorrequisitos(List<Curso> correquisitos) {
        this.correquisitos = correquisitos;
    }

    public List<Contenido> getContenidos() {
        return contenidos;
    }

    public void setContenidos(List<Contenido> contenidos) {
        this.contenidos = contenidos;
    }

    public List<ItemDescripcion> getItemesDescripcion() {
        return itemesDescripcion;
    }

    public void setItemesDescripcion(List<ItemDescripcion> itemesDescripcion) {
        this.itemesDescripcion = itemesDescripcion;
    }

    public List<ReferenciaBibliografica> getReferenciasBibliograficas() {
        return referenciasBibliograficas;
    }

    public void setReferenciasBibliograficas(List<ReferenciaBibliografica> referenciasBibliograficas) {
        this.referenciasBibliograficas = referenciasBibliograficas;
    }

    public List<ResultadosAprendizaje> getResultadosDeAprendizaje() {
        return resultadosDeAprendizaje;
    }

    public void setResultadosDeAprendizaje(List<ResultadosAprendizaje> resultadosDeAprendizaje) {
        this.resultadosDeAprendizaje = resultadosDeAprendizaje;
    }

    public Modalidad getModalidad() {
        return modalidad;
    }

    public void setModalidad(Modalidad modalidad) {
        this.modalidad = modalidad;
    }

    public AreaDisciplinaria getAreaDisciplinaria() {
        return areaDisciplinaria;
    }

    public void setAreaDisciplinaria(AreaDisciplinaria areaDisciplinaria) {
        this.areaDisciplinaria = areaDisciplinaria;
    }

    public List<Enfasis> getEnfasis() {
        return enfasis;
    }

    public void setEnfasis(List<Enfasis> enfasis) {
        this.enfasis = enfasis;
    }

    public PlanEstudio getPlanEstudio() {
        return planEstudio;
    }

    public void setPlanEstudio(PlanEstudio planEstudio) {
        this.planEstudio = planEstudio;
    }

    public List<UnidadAcademica> getUnidadesAcademicasPropietarias() {
        return unidadesAcademicasPropietarias;
    }

    public void setUnidadesAcademicasPropietarias(List<UnidadAcademica> unidadesAcademicasPropietarias) {
        this.unidadesAcademicasPropietarias = unidadesAcademicasPropietarias;
    }
}
