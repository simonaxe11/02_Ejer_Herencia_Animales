/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg02_ejer_herencia_animales;

/** Clase Perro para controlar las caracteristicas del perro
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
        System.out.println(getNombre() + " dice: Guau guau guau!");
    }
    
    /**
     * Muestra como se desplaza el perro
     */
    
    public void desplazar(){
        System.out.println(getNombre() + " corre contento.");
    }

    @Override
    public String toString() {
        return "Perro{" + "RazaDelPerro=" + RazaDelPerro + '}';
    }
    
    
    
}
