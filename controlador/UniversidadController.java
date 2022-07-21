
package controlador;

import modelo.Universidad;
import java.util.ArrayList;


public class UniversidadController {
    //ATRIBUTOS
    private ArrayList<Universidad> universidades;
    
    //CONSTRUCTOR

    public UniversidadController(){
        universidades = new ArrayList<Universidad>();
    }
    
    //CONSULTORES

    public Universidad getUniversidad(int index) {
        return universidades.get(index);
    }
    
    public int getSizeUniversidad(){
        return universidades.size();
    }
    
    //MODIFICADORES
    
    public void setUniversidad(Universidad universidad, int index){
        universidades.set(index, universidad);
    }

    public void setUniversidad(Universidad universidad){
        universidades.add(universidad);
    }
    
    //ACCIONES
    
    public void registrarUniversidad(String nombre, String NIT, String telefono, String direccion){
        Universidad objUniversidad = new Universidad(nombre, NIT, telefono, direccion);
        universidades.add(objUniversidad);
    }
    
    public void actualizarUniversidad (String nombre, String NIT, String telefono, String direccion){
        int index = buscarXNIT(NIT);
        if (index > -1){
            getUniversidad(index).setNombre(nombre);
            getUniversidad(index).setTelefono(telefono);
            getUniversidad(index).setDireccion(direccion);
        }
    }

    
    public int buscarXNIT(String NIT){
        int index = -1;
        for(int i = 0; i < getSizeUniversidad(); i++){
            Universidad obj = getUniversidad(i);
            if(obj.getNIT().equalsIgnoreCase(NIT)){
                index = i;
                break;
            }
        }

        return index;
    }
    
}