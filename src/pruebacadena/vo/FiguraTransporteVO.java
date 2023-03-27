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
public class FiguraTransporteVO implements Serializable
{
    private static final long serialVersionUID = 1L;
    private TiposFiguraVO tiposFiguraVO;
    
    public TiposFiguraVO getTiposFiguraVO()
    {
        return tiposFiguraVO;
    }

    public void setTiposFiguraVO(TiposFiguraVO tiposFiguraVO)
    {
        this.tiposFiguraVO = tiposFiguraVO;
    }
}