/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebacadena.vo;

import java.io.Serializable;

/*
 * @author Aban
 */
public class ParteTransporteVO implements Serializable
{
    private static final long serialVersionUID = 1L;
    
    private String parteTransporte;
    
    public String getParteTransporte()
    {
        return parteTransporte;
    }

    public void setParteTransporte(String parteTransporte)
    {
        this.parteTransporte = parteTransporte;
    }
}
