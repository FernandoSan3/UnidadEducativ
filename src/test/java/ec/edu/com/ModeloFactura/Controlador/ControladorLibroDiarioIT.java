/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.com.ModeloFactura.Controlador;

import ec.edu.com.ModeloFactura.Modelo.LibroDiario;
import java.util.List;
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
public class ControladorLibroDiarioIT {
    
    public ControladorLibroDiarioIT() {
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
     * Test of crearLibroDiario method, of class ControladorLibroDiario.
     */
    @Test
    public void testCrearLibroDiario() {
        System.out.println("crearLibroDiario");
        LibroDiario libroDiario = null;
        ControladorLibroDiario instance = new ControladorLibroDiario();
        instance.crearLibroDiario(libroDiario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarLibroDiario method, of class ControladorLibroDiario.
     */
    @Test
    public void testListarLibroDiario() {
        System.out.println("listarLibroDiario");
        ControladorLibroDiario instance = new ControladorLibroDiario();
        List<LibroDiario> expResult = null;
        List<LibroDiario> result = instance.listarLibroDiario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of actualizarLibroDiario method, of class ControladorLibroDiario.
     */
    @Test
    public void testActualizarLibroDiario() {
        System.out.println("actualizarLibroDiario");
        LibroDiario libroDiario = null;
        ControladorLibroDiario instance = new ControladorLibroDiario();
        instance.actualizarLibroDiario(libroDiario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarLibroDiario method, of class ControladorLibroDiario.
     */
    @Test
    public void testEliminarLibroDiario() {
        System.out.println("eliminarLibroDiario");
        LibroDiario libroDiario = null;
        ControladorLibroDiario instance = new ControladorLibroDiario();
        instance.eliminarLibroDiario(libroDiario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
