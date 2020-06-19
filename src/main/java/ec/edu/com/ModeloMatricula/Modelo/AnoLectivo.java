/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.com.ModeloMatricula.Modelo;

/**
 *
 * @author josepandiguana
 */
public class AnoLectivo {
    
    private int codigo;
    private String anolectivo;
    private String fechaInicio;
    private String fechafinal;

    public AnoLectivo(int codigo, String anolectivo, String fechaInicio, String fechafinal) {
        this.codigo = codigo;
        this.anolectivo = anolectivo;
        this.fechaInicio = fechaInicio;
        this.fechafinal = fechafinal;
    }
    
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getAnolectivo() {
        return anolectivo;
    }

    public void setAnolectivo(String anolectivo) {
        this.anolectivo = anolectivo;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechafinal() {
        return fechafinal;
    }

    public void setFechafinal(String fechafinal) {
        this.fechafinal = fechafinal;
    }

    @Override
    public String toString() {
        return "controladorAnoLectivo{" + "codigo=" + codigo + ", anolectivo=" + anolectivo + ", fechaInicio=" + fechaInicio + ", fechafinal=" + fechafinal + '}';
    }
    
}
