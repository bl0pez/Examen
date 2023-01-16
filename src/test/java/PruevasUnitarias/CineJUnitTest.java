/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package PruevasUnitarias;

import com.mycompany.main.Actor;
import com.mycompany.main.Pelicula;
import com.mycompany.main.SalaDeCine;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author blope
 */
public class CineJUnitTest {
    
    /**
     * Test que comprueba que se puede agregar una película a la sala de cine
     */
    @Test
    public void testAgregarPelicula(){

        SalaDeCine sala = new SalaDeCine();
        String resultadoEsperado = "La película se agregó correctamente";

        assertEquals(resultadoEsperado, sala.agregarPelicula(new Pelicula("Peli01", "Terror", "Director1", new Actor("Actor1", 20, "Española", 'M'))));

    }

    /**
     * Test que retorna true si la película se encuentra en la sala de cine
     */
    @Test
    public void testBuscarPelicula(){

        SalaDeCine sala = new SalaDeCine();
        sala.agregarPelicula(new Pelicula("Peli01", "Terror", "Director1", new Actor("Actor1", 20, "Española", 'M')));

        assertTrue(sala.buscarPelicula("Peli01"));

    }


    /*
     * Test que lista las peliculas de la sala de cine
     */
    @Test
    public void testListarPeliculas(){

        SalaDeCine sala = new SalaDeCine();
        sala.agregarPelicula(new Pelicula("Peli01", "Terror", "Director1", new Actor("Actor1", 25, "Española", 'M')));
        sala.agregarPelicula(new Pelicula("Peli02", "Terror", "Director2", new Actor("Actor2", 20, "Española", 'F')));
        sala.agregarPelicula(new Pelicula("Peli03", "Terror", "Director3", new Actor("Actor3", 25, "Española", 'M')));

        String expResult = "Peli01 - Terror - Director1 - Actor1 - 25 - M\nPeli02 - Terror - Director2 - Actor2 - 20 - F\nPeli03 - Terror - Director3 - Actor3 - 25 - M\n";

        assertEquals(expResult, sala.listarPeliculas());

    }

    /**
     * Test que obtiene las actrices mujeres de la sala de cine
     */
    @Test
    public void testObtenerActrices(){

        SalaDeCine sala = new SalaDeCine();
        sala.agregarPelicula(new Pelicula("Peli01", "Terror", "Director1", new Actor("Actor1", 25, "Española", 'M')));
        sala.agregarPelicula(new Pelicula("Peli02", "Terror", "Director2", new Actor("Actor2", 20, "Española", 'F')));
        sala.agregarPelicula(new Pelicula("Peli03", "Terror", "Director3", new Actor("Actor3", 25, "Española", 'M')));

        assertEquals(2, sala.obtenerActricesMujeres());


    }

    /**
     * Test que obtiene los actores jovenes de la sala de cine
     */

    @Test
    public void testObtenerActoresJovenes(){

        SalaDeCine sala = new SalaDeCine();
        sala.agregarPelicula(new Pelicula("Peli01", "Terror", "Director1", new Actor("Actor1", 35, "Española", 'M')));
        sala.agregarPelicula(new Pelicula("Peli02", "Terror", "Director2", new Actor("Actor2", 20, "Española", 'F')));
        sala.agregarPelicula(new Pelicula("Peli03", "Terror", "Director3", new Actor("Actor3", 25, "Española", 'M')));

        assertEquals(2, sala.obtenerActoresJovenes());

    }


    
}
