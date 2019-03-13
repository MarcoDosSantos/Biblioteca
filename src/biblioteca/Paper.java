package biblioteca;
//Un paper posee un ISBN, una lista de autores, una fecha de publicación, un resumen y una
//lista de ejemplares a prestar.

import java.util.List;

public class Paper extends Publicacion implements Imprimible {

    private String fechaPublicacion, resumen;

    public Paper(String fechaPublicacion, String resumen, List<Ejemplar> ejemplaresPrestables, String nombre, List<Autor> autores, int isbn) {
        super(ejemplaresPrestables, nombre, autores, isbn);
        this.fechaPublicacion = fechaPublicacion;
        this.resumen = resumen;
    }

    public Paper() {
    }

    public String getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(String fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    @Override
    public void imprimir() {
        Ejemplar ejemplar = new Ejemplar();
        ejemplar.setNumeroEdicion(2019);
        ejemplar.setPublicacion(this);
        super.agregarNuevoEjemplar(ejemplar);
        System.out.println(ejemplar.toString());
    }

}
