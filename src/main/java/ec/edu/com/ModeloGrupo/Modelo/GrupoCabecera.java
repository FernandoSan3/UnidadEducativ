/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.com.ModeloGrupo.Modelo;

import java.util.List;

/**
 *
 * @author fernandosanchez
 */
public class GrupoCabecera {
    
    private int codigo;
    private String grupo;
    private String codigoGrupo;
    private String hora;
    private Mension mension;
    private Curso curso;
    private AnioLectivo anioLectivo;
    private List<GrupoDetalle> detalleGrupo;

    public GrupoCabecera() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getCodigoGrupo() {
        return codigoGrupo;
    }

    public void setCodigoGrupo(String codigoGrupo) {
        this.codigoGrupo = codigoGrupo;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Mension getMension() {
        return mension;
    }

    public void setMension(Mension mension) {
        this.mension = mension;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public AnioLectivo getAnioLectivo() {
        return anioLectivo;
    }

    public void setAnioLectivo(AnioLectivo anioLectivo) {
        this.anioLectivo = anioLectivo;
    }

    public List<GrupoDetalle> getDetalleGrupo() {
        return detalleGrupo;
    }

    public void setDetalleGrupo(List<GrupoDetalle> detalleGrupo) {
        this.detalleGrupo = detalleGrupo;
    }

    @Override
    public String toString() {
        return "GrupoCabecera{" + "codigo=" + codigo + ", grupo=" + grupo + ", codigoGrupo=" + codigoGrupo + ", hora=" + hora + ", mension=" + mension + ", curso=" + curso + ", anioLectivo=" + anioLectivo + ", detalleGrupo=" + detalleGrupo + '}';
    }
    
    
    
    
    
    
}
