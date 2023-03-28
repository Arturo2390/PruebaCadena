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
public class SegurosVO implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private String aseguraRespCivil;
    private String polizaRespCivil;
    private String aseguraMedAmbiente;
    private String polizaMedAmbiente;
    private String aseguraCarga;
    private String polizaCarga;
    private BigDecimal primaSeguro;
    
    /**
     * @return the aseguraRespCivil
     */
    public String getAseguraRespCivil() {
        return aseguraRespCivil;
    }

    /**
     * @param aseguraRespCivil the aseguraRespCivil to set
     */
    public void setAseguraRespCivil(String aseguraRespCivil) {
        this.aseguraRespCivil = aseguraRespCivil;
    }

    /**
     * @return the polizaRespCivil
     */
    public String getPolizaRespCivil() {
        return polizaRespCivil;
    }

    /**
     * @param polizaRespCivil the polizaRespCivil to set
     */
    public void setPolizaRespCivil(String polizaRespCivil) {
        this.polizaRespCivil = polizaRespCivil;
    }

    /**
     * @return the aseguraMedAmbiente
     */
    public String getAseguraMedAmbiente() {
        return aseguraMedAmbiente;
    }

    /**
     * @param aseguraMedAmbiente the aseguraMedAmbiente to set
     */
    public void setAseguraMedAmbiente(String aseguraMedAmbiente) {
        this.aseguraMedAmbiente = aseguraMedAmbiente;
    }

    /**
     * @return the polizaMedAmbiente
     */
    public String getPolizaMedAmbiente() {
        return polizaMedAmbiente;
    }

    /**
     * @param polizaMedAmbiente the polizaMedAmbiente to set
     */
    public void setPolizaMedAmbiente(String polizaMedAmbiente) {
        this.polizaMedAmbiente = polizaMedAmbiente;
    }

    /**
     * @return the aseguraCarga
     */
    public String getAseguraCarga() {
        return aseguraCarga;
    }

    /**
     * @param aseguraCarga the aseguraCarga to set
     */
    public void setAseguraCarga(String aseguraCarga) {
        this.aseguraCarga = aseguraCarga;
    }

    /**
     * @return the polizaCarga
     */
    public String getPolizaCarga() {
        return polizaCarga;
    }

    /**
     * @param polizaCarga the polizaCarga to set
     */
    public void setPolizaCarga(String polizaCarga) {
        this.polizaCarga = polizaCarga;
    }

    /**
     * @return the primaSeguro
     */
    public BigDecimal getPrimaSeguro() {
        return primaSeguro;
    }

    /**
     * @param primaSeguro the primaSeguro to set
     */
    public void setPrimaSeguro(BigDecimal primaSeguro) {
        this.primaSeguro = primaSeguro;
    }
    
}
