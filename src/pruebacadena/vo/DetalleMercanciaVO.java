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
 * @author usuario
 */
public class DetalleMercanciaVO implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private String unidadPesoMerc;
    private BigDecimal pesoBruto;
    private BigDecimal pesoNeto;
    private BigDecimal pesoTara;
    private Integer numPiezas;
    
    /**
     * @return the unidadPesoMerc
     */
    public String getUnidadPesoMerc() {
        return unidadPesoMerc;
    }

    /**
     * @param unidadPesoMerc the unidadPesoMerc to set
     */
    public void setUnidadPesoMerc(String unidadPesoMerc) {
        this.unidadPesoMerc = unidadPesoMerc;
    }

    /**
     * @return the pesoBruto
     */
    public BigDecimal getPesoBruto() {
        return pesoBruto;
    }

    /**
     * @param pesoBruto the pesoBruto to set
     */
    public void setPesoBruto(BigDecimal pesoBruto) {
        this.pesoBruto = pesoBruto;
    }

    /**
     * @return the pesoNeto
     */
    public BigDecimal getPesoNeto() {
        return pesoNeto;
    }

    /**
     * @param pesoNeto the pesoNeto to set
     */
    public void setPesoNeto(BigDecimal pesoNeto) {
        this.pesoNeto = pesoNeto;
    }

    /**
     * @return the pesoTara
     */
    public BigDecimal getPesoTara() {
        return pesoTara;
    }

    /**
     * @param pesoTara the pesoTara to set
     */
    public void setPesoTara(BigDecimal pesoTara) {
        this.pesoTara = pesoTara;
    }

    /**
     * @return the numPiezas
     */
    public Integer getNumPiezas() {
        return numPiezas;
    }

    /**
     * @param numPiezas the numPiezas to set
     */
    public void setNumPiezas(Integer numPiezas) {
        this.numPiezas = numPiezas;
    }
    
}
