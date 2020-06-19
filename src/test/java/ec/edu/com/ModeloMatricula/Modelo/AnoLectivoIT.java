/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.com.ModeloMatricula.Modelo;

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
public class AnoLectivoIT {
    
    public AnoLectivoIT() {
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
     * Test of getCodigo method, of class AnoLectivo.
     */
    @Test
    public void testGetCodigo() {
        System.out.println("getCodigo");
        AnoLectivo instance = null;
        int expResult = 0;
        int result = instance.getCodigo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCodigo method, of class AnoLectivo.
     */
    @Test
    public void testSetCodigo() {
        System.out.println("setCodigo");
        int codigo = 0;
        AnoLectivo instance = null;
        instance.setCodigo(codigo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAnolectivo method, of class AnoLectivo.
     */
    @Test
    public void testGetAnolectivo() {
        System.out.println("getAnolectivo");
        AnoLectivo instance = null;
        String expResult = "";
        String result = instance.getAnolectivo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAnolectivo method, of class AnoLectivo.
     */
    @Test
    public void testSetAnolectivo() {
        System.out.println("setAnolectivo");
        String anolectivo = "";
        AnoLectivo instance = null;
        instance.setAnolectivo(anolectivo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFechaInicio method, of class AnoLectivo.
     */
    @Test
    public void testGetFechaInicio() {
        System.out.println("getFechaInicio");
        AnoLectivo instance = null;
        String expResult = "";
        String result = instance.getFechaInicio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFechaInicio method, of class AnoLectivo.
     */
    @Test
    public void testSetFechaInicio() {
        System.out.println("setFechaInicio");
        String fechaInicio = "";
        AnoLectivo instance = null;
        instance.setFechaInicio(fechaInicio);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFechafinal method, of class AnoLectivo.
     */
    @Test
    public void testGetFechafinal() {
        System.out.println("getFechafinal");
        AnoLectivo instance = null;
        String expResult = "";
        String result = instance.getFechafinal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFechafinal method, of class AnoLectivo.
     */
    @Test
    public void testSetFechafinal() {
        System.out.println("setFechafinal");
        String fechafinal = "";
        AnoLectivo instance = null;
        instance.setFechafinal(fechafinal);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class AnoLectivo.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        AnoLectivo instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
