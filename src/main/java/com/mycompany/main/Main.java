/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.main;

/**
 *
 * @author blope
 */
public class Main {

    public static void main(String[] args) {
       
        //Creamos una nueva instancia de la clase SalaDeCine
        SalaDeCine sala = new SalaDeCine();

        //Agregamos peliculas a la sala
        sala.agregarPelicula(new Pelicula("Peli01", "Terror", "Director1", new Actor("Actor1", 25, "Española", 'M')));

        sala.agregarPelicula(new Pelicula("Peli02", "Terror", "Director2", new Actor("Actor2", 20, "Española", 'F')));

        sala.agregarPelicula(new Pelicula("Peli03", "Terror", "Director3", new Actor("Actor3", 25, "Española", 'M')));

        //Imprrimimos la lista de peliculas
        
        System.out.println("Lista de peliculas: ");
        System.out.println(sala.listarPeliculas());

    }
}
