package cr.ac.ucr.ie.sigie.entity;

public class SubContenido {
    private int idSubContenido;
    private String subTema;
    private int ordenSubContenido;
    private Contenido contenido;

    public SubContenido() {
        contenido = new Contenido();
    }

    public int getIdSubContenido() {
        return idSubContenido;
    }

    public void setIdSubContenido(int idSubContenido) {
        this.idSubContenido = idSubContenido;
    }

    public String getSubTema() {
        return subTema;
    }

    public void setSubTema(String subTema) {
        this.subTema = subTema;
    }

    public int getOrdenSubContenido() {
        return ordenSubContenido;
    }

    public void setOrdenSubContenido(int ordenSubContenido) {
        this.ordenSubContenido = ordenSubContenido;
    }

    public Contenido getContenido() {
        return contenido;
    }

    public void setContenido(Contenido contenido) {
        this.contenido = contenido;
    }
}