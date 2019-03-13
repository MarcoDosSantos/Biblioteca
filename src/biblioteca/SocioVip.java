package biblioteca;

import java.util.List;

public class SocioVip extends Socio{
    private int cuotaMensual;
    

    public SocioVip(int cuotaMensual, String nombre, String apellido, int identificacion, List<Ejemplar> ejemplaresRetirados) {
        super(nombre, apellido, identificacion, ejemplaresRetirados);
        this.cuotaMensual = cuotaMensual;
        
    }

    public int getCuotaMensual() {
        return cuotaMensual;
    }
    
    public void setCuotaMensual(int coutaMensual){
        this.cuotaMensual = coutaMensual;
    }  
    
    @Override
    public boolean tieneCupoDisponible() {
        return this.ejemplaresRetirados.size() < 15;
    }

    
    
     @Override
    public String toString(){
        return "Nombre: " + getNombre() + ", Apellido: " + getApellido() + 
            ", Número de identificación: " + getIdentificacion() + 
            ", cantidad de ejemplares en su poder: " + getEjemplaresRetirados().size() + ".\nTipo de socio: VIP.";
    }

    
   
}
