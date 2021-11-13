package cr.ac.ucr.ie.sigie.entity;


import javax.persistence.*;


@Entity
public class ItemPerfilSalida {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTipoPerfilSalida;
    private String descripcion;
    @ManyToOne
    private PlanEstudio planEstudio;
    @ManyToOne
    private TipoPerfilSalida tipoPerfilSalida;

    public ItemPerfilSalida() {
        planEstudio = new PlanEstudio();
        tipoPerfilSalida = new TipoPerfilSalida();
    }

    public int getIdTipoPerfilSalida() {
        return idTipoPerfilSalida;
    }

    public void setIdTipoPerfilSalida(int idTipoPerfilSalida) {
        this.idTipoPerfilSalida = idTipoPerfilSalida;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public PlanEstudio getPlanEstudio() {
        return planEstudio;
    }

    public void setPlanEstudio(PlanEstudio planEstudio) {
        this.planEstudio = planEstudio;
    }

    public TipoPerfilSalida getTipoPerfilSalida() {
        return tipoPerfilSalida;
    }

    public void setTipoPerfilSalida(TipoPerfilSalida tipoPerfilSalida) {
        this.tipoPerfilSalida = tipoPerfilSalida;
    }
}
