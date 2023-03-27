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
public class TransporteFerroviarioVO implements Serializable
{
    private static final long serialVersionUID = 1L;
    private String tipoDeServicio;
    private String tipoDeTrafico;
    private String nombreAseg;
    private String numPolizaSeguro;
    private DerechosDePasoVO derechosDePasoVO;
    private CarroVO carroVO;
    
    public String getTipoDeServicio()
    {
        return tipoDeServicio;
    }

    public void setTipoDeServicio(String tipoDeServicio)
    {
        this.tipoDeServicio = tipoDeServicio;
    }

    public String getTipoDeTrafico()
    {
        return tipoDeTrafico;
    }

    public void setTipoDeTrafico(String tipoDeTrafico)
    {
        this.tipoDeTrafico = tipoDeTrafico;
    }

    public String getNombreAseg()
    {
        return nombreAseg;
    }

    public void setNombreAseg(String nombreAseg)
    {
        this.nombreAseg = nombreAseg;
    }

    public String getNumPolizaSeguro()
    {
        return numPolizaSeguro;
    }

    public void setNumPolizaSeguro(String numPolizaSeguro)
    {
        this.numPolizaSeguro = numPolizaSeguro;
    }

    public DerechosDePasoVO getDerechosDePasoVO()
    {
        return derechosDePasoVO;
    }

    public void setDerechosDePasoVO(DerechosDePasoVO derechosDePasoVO)
    {
        this.derechosDePasoVO = derechosDePasoVO;
    }

    public CarroVO getCarroVO()
    {
        return carroVO;
    }

    public void setCarroVO(CarroVO carroVO)
    {
        this.carroVO = carroVO;
    }
}