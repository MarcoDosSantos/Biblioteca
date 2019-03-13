package biblioteca;

import java.util.List;

public class Socio {

    private String nombre, apellido;
    private int identificacion;
    protected List<Ejemplar> ejemplaresRetirados;
    

    public Socio(String nombre, String apellido, int identificacion, List<Ejemplar> ejemplaresRetirados) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.identificacion = identificacion;
        this.ejemplaresRetirados = ejemplaresRetirados;
        
    }
    
    public Socio(){}

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getIdentificacion() {
        return identificacion;
    }
  

    public boolean tieneCupoDisponible() {
        return ejemplaresRetirados.size() < 3;
    }

    public void tomarPrestadoUnEjemplar(Ejemplar ejemplar) {
        if (tieneCupoDisponible()) {
            ejemplaresRetirados.add(ejemplar);
        }
    }
    
    public void devolverUnEjemplar(Ejemplar ejemplar){
        ejemplaresRetirados.remove(ejemplar);
        System.out.println("El socio " + toString() + " ha devuelto el ejemplar: " + ejemplar.toString());
    }

    public List<Ejemplar> getEjemplaresRetirados() {
        return ejemplaresRetirados;
    }
    
        
     @Override
    public String toString(){
        return "Nombre: " + getNombre() + ", Apellido: " + getApellido() + 
            ", Número de identificación: " + getIdentificacion() + 
            ", cantidad de ejemplares en su poder: " + getEjemplaresRetirados().size() + ".\nTipo de socio: Standard.";
    }

}
