/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg02_ejer_herencia_animales;
//Aqui va la clase de animal
//--------SIMON------------

/** Clase abstracta que no puede ser instanciada 
 * por falta de sentido
 * @author PC
 */
public abstract class Animal {

    private String nombre;
    private int edad;
    private double peso;

    Acuatico acuatico;

    

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = 0.5;
        this.acuatico = acuatico;
    }

    public Animal() {
    }

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

    /** Peso deberá tener un peso original que 
    * podrá modificarse después.
    *
    */
    
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * Nos devuelve el hábitat del animal.
     * @return 
     */
    public Acuatico getAcuatico() {
        return acuatico;
    }

    /**
     * Nos muestra como se deszplaza cada animal
     */
    
    public void desplazar() {
        if (acuatico == Acuatico.ACUATICO) {
            System.out.println(nombre + " nada.");
        }
        if (acuatico == Acuatico.ANFIBIO) {
            System.out.println(nombre + " salta.");
        }
        if (acuatico == Acuatico.TERRESTRE) {
            System.out.println(nombre + " anda.");
        }else{
            System.out.println(nombre + " se desconoce su desplazamiento.");
        }
    }


//---------------SIMON--------------------
//---------------JORGE--------------------
    
    /**
     * Nos muestra de que se alimenta cada animal
     */
    public void alimentar() {
        System.out.println(nombre + " mastica y come <alimento>");
    }

    public void mostrar(){
        System.out.println(toString());
        

    }
    
    

//---------------JORGE--------------------    

    @Override
    public String toString() {
        return "Animal{" + "nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + ", acuatico=" + acuatico + '}';
    }



}
