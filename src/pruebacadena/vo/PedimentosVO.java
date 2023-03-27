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
public class PedimentosVO implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private ArrayList<PedimentoVO> pedimentoVO;
    
    /**
     * @return the pedimentoVO
     */
    public ArrayList<PedimentoVO> getPedimentoVO() {
        return pedimentoVO;
    }

    /**
     * @param pedimentoVO the pedimentoVO to set
     */
    public void setPedimentoVO(ArrayList<PedimentoVO> pedimentoVO) {
        this.pedimentoVO = pedimentoVO;
    }
    
}
