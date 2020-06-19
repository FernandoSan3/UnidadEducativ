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
public class Docente extends Persona{
    
    private int codigo;
    private String titulo;
    private Persona codigo_persona;

    public Docente() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Persona getCodigo_persona() {
        return codigo_persona;
    }

    public void setCodigo_persona(Persona codigo_persona) {
        this.codigo_persona = codigo_persona;
    }

    @Override
    public String toString() {
        return "Docente{" + "codigo=" + codigo + ", titulo=" + titulo + ", codigo_persona=" + codigo_persona + '}';
    }

    
   
    
    
    
}
