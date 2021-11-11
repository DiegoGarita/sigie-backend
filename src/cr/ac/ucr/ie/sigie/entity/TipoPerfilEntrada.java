package cr.ac.ucr.ie.sigie.entity;

public class TipoPerfilEntrada {
    private int idTipo;
    private String nombreTipo;
    private ItemPerfilEntrada itemPerfilEntrada;

    public TipoPerfilEntrada() {
        itemPerfilEntrada = new ItemPerfilEntrada();
    }

    public int getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
    }

    public String getNombreTipo() {
        return nombreTipo;
    }

    public void setNombreTipo(String nombreTipo) {
        this.nombreTipo = nombreTipo;
    }

    public ItemPerfilEntrada getItemPerfilEntrada() {
        return itemPerfilEntrada;
    }

    public void setItemPerfilEntrada(ItemPerfilEntrada itemPerfilEntrada) {
        this.itemPerfilEntrada = itemPerfilEntrada;
    }
}
