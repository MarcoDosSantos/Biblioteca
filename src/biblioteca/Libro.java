
package biblioteca;

import java.util.List;

public class Libro extends Publicacion implements Imprimible{

    public Libro(List<Ejemplar> ejemplaresPrestables, String nombre, List<Autor> autores, int isbn) {
        super(ejemplaresPrestables, nombre, autores, isbn);
    }
       
    public Libro() {
    }
    
    
     @Override
    public String toString(){
    return "Obra: " + getNombre() + ", \nAutor: " + getAutores().toString() + 
            ", ISBN: " +  getIsbn() + ", ejemplares disponibles: " + getEjemplaresPrestables().size() + "\n";
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
