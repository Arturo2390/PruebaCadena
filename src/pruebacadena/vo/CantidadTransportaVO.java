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
public class CantidadTransportaVO implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private BigDecimal cantidad;
    private String idOrigen;
    private String idDestino;
    private String cvesTransporte;
    
    /**
     * @return the cantidad
     */
    public BigDecimal getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(BigDecimal cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the idOrigen
     */
    public String getIdOrigen() {
        return idOrigen;
    }

    /**
     * @param idOrigen the idOrigen to set
     */
    public void setIdOrigen(String idOrigen) {
        this.idOrigen = idOrigen;
    }

    /**
     * @return the idDestino
     */
    public String getIdDestino() {
        return idDestino;
    }

    /**
     * @param idDestino the idDestino to set
     */
    public void setIdDestino(String idDestino) {
        this.idDestino = idDestino;
    }

    /**
     * @return the cvesTransporte
     */
    public String getCvesTransporte() {
        return cvesTransporte;
    }

    /**
     * @param cvesTransporte the cvesTransporte to set
     */
    public void setCvesTransporte(String cvesTransporte) {
        this.cvesTransporte = cvesTransporte;
    }

}
