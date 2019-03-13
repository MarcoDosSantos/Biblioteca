package biblioteca;

import java.util.Date;

public class Prestamo {
    private Ejemplar ejemplar;
    private Socio socio;
    private Date fechaDelDía = new Date();

    public Prestamo(Ejemplar ejemplar, Socio socio) {
        this.ejemplar = ejemplar;
        this.socio = socio;
    }

    public Ejemplar getEjemplar() {
        return ejemplar;
    }

    public Socio getSocio() {
        return socio;
    }

    public Date getFechaDelDía() {
        return fechaDelDía;
    }
    
     @Override
    public String toString(){
    return "Datos del préstamo:\nSocio: " + getSocio().toString() + 
            ", Ejemplar: " + ejemplar.toString() + "\nFecha: " + getFechaDelDía();
    }

}
