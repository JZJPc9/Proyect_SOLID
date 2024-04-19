/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author juanc
 */
public class ElemetoUranio extends Espiritu{
    
    int danoradioactivo; 

    public ElemetoUranio(String nombre, int dano, int danoradioactivo) {
        super(nombre, dano);
        this.danoradioactivo = danoradioactivo;
    }
    
    
    public int dañototal(){
        int danot;
        danot = this.danoradioactivo * this.dano;
        return  danot ;
    }
}
