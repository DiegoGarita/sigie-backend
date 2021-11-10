package cr.ac.ucr.ie.sigie.entity;

import java.util.ArrayList;
import java.util.List;

public class ItemPerfilEntrada {
    private int idTipoPerfilEntrada;
    private String descripcion;
    private PlanEstudio planEstudio;
    private List<TipoPerfilEntrada> tiposPerfilEntrada;

    public ItemPerfilEntrada() {
        planEstudio = new PlanEstudio();
        tiposPerfilEntrada = new ArrayList<>();
    }

    public int getIdTipoPerfilEntrada() {
        return idTipoPerfilEntrada;
    }

    public void setIdTipoPerfilEntrada(int idTipoPerfilEntrada) {
        this.idTipoPerfilEntrada = idTipoPerfilEntrada;
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

    public List<TipoPerfilEntrada> getTiposPerfilEntrada() {
        return tiposPerfilEntrada;
    }

    public void setTiposPerfilEntrada(List<TipoPerfilEntrada> tiposPerfilEntrada) {
        this.tiposPerfilEntrada = tiposPerfilEntrada;
    }
}
