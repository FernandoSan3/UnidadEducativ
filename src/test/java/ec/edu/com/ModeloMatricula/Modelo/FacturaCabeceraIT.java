/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.com.ModeloMatricula.Modelo;

import ec.edu.com.ModeloFactura.Modelo.FormasDePago;
import ec.edu.com.ModeloPersona.Modelo.Persona;
import java.util.Date;
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
public class FacturaCabeceraIT {
    
    public FacturaCabeceraIT() {
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
     * Test of getCodigo method, of class FacturaCabecera.
     */
    @Test
    public void testGetCodigo() {
        System.out.println("getCodigo");
        FacturaCabecera instance = null;
        int expResult = 0;
        int result = instance.getCodigo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCodigo method, of class FacturaCabecera.
     */
    @Test
    public void testSetCodigo() {
        System.out.println("setCodigo");
        int codigo = 0;
        FacturaCabecera instance = null;
        instance.setCodigo(codigo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumeroFacura method, of class FacturaCabecera.
     */
    @Test
    public void testGetNumeroFacura() {
        System.out.println("getNumeroFacura");
        FacturaCabecera instance = null;
        int expResult = 0;
        int result = instance.getNumeroFacura();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumeroFacura method, of class FacturaCabecera.
     */
    @Test
    public void testSetNumeroFacura() {
        System.out.println("setNumeroFacura");
        int numeroFacura = 0;
        FacturaCabecera instance = null;
        instance.setNumeroFacura(numeroFacura);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFecha method, of class FacturaCabecera.
     */
    @Test
    public void testGetFecha() {
        System.out.println("getFecha");
        FacturaCabecera instance = null;
        Date expResult = null;
        Date result = instance.getFecha();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFecha method, of class FacturaCabecera.
     */
    @Test
    public void testSetFecha() {
        System.out.println("setFecha");
        Date fecha = null;
        FacturaCabecera instance = null;
        instance.setFecha(fecha);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPersona method, of class FacturaCabecera.
     */
    @Test
    public void testGetPersona() {
        System.out.println("getPersona");
        FacturaCabecera instance = null;
        Persona expResult = null;
        Persona result = instance.getPersona();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPersona method, of class FacturaCabecera.
     */
    @Test
    public void testSetPersona() {
        System.out.println("setPersona");
        Persona persona = null;
        FacturaCabecera instance = null;
        instance.setPersona(persona);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFormaDePago method, of class FacturaCabecera.
     */
    @Test
    public void testGetFormaDePago() {
        System.out.println("getFormaDePago");
        FacturaCabecera instance = null;
        FormasDePago expResult = null;
        FormasDePago result = instance.getFormaDePago();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFormaDePago method, of class FacturaCabecera.
     */
    @Test
    public void testSetFormaDePago() {
        System.out.println("setFormaDePago");
        FormasDePago formaDePago = null;
        FacturaCabecera instance = null;
        instance.setFormaDePago(formaDePago);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSubtotal method, of class FacturaCabecera.
     */
    @Test
    public void testGetSubtotal() {
        System.out.println("getSubtotal");
        FacturaCabecera instance = null;
        double expResult = 0.0;
        double result = instance.getSubtotal();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSubtotal method, of class FacturaCabecera.
     */
    @Test
    public void testSetSubtotal() {
        System.out.println("setSubtotal");
        double subtotal = 0.0;
        FacturaCabecera instance = null;
        instance.setSubtotal(subtotal);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotal method, of class FacturaCabecera.
     */
    @Test
    public void testGetTotal() {
        System.out.println("getTotal");
        FacturaCabecera instance = null;
        double expResult = 0.0;
        double result = instance.getTotal();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTotal method, of class FacturaCabecera.
     */
    @Test
    public void testSetTotal() {
        System.out.println("setTotal");
        double total = 0.0;
        FacturaCabecera instance = null;
        instance.setTotal(total);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class FacturaCabecera.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        FacturaCabecera instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
