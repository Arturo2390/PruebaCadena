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
public class GuiasIdentificacionVO implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private String numeroGuiaIdentificacion;
    private String descripGuiaIdentificacion;
    private BigDecimal pesoGuiaIdentificacion;
    
    /**
     * @return the numeroGuiaIdentificacion
     */
    public String getNumeroGuiaIdentificacion() {
        return numeroGuiaIdentificacion;
    }

    /**
     * @param numeroGuiaIdentificacion the numeroGuiaIdentificacion to set
     */
    public void setNumeroGuiaIdentificacion(String numeroGuiaIdentificacion) {
        this.numeroGuiaIdentificacion = numeroGuiaIdentificacion;
    }

    /**
     * @return the descripGuiaIdentificacion
     */
    public String getDescripGuiaIdentificacion() {
        return descripGuiaIdentificacion;
    }

    /**
     * @param descripGuiaIdentificacion the descripGuiaIdentificacion to set
     */
    public void setDescripGuiaIdentificacion(String descripGuiaIdentificacion) {
        this.descripGuiaIdentificacion = descripGuiaIdentificacion;
    }

    /**
     * @return the pesoGuiaIdentificacion
     */
    public BigDecimal getPesoGuiaIdentificacion() {
        return pesoGuiaIdentificacion;
    }

    /**
     * @param pesoGuiaIdentificacion the pesoGuiaIdentificacion to set
     */
    public void setPesoGuiaIdentificacion(BigDecimal pesoGuiaIdentificacion) {
        this.pesoGuiaIdentificacion = pesoGuiaIdentificacion;
    }
    
}
