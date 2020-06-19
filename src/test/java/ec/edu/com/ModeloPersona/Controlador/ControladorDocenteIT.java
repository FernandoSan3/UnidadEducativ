/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.com.ModeloPersona.Controlador;

import ec.edu.com.ModeloPersona.Modelo.Docente;
import ec.edu.com.ModeloPersona.Modelo.Persona;
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
public class ControladorDocenteIT {
    
    public ControladorDocenteIT() {
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
     * Test of contarPersona method, of class ControladorDocente.
     */
    @Test
    public void testContarPersona() {
        System.out.println("contarPersona");
        ControladorDocente.contarPersona();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of crearUsuario method, of class ControladorDocente.
     */
    @Test
    public void testCrearUsuario() {
        System.out.println("crearUsuario");
        Persona persona = null;
        String titulo = "";
        ControladorDocente instance = new ControladorDocente();
        instance.crearUsuario(persona, titulo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarUsuario method, of class ControladorDocente.
     */
    @Test
    public void testBuscarUsuario() {
        System.out.println("buscarUsuario");
        String cedula = "";
        Persona persona = null;
        Docente docente = null;
        ControladorDocente instance = new ControladorDocente();
        instance.buscarUsuario(cedula, persona, docente);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarUsuario method, of class ControladorDocente.
     */
    @Test
    public void testEliminarUsuario() {
        System.out.println("eliminarUsuario");
        Persona persona = null;
        ControladorDocente instance = new ControladorDocente();
        instance.eliminarUsuario(persona);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of modificarUsuario method, of class ControladorDocente.
     */
    @Test
    public void testModificarUsuario() {
        System.out.println("modificarUsuario");
        Persona persona = null;
        String titulo = "";
        Docente docente = null;
        ControladorDocente instance = new ControladorDocente();
        instance.modificarUsuario(persona, titulo, docente);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
