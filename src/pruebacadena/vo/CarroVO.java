/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebacadena.vo;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 *
 * @author Aban
 */
public class CarroVO implements Serializable
{
    private static final long serialVersionUID = 1L;
    private String tipoCarro;
    private String matriculaCarro;
    private String guiaCarro;
    private BigDecimal toneladasNetasCarro;
    private ContenedorVO contenedorVO;

    public String getTipoCarro()
    {
        return tipoCarro;
    }

    public void setTipoCarro(String tipoCarro)
    {
        this.tipoCarro = tipoCarro;
    }

    public String getMatriculaCarro()
    {
        return matriculaCarro;
    }

    public void setMatriculaCarro(String matriculaCarro)
    {
        this.matriculaCarro = matriculaCarro;
    }

    public String getGuiaCarro()
    {
        return guiaCarro;
    }

    public void setGuiaCarro(String guiaCarro)
    {
        this.guiaCarro = guiaCarro;
    }

    public BigDecimal getToneladasNetasCarro()
    {
        return toneladasNetasCarro;
    }

    public void setToneladasNetasCarro(BigDecimal toneladasNetasCarro)
    {
        this.toneladasNetasCarro = toneladasNetasCarro;
    }

    public ContenedorVO getContenedorVO()
    {
        return contenedorVO;
    }

    public void setContenedorVo(ContenedorVO contenedorVO)
    {
        this.contenedorVO = contenedorVO;
    }
    
}
