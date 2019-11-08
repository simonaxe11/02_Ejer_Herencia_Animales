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
<<<<<<< HEAD
=======

>>>>>>> 0e2eecba3547c6630706d9fd036465a954349a68
    Acuatico acuatico;

    Animal perro1 = new Animal("pepito", 23, 12.5, Acuatico.ANFIBIO);

    public Animal(String nombre, int edad, double peso, Acuatico acuatico) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
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

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Acuatico getAcuatico() {
        return acuatico;
    }

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

<<<<<<< HEAD
      
    
    
=======
>>>>>>> 0e2eecba3547c6630706d9fd036465a954349a68
//---------------SIMON--------------------
//---------------JORGE--------------------
    public void alimentar() {
        System.out.println(nombre + " mastica y come <alimento>");
    }
<<<<<<< HEAD
    
    public void mostrar(){
        
        
    }
    
    

//---------------JORGE--------------------    

    @Override
    public String toString() {
        return "Animal{" + "nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + ", acuatico=" + acuatico + '}';
    }

    
=======

//---------------JORGE--------------------    
>>>>>>> 0e2eecba3547c6630706d9fd036465a954349a68
}
