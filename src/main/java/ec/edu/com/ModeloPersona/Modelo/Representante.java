/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.com.ModeloPersona.Modelo;

/**
 *
 * @author fernandosanchez
 */
public class Representante extends Persona {
    
    private int codigo;
    private String parentescoFamiliar;

    public Representante() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getParentescoFamiliar() {
        return parentescoFamiliar;
    }

    public void setParentescoFamiliar(String parentescoFamiliar) {
        this.parentescoFamiliar = parentescoFamiliar;
    }

    @Override
    public String toString() {
        return "Representante{" + "codigo=" + codigo + ", parentescoFamiliar=" + parentescoFamiliar + '}';
    }
    
    
    
}
