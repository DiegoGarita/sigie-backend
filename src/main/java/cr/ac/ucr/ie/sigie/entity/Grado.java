package cr.ac.ucr.ie.sigie.entity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;


@Entity
public class Grado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idGrado;
    private String nombre;
    private int totalCreditosMaximo;
    private int totalCreditosMinimo;
    @OneToMany
    private List<PlanEstudio> planesEstudio;

    public Grado() {
        planesEstudio = new ArrayList<>();
    }

    public int getIdGrado() {
        return idGrado;
    }

    public void setIdGrado(int idGrado) {
        this.idGrado = idGrado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTotalCreditosMaximo() {
        return totalCreditosMaximo;
    }

    public void setTotalCreditosMaximo(int totalCreditosMaximo) {
        this.totalCreditosMaximo = totalCreditosMaximo;
    }

    public int getTotalCreditosMinimo() {
        return totalCreditosMinimo;
    }

    public void setTotalCreditosMinimo(int totalCreditosMinimo) {
        this.totalCreditosMinimo = totalCreditosMinimo;
    }

    public List<PlanEstudio> getPlanesEstudio() {
        return planesEstudio;
    }

    public void setPlanesEstudio(List<PlanEstudio> planesEstudio) {
        this.planesEstudio = planesEstudio;
    }
}
