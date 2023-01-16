/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author blope
 */
public class Actor {
    
    private String nombre;
    private int edad;
    private String nacionalidad;
    private char sexo;

    public Actor(String nombre, int edad, String nacionalidad, char sexo) {
        this.nombre = nombre;
        setEdad(edad);
        this.nacionalidad = nacionalidad;
        setSexo(sexo);
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
        if(edad >= 18){
            this.edad = edad;
        }else{
            System.out.println("Edad no válida");
        }
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        if(sexo == 'M' || sexo == 'F'){
            this.sexo = sexo;
        }else{
            System.out.println("Sexo no válido");
        }
    }

    @Override
    public String toString() {
        return "Actor{" + "nombre=" + nombre + ", edad=" + edad + ", nacionalidad=" + nacionalidad + ", sexo=" + sexo + '}';
    }



}
