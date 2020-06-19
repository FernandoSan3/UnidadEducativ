/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.com.ModeloGrupo.Modelo;

import ec.edu.com.ModeloPersona.Modelo.Docente;




/**
 *
 * @author fernandosanchez
 */
public class GrupoDetalle {
    
    private int codigo;
    private Materia materia;
    private Docente persona;
    private Aula aula;
    private GrupoDetalle grupoDetalle;

    public GrupoDetalle() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public Docente getPersona() {
        return persona;
    }

    public void setPersona(Docente persona) {
        this.persona = persona;
    }

    public Aula getAula() {
        return aula;
    }

    public void setAula(Aula aula) {
        this.aula = aula;
    }

    public GrupoDetalle getGrupoDetalle() {
        return grupoDetalle;
    }

    public void setGrupoDetalle(GrupoDetalle grupoDetalle) {
        this.grupoDetalle = grupoDetalle;
    }

    @Override
    public String toString() {
        return "GrupoDetalle{" + "codigo=" + codigo + ", materia=" + materia + ", persona=" + persona + ", aula=" + aula + ", grupoDetalle=" + grupoDetalle + '}';
    }
    
    
    
}
