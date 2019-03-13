package biblioteca;

import java.util.List;

public class Revista extends Publicacion {

    private String fechaPublicacion;

    public Revista(String fechaPublicacion, List<Ejemplar> ejemplaresPrestables, String nombre, List<Autor> autores, int isbn) {
        super(ejemplaresPrestables, nombre, autores, isbn);
        this.fechaPublicacion = fechaPublicacion;
    }

    public Revista() {
    }

    public String getFechaPublicacion() {
        return fechaPublicacion;
    }

}
