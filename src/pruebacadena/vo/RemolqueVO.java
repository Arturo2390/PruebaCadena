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
public class RemolqueVO implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private String subTipoRem;
    private String placa;
    
    /**
     * @return the subTipoRem
     */
    public String getSubTipoRem() {
        return subTipoRem;
    }

    /**
     * @param subTipoRem the subTipoRem to set
     */
    public void setSubTipoRem(String subTipoRem) {
        this.subTipoRem = subTipoRem;
    }

    /**
     * @return the placa
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * @param placa the placa to set
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
}
