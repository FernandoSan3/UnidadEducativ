/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.com.ModeloGrupo.Controlador;

import ec.edu.com.ModeloGrupo.Modelo.Materia;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author jorim
 */
public class ControladorMateriaIT {
    
    public ControladorMateriaIT() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of crearMateria method, of class ControladorMateria.
     */
    @Test
    public void testCrearMateria() {
        System.out.println("crearMateria");
        Materia materia =  new Materia();
        materia.setAbrebiatura("BSS");
        materia.setCosto(10.0);
        materia.setHoras("horas");
        materia.setMateria("fisica");
        ControladorMateria.crearMateria(materia);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of modificarMateria method, of class ControladorMateria.
     */
    @Test
    public void testModificarMateria() {
        System.out.println("modificarMateria");
        Materia materia =  new Materia();
        materia.setAbrebiatura("BSS1");
        materia.setCosto(10.0);
        materia.setHoras("horas1");
        materia.setMateria("fisica");
        ControladorMateria.modificarMateria(materia);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of buscarMateria method, of class ControladorMateria.
     */
    @Test
    public void testBuscarMateria() {
        System.out.println("buscarMateria");
        String materi = "";
        Materia materia = new Materia();
        materia.setAbrebiatura("fisica");
        ControladorMateria.buscarMateria(materi, materia);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of buscarMateriaCodigo method, of class ControladorMateria.
     */
    @Test
    public void testBuscarMateriaCodigo() {
        System.out.println("buscarMateriaCodigo");
        int materia = 1;
        ControladorMateria.buscarMateriaCodigo(materia);
        
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarMateria method, of class ControladorMateria.
     */
    @Test
    public void testEliminarMateria() {
        System.out.println("eliminarMateria");
        Materia materia = new Materia();
        materia.setAbrebiatura("fisica");
        ControladorMateria.eliminarMateria(materia);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
