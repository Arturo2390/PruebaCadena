/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebacadena.vo;

import java.io.Serializable;

/**
 *
 * @author usuario
 */
public class IdentificacionVehicularVO implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    private String configVehicular;
    private String placaVM;
    private Integer anioModeloVM;
    
    /**
     * @return the configVehicular
     */
    public String getConfigVehicular() {
        return configVehicular;
    }

    /**
     * @param configVehicular the configVehicular to set
     */
    public void setConfigVehicular(String configVehicular) {
        this.configVehicular = configVehicular;
    }

    /**
     * @return the placaVM
     */
    public String getPlacaVM() {
        return placaVM;
    }

    /**
     * @param placaVM the placaVM to set
     */
    public void setPlacaVM(String placaVM) {
        this.placaVM = placaVM;
    }

    /**
     * @return the anioModeloVM
     */
    public Integer getAnioModeloVM() {
        return anioModeloVM;
    }

    /**
     * @param anioModeloVM the anioModeloVM to set
     */
    public void setAnioModeloVM(Integer anioModeloVM) {
        this.anioModeloVM = anioModeloVM;
    }
    
}
