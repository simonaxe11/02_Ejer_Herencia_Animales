/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg02_ejer_herencia_animales;
//Aqui va la clase de animal
//--------SIMON------------
/**
 *
 * @author PC
 */
public class Animal {
    String nombre;
    int edad;
    double peso;
    boolean acuatico;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isAcuatico() {
        return acuatico;
    }  
//---------------SIMON--------------------
}
