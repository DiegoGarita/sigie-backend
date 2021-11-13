package cr.ac.ucr.ie.sigie.entity;


import javax.persistence.*;


@Entity
public class TipoPerfilEntrada {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTipo;
    private String nombreTipo;
    @ManyToOne
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
