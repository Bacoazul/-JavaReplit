
package modelo;

public class Universidad {
    //ATRIBUTOS
    String nombre;
    String NIT;
    String telefono;
    String direccion;

    //CONSTRUCTOR
    public Universidad(String nombre, String NIT, String telefono, String direccion) {
        this.nombre = nombre;
        this.NIT = NIT;
        this.telefono = telefono;
        this.direccion = direccion;
    }
    
    //CONSULTORES

    public String getNombre() {
        return nombre;
    }

    public String getNIT() {
        return NIT;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }
    
    //MODIFICADORES

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNIT(String NIT) {
        this.NIT = NIT;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
    
}