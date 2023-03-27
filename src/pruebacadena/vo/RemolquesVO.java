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
public class RemolquesVO implements Serializable {
   
    private static final long serialVersionUID = 1L;
    
    private ArrayList<RemolqueVO> remolqueVO;

    /**
     * @return the remolqueVO
     */
    public ArrayList<RemolqueVO> getRemolqueVO() {
        return remolqueVO;
    }

    /**
     * @param remolqueVO the remolqueVO to set
     */
    public void setRemolqueVO(ArrayList<RemolqueVO> remolqueVO) {
        this.remolqueVO = remolqueVO;
    }
    
}
