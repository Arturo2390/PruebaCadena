/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebacadena.vo;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 *
 * @author Aban
 */
public class ContenedorVO implements Serializable
{
    private static final long serialVersionUID = 1L;
    private String matriculaContenedor;
    private String tipoContenedor;
    private String numPrecinto;
    
    //private String tipoContenedor;
    private BigDecimal pesoContenedorVacio;
    private BigDecimal pesoNetoMercancia;
    
    public String getMatriculaContenedor()
    {
        return matriculaContenedor;
    }

    public void setMatriculaContenedor(String matriculaContenedor)
    {
        this.matriculaContenedor = matriculaContenedor;
    }

    public String getTipoContenedor()
    {
        return tipoContenedor;
    }

    public void setTipoContenedor(String tipoContenedor)
    {
        this.tipoContenedor = tipoContenedor;
    }

    public String getNumPrecinto()
    {
        return numPrecinto;
    }

    public void setNumPrecinto(String numPrecinto)
    {
        this.numPrecinto = numPrecinto;
    }
    
    public BigDecimal getPesoContenedorVacio()
    {
        return pesoContenedorVacio;
    }

    public void setPesoContenedorVacio(BigDecimal pesoContenedorVacio)
    {
        this.pesoContenedorVacio = pesoContenedorVacio;
    }

    public BigDecimal getPesoNetoMercancia()
    {
        return pesoNetoMercancia;
    }

    public void setPesoNetoMercancia(BigDecimal pesoNetoMercancia)
    {
        this.pesoNetoMercancia = pesoNetoMercancia;
    }
}