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
public class Percebe extends Animal {

    String alimento = "Fitoplacton";

    public void alimentar() {
        System.out.println(nombre + " se nutre de " + alimento);
    }

    @Override
    public String toString() {
        return "Percebe{ " + nombre + ", " + edad + ", " + peso + ", " + acuatico + " }";
    }
    
    
    
}
