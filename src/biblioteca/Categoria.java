
package biblioteca;

import java.util.Objects;

public class Categoria {
    private String nombre, descripcion, codigo;

    public Categoria(String nombre, String descripcion, String codigo) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.codigo = codigo;
    }
    
    public Categoria(){}

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getCodigo() {
        return codigo;
    }
    
    public String toString(){
        return "Categoría: " + getNombre() + ", Descrpición: " + getDescripcion() + ", Código: " + getCodigo() + "\n";
    }

    
}
