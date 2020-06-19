/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.com.unidadeducativa;

/**
 *
 * @author fernandosanchez
 */
public class FnNumericas {

    /**
     * @param args the command line arguments
     */
    public static int getDouble(int numero) {
        // TODO code application logic here
        return (numero * 2);
    }
    
    public static int getCuadrado(int numero) {
        // TODO code application logic here
        return (numero * numero);
    }
    
    public static void main(String[] args) {
        int resultado = getCuadrado(5);
        int esperado = 25;
        
        if (resultado == esperado)
            System.out.println("OK GETGUADRADO");
        else 
            System.out.println("FAIL GETGUADRADO");
        
        resultado = getDouble(5);
        esperado = 10;
        
        if (resultado == esperado)
            System.out.println("OK GETDOUBLE");
        else 
            System.out.println("FAIL GETDOUBLE");
    }
}
