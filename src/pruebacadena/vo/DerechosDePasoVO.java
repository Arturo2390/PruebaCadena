/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebacadena.vo;

import java.io.Serializable;
import java.math.BigDecimal;

/*
 * @author Aban
 */
public class DerechosDePasoVO implements Serializable
{
    private static final long serialVersionUID = 1L;
    private String tipoDerechoDePaso;
    private BigDecimal kilometrajePagado;
    
    public String getTipoDerechoDePaso()
    {
        return tipoDerechoDePaso;
    }

    public void setTipoDerechoDePaso(String tipoDerechoDePaso)
    {
        this.tipoDerechoDePaso = tipoDerechoDePaso;
    }

    public BigDecimal getKilometrajePagado()
    {
        return kilometrajePagado;
    }

    public void setKilometrajePagado(BigDecimal kilometrajePagado)
    {
        this.kilometrajePagado = kilometrajePagado;
    }
}
