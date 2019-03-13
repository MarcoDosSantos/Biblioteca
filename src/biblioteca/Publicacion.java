package biblioteca;

import java.util.List;
import java.util.Objects;

public class Publicacion {

    private List<Ejemplar> ejemplaresPrestables;
    private String nombre;
    private int isbn;
    private Categoria categoria;
    private List<Autor> autores;

    public Publicacion(List<Ejemplar> ejemplaresPrestables, String nombre, List<Autor> autores, int isbn) {
        this.ejemplaresPrestables = ejemplaresPrestables;
        this.nombre = nombre;
        this.autores = autores;
        this.isbn = isbn;
    }
    
    public Publicacion(){}

    public String getNombre() {
        return nombre;
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public int getIsbn() {
        return isbn;
    }

    public void agregarNuevoEjemplar(Ejemplar ejemplar) {
        this.ejemplaresPrestables.add(ejemplar);
    }

    public boolean tieneEjemplaresDisponibles() {
        return ejemplaresPrestables.size() > 0;
    }

    public Ejemplar prestarEjemplar() {
        Ejemplar ejemplar1 = new Ejemplar();
        for (Ejemplar ejemplar : ejemplaresPrestables) {
            ejemplaresPrestables.remove(0);
            ejemplar1 = ejemplar;
            return ejemplar;
        }
        return ejemplar1;
    }

    public void reingresarEjemplar(Ejemplar ejemplar) {
        this.ejemplaresPrestables.add(ejemplar);
    }

    public List<Ejemplar> getEjemplaresPrestables() {
        return ejemplaresPrestables;
    }

    public void setEjemplaresPrestables(List<Ejemplar> ejemplaresPrestables) {
        this.ejemplaresPrestables = ejemplaresPrestables;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Publicacion: " + "Nombre=" + nombre + ", isbn = " + isbn + ", categoria = " + categoria + ", autores = " + autores + '.';
    }

   
}
