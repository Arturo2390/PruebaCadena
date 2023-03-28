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
public class TiposFiguraVO implements Serializable
{
    private static final long serialVersionUID = 1L;
    private String tipoFigura;
    private String rfcFigura;
    private String numLicencia;
    private String nombreFigura;
    private String numRegIdTribFigura;
    private String residenciaFiscalFigura;
    private PartesTransporteVO partesTransporteVO;
    private DomicilioVO domicilioVO;
    
    public String getTipoFigura()
    {
        return tipoFigura;
    }

    public void setTipoFigura(String tipoFigura)
    {
        this.tipoFigura = tipoFigura;
    }

    public String getRfcFigura()
    {
        return rfcFigura;
    }

    public void setRfcFigura(String rfcFigura)
    {
        this.rfcFigura = rfcFigura;
    }

    public String getNumLicencia()
    {
        return numLicencia;
    }

    public void setNumLicencia(String numLicencia)
    {
        this.numLicencia = numLicencia;
    }

    public String getNombreFigura()
    {
        return nombreFigura;
    }

    public void setNombreFigura(String nombreFigura)
    {
        this.nombreFigura = nombreFigura;
    }

    public String getNumRegIdTribFigura()
    {
        return numRegIdTribFigura;
    }

    public void setNumRegIdTribFigura(String numRegIdTribFigura)
    {
        this.numRegIdTribFigura = numRegIdTribFigura;
    }

    public String getResidenciaFiscalFigura()
    {
        return residenciaFiscalFigura;
    }

    public void setResidenciaFiscalFigura(String residenciaFiscalFigura)
    {
        this.residenciaFiscalFigura = residenciaFiscalFigura;
    }

    public PartesTransporteVO getPartesTransporteVO()
    {
        return partesTransporteVO;
    }

    public void setPartesTransporteVO(PartesTransporteVO partesTransporteVO)
    {
        this.partesTransporteVO = partesTransporteVO;
    }

    public DomicilioVO getDomicilioVO()
    {
        return domicilioVO;
    }

    public void setDomicilioVO(DomicilioVO domicilioVO)
    {
        this.domicilioVO = domicilioVO;
    }
}