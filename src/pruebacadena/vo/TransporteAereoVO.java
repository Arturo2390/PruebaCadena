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
public class TransporteAereoVO implements Serializable
{
    private static final long serialVersionUID = 1L;
    private String permSCT;
    private String numPermisoSCT;
    private String matriculaAeronave;
    private String nombreAseg;
    private String numPolizaSeguro;
    private String numeroGuia;
    private String lugarContrato;
    private String codigoTransportista;
    private String rfcEmbarcador;
    private String numRegIdTribEmbarc;
    private String residenciaFiscalEmbarc;
    private String nombreEmbarcador;
    
    public String getPermSCT()
    {
        return permSCT;
    }

    public void setPermSCT(String permSCT)
    {
        this.permSCT = permSCT;
    }

    public String getNumPermisoSCT()
    {
        return numPermisoSCT;
    }

    public void setNumPermisoSCT(String numPermisoSCT)
    {
        this.numPermisoSCT = numPermisoSCT;
    }

    public String getMatriculaAeronave()
    {
        return matriculaAeronave;
    }

    public void setMatriculaAeronave(String matriculaAeronave)
    {
        this.matriculaAeronave = matriculaAeronave;
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

    public String getNumeroGuia()
    {
        return numeroGuia;
    }

    public void setNumeroGuia(String numeroGuia)
    {
        this.numeroGuia = numeroGuia;
    }

    public String getLugarContrato()
    {
        return lugarContrato;
    }

    public void setLugarContrato(String lugarContrato)
    {
        this.lugarContrato = lugarContrato;
    }

    public String getCodigoTransportista()
    {
        return codigoTransportista;
    }

    public void setCodigoTransportista(String codigoTransportista)
    {
        this.codigoTransportista = codigoTransportista;
    }

    public String getRfcEmbarcador()
    {
        return rfcEmbarcador;
    }

    public void setRfcEmbarcador(String rfcEmbarcador)
    {
        this.rfcEmbarcador = rfcEmbarcador;
    }

    public String getNumRegIdTribEmbarc()
    {
        return numRegIdTribEmbarc;
    }

    public void setNumRegIdTribEmbarc(String numRegIdTribEmbarc)
    {
        this.numRegIdTribEmbarc = numRegIdTribEmbarc;
    }

    public String getResidenciaFiscalEmbarc()
    {
        return residenciaFiscalEmbarc;
    }

    public void setResidenciaFiscalEmbarc(String residenciaFiscalEmbarc)
    {
        this.residenciaFiscalEmbarc = residenciaFiscalEmbarc;
    }

    public String getNombreEmbarcador()
    {
        return nombreEmbarcador;
    }

    public void setNombreEmbarcador(String nombreEmbarcador)
    {
        this.nombreEmbarcador = nombreEmbarcador;
    }
}