package biblioteca;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Biblioteca {

    private List<Publicacion> publicaciones;
    private List<Socio> socios;
    private List<Prestamo> prestamos;
    private Map<Categoria, List<Publicacion>> diccionarioDeCategorias;

    public Biblioteca(List<Publicacion> publicaciones, List<Socio> socios, List<Prestamo> prestamos, Map<Categoria, List<Publicacion>> diccionarioDeCategorias) {
        this.publicaciones = publicaciones;
        this.socios = socios;
        this.prestamos = prestamos;
        this.diccionarioDeCategorias = diccionarioDeCategorias;
    }

    
    public Map<Categoria, List<Publicacion>> getDiccionarioDeCategorias() {
        return diccionarioDeCategorias;
    }

    public void setDiccionarioDeCategorias(Map<Categoria, List<Publicacion>> diccionarioDeCategorias) {
        this.diccionarioDeCategorias = diccionarioDeCategorias;
    }

    public void prestar(int isbn, int identificacion) {
        Publicacion publicacionBuscada = new Publicacion();
        for (Publicacion publicacion: publicaciones) {
            if (isbn == publicacion.getIsbn()) {
                publicacionBuscada = publicacion;
            }
        }
        Socio socioBuscado = new Socio();
        for (Socio socio : socios) {
            if (identificacion == socio.getIdentificacion()) {
                socioBuscado = socio;
            }
        }
        Ejemplar ejemplar = new Ejemplar();
        if (publicacionBuscada.tieneEjemplaresDisponibles() && socioBuscado.tieneCupoDisponible()) {
            ejemplar = publicacionBuscada.prestarEjemplar();
            socioBuscado.tomarPrestadoUnEjemplar(ejemplar);
            Prestamo prestamo = new Prestamo(ejemplar, socioBuscado);
            System.out.println(prestamo.toString());
        }
    }

    public void devolver(Ejemplar ejemplar, int identificacion) {
        Socio socio1 = new Socio();
        Publicacion publicacion1 = new Publicacion();
        for (Socio socio : socios) {
            if (identificacion == socio.getIdentificacion()) {
                socio1 = socio;
                socio.devolverUnEjemplar(ejemplar);
            }
        }
        for (Publicacion publicacion: publicaciones) {
            if (publicacion.equals(ejemplar.getPublicacion())) {
                publicacion1 = ejemplar.getPublicacion();
                publicacion.reingresarEjemplar(ejemplar);
            }
        }

        System.out.println("El socio " + socio1.toString() + " ha devuelto un ejemplar de la publicación: " + publicacion1.toString());
    }

    public void prestarUnEjemplarDeCadaISBN(List<Integer> isbns, int identificacion) {
        List<Publicacion> publicacionesBuscadas = new ArrayList<>();
        for (Integer isbn : isbns) {
            for (Publicacion publicacion: publicaciones) {
                if (isbn == publicacion.getIsbn()) {
                    publicacionesBuscadas.add(publicacion);
                }
            }
        }
        Socio socioBuscado = new Socio();
        for (Socio socio : socios) {
            if (identificacion == socio.getIdentificacion()) {
                socioBuscado = socio;
            }
        }
        for (Publicacion publicacion: publicacionesBuscadas) {
            if (publicacion.tieneEjemplaresDisponibles() && socioBuscado.tieneCupoDisponible()) {
                Ejemplar ejemplar = publicacion.prestarEjemplar();
                socioBuscado.tomarPrestadoUnEjemplar(ejemplar);
                Prestamo prestamo = new Prestamo(ejemplar, socioBuscado);
                this.prestamos.add(prestamo);
                System.out.println(prestamo.toString());

            }
        }

    }

    public void devolverVariosEjemplares(List<Ejemplar> ejemplares, int identificacion) {
        Socio socio = new Socio();
        Publicacion publicacion = new Publicacion();
        for (Ejemplar ejemplar : ejemplares) {
            socio.devolverUnEjemplar(ejemplar);
            publicacion.reingresarEjemplar(ejemplar);
        }
    }

    public void agregarPublicacionACategoria(Categoria categoria, Publicacion publicacion) {
        List<Publicacion> publicacionesDeLaCategoria = new ArrayList<>();
        for (Publicacion publicacion1: publicaciones){
            if(publicacion1.getCategoria()== categoria){
                publicacionesDeLaCategoria.add(publicacion1);
            }
        }
        //if (diccionarioDeCategorias.containsKey(categoria)) {
            publicacionesDeLaCategoria.add(publicacion);
            publicacion.setCategoria(categoria);            
            diccionarioDeCategorias.put(categoria, publicacionesDeLaCategoria);
            
        /*} else if (diccionarioDeCategorias.containsKey(categoria)== false){
            publicacionesDeLaCategoria.add(publicacion);
            publicacion.setCategoria(categoria);
            Scanner intro = new Scanner(System.in);
            System.out.println("Ingrese el nombre de la nueva categoría: ");
            String nombreCat = intro.nextLine();
            System.out.println("Ingrese la descripción de la nueva categoría: ");
            String descripcionCat = intro.nextLine();
            System.out.println("Ingrese el código de la nueva categoría: ");
            String codigoCat = intro.nextLine();
            diccionarioDeCategorias.put(new Categoria(nombreCat, descripcionCat, codigoCat), publicacionesDeLaCategoria);
        }*/

    }

    public List<Publicacion> listarPublicacionesDeUnaCategoria(Categoria categoria) {
        System.out.println(categoria.toString());
        System.out.println("Pulicaciones de la categoría: ");
        for (Publicacion publicacion: publicaciones) {
            if (publicacion.getCategoria().equals(categoria)) {
                System.out.println(publicacion.toString());
            }
        }

        return publicaciones;
    }
    
    /* public void mostrarRopa(){        
        for(Integer clave: diccionarioRopa.keySet()){
            System.out.println(clave + "- " + diccionarioRopa.get(clave).toString());           
        }    
    }*/

    public List<Publicacion> listarPublicacionesPorCategoria(Categoria categoria) {
        for(Categoria clave: diccionarioDeCategorias.keySet()){
            if(categoria.equals(clave)){
                System.out.println(clave + "- " + diccionarioDeCategorias.get(clave).toString());
            }
        }            
        return publicaciones;
    }

    public Categoria informarCategoriaDeUnaPublicacion(Publicacion publicacion) {
        Categoria categoria = publicacion.getCategoria();
        System.out.println(publicacion.toString());
        System.out.println(categoria.toString());
        return categoria;
    }
    
    public void imprimirNuevosEjemplares(List<Imprimible> imprimibles){
        for(Imprimible imprimible: imprimibles){
            imprimible.imprimir();
        }
    }

}
