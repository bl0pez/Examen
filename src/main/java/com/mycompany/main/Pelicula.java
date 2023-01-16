/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author blope
 */
public class Pelicula {
    
    private String titulo;
    private String genero;
    private String director;
    private Actor protagonista;

    public Pelicula(String titulo, String genero, String director, Actor protagonista) {
        setTitulo(titulo);
        this.genero = genero;
        this.director = director;
        this.protagonista = protagonista;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo.length() == 6) {
            this.titulo = titulo;
        } else {
            System.out.println("Título no válido");
        }
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Actor getProtagonista() {
        return protagonista;
    }

    public void setProtagonista(Actor protagonista) {
        this.protagonista = protagonista;
    }

    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", genero=" + genero + ", director=" + director + ", protagonista=" + protagonista + '}';
    }



}
