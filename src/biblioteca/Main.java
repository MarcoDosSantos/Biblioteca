package biblioteca;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String args[]){
        List<Ejemplar> biologiaCurtisEjemplares = new ArrayList<>();
        List<Ejemplar> fisicaConceptualHewittEjemplares = new ArrayList<>();
        List<Ejemplar> economiaMochonBekerEjemplares = new ArrayList<>();
        List<Ejemplar> donQuijoteEjemplares = new ArrayList<>();
        List<Ejemplar> obrasCompletasShakespeareEjemplares = new ArrayList<>();
        //Libro(List<Ejemplar> ejemplaresPrestables, String nombre, String autor, int isbn)
        List<Autor>autoresBiologiaCurtis = new ArrayList<>();
        autoresBiologiaCurtis.add(new Autor("Helena Curtis, Sue N. Barnes"));
        Libro biologiaCurtis = new Libro(biologiaCurtisEjemplares, "Biologia", autoresBiologiaCurtis, 978950060);
        List<Autor>autoresFisicaHewitt = new ArrayList<>();
        autoresFisicaHewitt.add(new Autor("Paul G. Hewitt"));
        Libro fisicaHewitt = new Libro(fisicaConceptualHewittEjemplares, "Física conceptual",autoresFisicaHewitt , 970260795);
        List<Autor>autoresEconomiaMochon = new ArrayList<>();
        autoresEconomiaMochon.add(new Autor("Francisco Mochón Morcillo y Víctor Alberto Beker"));
        Libro economiaMochonBeker = new Libro(economiaMochonBekerEjemplares, "Economía. Principios y aplicaciones", autoresEconomiaMochon, 844810814);
        List<Autor>autorQuijote = new ArrayList<>();
        autorQuijote.add(new Autor("Miguel de Cervantes Saavedra"));
        Libro donQuijote = new Libro(donQuijoteEjemplares, "El ingenioso hidalgo Don Quijote de la Mancha", autorQuijote, 844810555);
        List<Autor>williamShakespeare = new ArrayList<>();
        williamShakespeare.add(new Autor("William Shakespeare"));
        Libro obrasCompletasShakespeare = new Libro(obrasCompletasShakespeareEjemplares, "Obras Completas de William Shakespeare",williamShakespeare , 844810444);
        //Ejemplar(Libro libro, int numeroEdicion, String ubicacion)
        biologiaCurtisEjemplares.add(new Ejemplar(biologiaCurtis,1,"B-02-01"));
        biologiaCurtisEjemplares.add(new Ejemplar(biologiaCurtis,2,"B-02-01"));
        biologiaCurtisEjemplares.add(new Ejemplar(biologiaCurtis,3,"B-02-01"));
        biologiaCurtisEjemplares.add(new Ejemplar(biologiaCurtis,4,"B-02-01"));
        biologiaCurtisEjemplares.add(new Ejemplar(biologiaCurtis,5,"B-02-01"));
        
        fisicaConceptualHewittEjemplares.add(new Ejemplar(fisicaHewitt,6,"F-03-01"));
        fisicaConceptualHewittEjemplares.add(new Ejemplar(fisicaHewitt,7,"F-03-01"));
        fisicaConceptualHewittEjemplares.add(new Ejemplar(fisicaHewitt, 8,"F-03-01"));
        fisicaConceptualHewittEjemplares.add(new Ejemplar(fisicaHewitt, 9,"F-03-01"));
        fisicaConceptualHewittEjemplares.add(new Ejemplar(fisicaHewitt,10,"F-03-01"));
        
        economiaMochonBekerEjemplares.add(new Ejemplar(economiaMochonBeker, 11, "E-01-01"));
        economiaMochonBekerEjemplares.add(new Ejemplar(economiaMochonBeker, 12, "E-01-01"));
        economiaMochonBekerEjemplares.add(new Ejemplar(economiaMochonBeker, 13, "E-01-01"));
        economiaMochonBekerEjemplares.add(new Ejemplar(economiaMochonBeker, 14, "E-01-01"));
        economiaMochonBekerEjemplares.add(new Ejemplar(economiaMochonBeker, 15, "E-01-01"));
        //SocioVip(int cuotaMensual, String nombre, String apellido, int identificacion, List<Ejemplar> ejemplaresRetirados)
        List<Ejemplar> ejemplaresRetirados1 = new ArrayList<>();
        List<Ejemplar> ejemplaresRetirados2 = new ArrayList<>();
        SocioVip marcoDosSantos = new SocioVip(100, "Marco", "Dos Santos", 1, ejemplaresRetirados1);
        Socio deliaMaria = new Socio("Delia María", "Maturo", 2, ejemplaresRetirados2);
        List<Publicacion> librosBiblioteca = new ArrayList<>();
        List<Socio> sociosBiblioteca = new ArrayList<>();
        List<Prestamo> prestamosBiblioteca = new ArrayList<>();
        
        Map<Categoria, List<Publicacion>> diccionarioDeCategorias = new HashMap<>();
        Biblioteca biblioteca = new Biblioteca(librosBiblioteca, sociosBiblioteca, prestamosBiblioteca,diccionarioDeCategorias );
        
        librosBiblioteca.add(biologiaCurtis);
        librosBiblioteca.add(fisicaHewitt);        
        librosBiblioteca.add(economiaMochonBeker);
        librosBiblioteca.add(donQuijote);
        librosBiblioteca.add(obrasCompletasShakespeare);
        List<Ejemplar>neurocienciaYConductaEjemplares = new ArrayList<>();
        List<Autor> autoresneurocienciaYConducta = new ArrayList<>();
        autoresneurocienciaYConducta.add(new Autor("Thomas M. Jessell"));
        autoresneurocienciaYConducta.add(new Autor("Eric R Kandel"));
        autoresneurocienciaYConducta.add(new Autor("James H. Schwartz"));
        Libro neurocienciaYConducta = new Libro(neurocienciaYConductaEjemplares, "Neurociencia y conducta",autoresneurocienciaYConducta, 848966005);
        librosBiblioteca.add(neurocienciaYConducta);
        sociosBiblioteca.add(marcoDosSantos);
        
        sociosBiblioteca.add(deliaMaria);
        
        
        Categoria cienciasNaturales = new Categoria ("Ciencias Naturales", "Libros de Física, Química, Biología, etc.", "cien001");
                
        Categoria cienciasSociales = new Categoria("Ciencias Sociales", "Libros de Economía, Sociología, etc", "soc001");
        
        biblioteca.agregarPublicacionACategoria(cienciasNaturales, fisicaHewitt);
        
        biblioteca.agregarPublicacionACategoria(cienciasNaturales, biologiaCurtis);
        
        biblioteca.agregarPublicacionACategoria(cienciasNaturales, neurocienciaYConducta);
        
        biblioteca.agregarPublicacionACategoria(cienciasSociales, economiaMochonBeker);
        
        biblioteca.agregarPublicacionACategoria(new Categoria ("Literatura", "Obras maestras de la literatura universal", "lit001"), donQuijote);
        
        Categoria literaturaUniversal = donQuijote.getCategoria();
        
        biblioteca.agregarPublicacionACategoria(literaturaUniversal, obrasCompletasShakespeare);
        
        
        biblioteca.listarPublicacionesPorCategoria(cienciasNaturales);
        System.out.println("");
        biblioteca.listarPublicacionesPorCategoria(literaturaUniversal);
        System.out.println("");
        biblioteca.listarPublicacionesPorCategoria(cienciasSociales);
    }

}
