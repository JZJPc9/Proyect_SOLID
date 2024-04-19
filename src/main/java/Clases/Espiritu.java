package Clases;


/**
 *
 * @author juanc
 */
public class Espiritu {
    String nombre;
    int dano;
    
    
    Espiritu(String nombre,int dano){
        this.nombre = nombre;
        this.dano = dano;
    }
    
    
    String hablar(){
        return "Hola soy el spituiru " + nombre;
    }
   
    int ataque(){
        return dano;
    }  
    
}
