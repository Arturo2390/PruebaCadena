/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebacadena.vo;

import java.io.Serializable;
import java.util.ArrayList;

/*
 * @author Aban
 */
public class PartesTransporteVO implements Serializable
{
    private static final long serialVersionUID = 1L;
    
    private ArrayList<ParteTransporteVO> parteTransporteVO;

    public ArrayList<ParteTransporteVO> getParteTransporteVO()
    {
        return parteTransporteVO;
    }

    public void setParteTransporteVO(ArrayList<ParteTransporteVO> parteTransporteVO)
    {
        this.parteTransporteVO = parteTransporteVO;
    }
}