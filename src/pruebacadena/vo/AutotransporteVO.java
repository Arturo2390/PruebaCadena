/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebacadena.vo;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author usuario
 */
public class AutotransporteVO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String permSCT;
    private String numPermisoSCT;
    private IdentificacionVehicularVO identificacionVehicularVO;
    private SegurosVO segurosVO;
    private RemolquesVO remolquesVO;
    
    /**
     * @return the permSCT
     */
    public String getPermSCT() {
        return permSCT;
    }

    /**
     * @param permSCT the permSCT to set
     */
    public void setPermSCT(String permSCT) {
        this.permSCT = permSCT;
    }

    /**
     * @return the numPermisoSCT
     */
    public String getNumPermisoSCT() {
        return numPermisoSCT;
    }

    /**
     * @param numPermisoSCT the numPermisoSCT to set
     */
    public void setNumPermisoSCT(String numPermisoSCT) {
        this.numPermisoSCT = numPermisoSCT;
    }

    /**
     * @return the identificacionVehicularVO
     */
    public IdentificacionVehicularVO getIdentificacionVehicularVO() {
        return identificacionVehicularVO;
    }

    /**
     * @param identificacionVehicularVO the identificacionVehicularVO to set
     */
    public void setIdentificacionVehicularVO(IdentificacionVehicularVO identificacionVehicularVO) {
        this.identificacionVehicularVO = identificacionVehicularVO;
    }

    /**
     * @return the segurosVO
     */
    public SegurosVO getSegurosVO() {
        return segurosVO;
    }

    /**
     * @param segurosVO the segurosVO to set
     */
    public void setSegurosVO(SegurosVO segurosVO) {
        this.segurosVO = segurosVO;
    }

    /**
     * @return the remolquesVO
     */
    public RemolquesVO getRemolquesVO() {
        return remolquesVO;
    }

    /**
     * @param remolquesVO the remolquesVO to set
     */
    public void setRemolquesVO(RemolquesVO remolquesVO) {
        this.remolquesVO = remolquesVO;
    }
    
}
