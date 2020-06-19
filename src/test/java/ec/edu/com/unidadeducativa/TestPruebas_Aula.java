/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.com.unidadeducativa;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author fernandosanchez
 */
public class TestPruebas_Aula {
    
    
    
    
    @Test
    public void getDoubleTest(){
        int resultado = FnNumericas.getDouble(5);
        int esparado = 10;
        
        assertEquals(esparado, resultado);          
    }
    
    @Test
    public void getCuadradoTest(){
        int resultado = FnNumericas.getCuadrado(5);
        int esparado = 25;
        
        assertEquals(esparado, resultado);          
    }
            
    
}
