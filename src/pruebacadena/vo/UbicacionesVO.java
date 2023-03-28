/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebacadena.vo;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class UbicacionesVO implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private ArrayList<UbicacionVO> ubicacionVO;
    
    /**
     * @return the ubicacionVO
     */
    public ArrayList<UbicacionVO> getUbicacionVO() {
        return ubicacionVO;
    }

    /**
     * @param ubicacionVO the ubicacionVO to set
     */
    public void setUbicacionVO(ArrayList<UbicacionVO> ubicacionVO) {
        this.ubicacionVO = ubicacionVO;
    }
}
