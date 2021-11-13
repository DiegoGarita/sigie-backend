package cr.ac.ucr.ie.sigie.entity;


import javax.persistence.*;


@Entity
public class ResultadosAprendizaje {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idResultadoAprendizaje;
    private String descripcion;

    public ResultadosAprendizaje() {
    }

    public int getIdResultadoAprendizaje() {
        return idResultadoAprendizaje;
    }

    public void setIdResultadoAprendizaje(int idResultadoAprendizaje) {
        this.idResultadoAprendizaje = idResultadoAprendizaje;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
