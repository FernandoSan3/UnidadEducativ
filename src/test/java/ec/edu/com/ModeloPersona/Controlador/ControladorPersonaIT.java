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
public class ControladorPersonaIT {
    
    public ControladorPersonaIT() {
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
     * Test of crearPersona method, of class ControladorPersona.
     */
    @Test
    public void testCrearPersona() {
        System.out.println("crearPersona");
        Persona persona = null;
        ControladorPersona.crearPersona(persona);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of modificarPersona method, of class ControladorPersona.
     */
    @Test
    public void testModificarPersona() {
        System.out.println("modificarPersona");
        Persona persona = null;
        ControladorPersona.modificarPersona(persona);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarPersona method, of class ControladorPersona.
     */
    @Test
    public void testBuscarPersona() {
        System.out.println("buscarPersona");
        String cedula = "";
        Persona persona = null;
        ControladorPersona.buscarPersona(cedula, persona);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarPersona method, of class ControladorPersona.
     */
    @Test
    public void testEliminarPersona() {
        System.out.println("eliminarPersona");
        Persona persona = null;
        ControladorPersona.eliminarPersona(persona);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of crearUsuario method, of class ControladorPersona.
     */
    @Test
    public void testCrearUsuario() {
        System.out.println("crearUsuario");
        Persona persona = null;
        String titulo = "";
        ControladorPersona instance = new ControladorPersonaImpl();
        instance.crearUsuario(persona, titulo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of modificarUsuario method, of class ControladorPersona.
     */
    @Test
    public void testModificarUsuario() {
        System.out.println("modificarUsuario");
        Persona persona = null;
        String titulo = "";
        Docente docente = null;
        ControladorPersona instance = new ControladorPersonaImpl();
        instance.modificarUsuario(persona, titulo, docente);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarUsuario method, of class ControladorPersona.
     */
    @Test
    public void testBuscarUsuario() {
        System.out.println("buscarUsuario");
        String cedula = "";
        Persona persona = null;
        Docente docente = null;
        ControladorPersona instance = new ControladorPersonaImpl();
        instance.buscarUsuario(cedula, persona, docente);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarUsuario method, of class ControladorPersona.
     */
    @Test
    public void testEliminarUsuario() {
        System.out.println("eliminarUsuario");
        Persona persona = null;
        ControladorPersona instance = new ControladorPersonaImpl();
        instance.eliminarUsuario(persona);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class ControladorPersonaImpl extends ControladorPersona {

        public void crearUsuario(Persona persona, String titulo) {
        }

        public void modificarUsuario(Persona persona, String titulo, Docente docente) {
        }

        public void buscarUsuario(String cedula, Persona persona, Docente docente) {
        }

        public void eliminarUsuario(Persona persona) {
        }
    }
    
}
