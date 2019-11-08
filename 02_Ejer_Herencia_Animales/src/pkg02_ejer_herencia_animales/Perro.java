/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg02_ejer_herencia_animales;

/**
 *
 * @author PC
 */
public class Perro extends Animal {
    String RazaDelPerro;

    public String getRazaDelPerro() {
        return RazaDelPerro;
    }

    public void setRazaDelPerro(String RazaDelPerro) {
        this.RazaDelPerro = RazaDelPerro;
    }

    public void ladrar(){
        System.out.println(this.perro1.nombre + " dice: Guau guau guau!");
    }
    
    public void desplazar(){
        System.out.println(this.perro1.nombre + " corre contento.");
    }

    @Override
    public String toString() {
        return "Perro{" + "RazaDelPerro=" + RazaDelPerro + '}';
    }
    
    
    
}
