
package biblioteca;

public class Ejemplar {
    private Publicacion publicacion;
    private int numeroEdicion;
    private String ubicacion;

    public Ejemplar(Publicacion publicacion, int numeroEdicion, String ubicacion) {
        this.publicacion = publicacion;
        this.numeroEdicion = numeroEdicion;
        this.ubicacion = ubicacion;
    }
    
    public Ejemplar(){}

    public Publicacion getPublicacion() {
        return publicacion;
    }

    public int getNumeroEdicion() {
        return numeroEdicion;
    }

    public void setPublicacion(Publicacion publicacion) {
        this.publicacion = publicacion;
    }

    public void setNumeroEdicion(int numeroEdicion) {
        this.numeroEdicion = numeroEdicion;
    }
    
    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    @Override
    public String toString() {
        return "Ejemplar{" + "publicacion=" + publicacion + ", numeroEdicion=" + numeroEdicion + ", ubicacion=" + ubicacion + '}';
    }
    
    
    
}
