package Clases;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juanc
 */
public class ElementoFuego extends Espiritu{
    
    int danoporquemadura;
    int temperatura;

    public ElementoFuego(String nombre, int dano,int danoporquemadura, int temperatura) {
        super(nombre, dano);
        this.danoporquemadura = danoporquemadura;
        this.temperatura = temperatura;
    }
    
    public int dañototal(){
        int danot;
        danot = this.danoporquemadura * this.dano;
        return  danot ;
    }
    
    
    
}
