/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.com.ModeloGrupo.Controlador;

import ec.edu.com.ModeloGrupo.Modelo.Curso;
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
public class ControladorCursoIT {
    
    public ControladorCursoIT() {
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
     * Test of crearCurso method, of class ControladorCurso.
     */
    @Test
    public void testCrearCurso() {
        System.out.println("crearCurso");
        
        Curso curso = new Curso();
        curso.setAbrebiatura("jdj");
        curso.setCurso("B3");
        ControladorCurso.crearCurso(curso);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of modificarCurso method, of class ControladorCurso.
     */
    @Test
    public void testModificarCurso() {
        System.out.println("modificarCurso");
        Curso curso = new Curso();
        curso.setAbrebiatura("segundo");
        curso.setAbrebiatura("a");
        ControladorCurso.modificarCurso(curso);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarCurso method, of class ControladorCurso.
     */
    @Test
    public void testEliminarCurso() {
        System.out.println("eliminarCurso");
        Curso curso = null;
        curso.setCodigo(1);
        ControladorCurso.eliminarCurso(curso);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
