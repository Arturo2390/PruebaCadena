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
public class PedimentoVO implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private String pedimento;
    
    /**
     * @return the pedimento
     */
    public String getPedimento() {
        return pedimento;
    }

    /**
     * @param pedimento the pedimento to set
     */
    public void setPedimento(String pedimento) {
        this.pedimento = pedimento;
    }
    
}
