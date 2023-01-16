/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

import java.util.ArrayList;

/**
 *
 * @author blope
 */
public class SalaDeCine {
    
    
    /**
     * ArrayList de peliculas
     */
    private ArrayList<Pelicula> peliculas;

    /**
     * Constructor de la clase SalaDeCine
     */
    public SalaDeCine() {
        peliculas = new ArrayList<>();
    }

    /**
     * Método para agregar una pelicula a la sala
     * @param pelicula
     * @return 
     */
    public String agregarPelicula(Pelicula pelicula){
        
        if (buscarPelicula(pelicula.getTitulo())) {
            return "La película ya existe";
        } else {
            peliculas.add(pelicula);
            return "La película se agregó correctamente";
        }

    }

    /**
     * Método para buscar una pelicula por el titulo
     * @param titulo
     * @return - true si la encuentra, false si no la encuentra
     */
    public boolean buscarPelicula(String titulo) {
        for (Pelicula pelicula : peliculas) {
            if (pelicula.getTitulo().equals(titulo)) {
                return true;
            }
        }

        return false;
    }

    /**
     * Método para listar las peliculas
     * @return  - String con las peliculas
     */
    public String listarPeliculas() {

        String lista = "";

        for (Pelicula pelicula : peliculas) {
             
            lista += pelicula.getTitulo() + " - " + pelicula.getGenero() + " - " + pelicula.getDirector() + " - " + pelicula.getProtagonista().getNombre() + " - " + pelicula.getProtagonista().getEdad() + " - " + pelicula.getProtagonista().getSexo() + "\n" ; 

        }

        return lista;

    }

    /**
     * Método para obtener el numero de actrices
     * @return - int con el numero de actrices
     */
    public int obtenerActricesMujeres() {
        int contador = 0;
        for (Pelicula pelicula : peliculas) {
            if (pelicula.getProtagonista().getSexo() == 'M') {
                contador++;
            }
        }
        return contador;
    }

    /**
     * Método para obtener el numero de actores jovenes
     * @return - int con el numero de actores jovenes (entre 18 y 30 años)
     */
    public int obtenerActoresJovenes() {
        System.out.println("Actores Por edad: ");
        int contador = 0;
        for (Pelicula pelicula : peliculas) {
            if (pelicula.getProtagonista().getEdad() < 30 && pelicula.getProtagonista().getEdad() > 18 ) {
                contador++;
            }
        }
        return contador;
    }
        

}
