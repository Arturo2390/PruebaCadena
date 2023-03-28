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
public class TransporteMaritimoVO implements Serializable
{
    private static final long serialVersionUID = 1L;
    private String permSCT;
    private String numPermisoSCT;
    private String nombreAseg;
    private String numPolizaSeguro;
    private String tipoEmbarcacion;
    private String matricula;
    private String numeroOMI;
    private String anioEmbarcacion;
    private String nombreEmbarc;
    private String nacionalidadEmbarc;
    private BigDecimal unidadesDeArqBruto;
    private String tipoCarga;
    private String numCertITC;
    private BigDecimal eslora;
    private BigDecimal manga;
    private BigDecimal calado;
    private String lineaNaviera;
    private String nombreAgenteNaviero;
    private String numAutorizacionNaviero;
    private String numViaje;
    private String numConocEmbarc;
    private ContenedorVO contenedorVO;
    
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

    public String getTipoEmbarcacion()
    {
        return tipoEmbarcacion;
    }

    public void setTipoEmbarcacion(String tipoEmbarcacion)
    {
        this.tipoEmbarcacion = tipoEmbarcacion;
    }

    public String getMatricula()
    {
        return matricula;
    }

    public void setMatricula(String matricula)
    {
        this.matricula = matricula;
    }

    public String getNumeroOMI()
    {
        return numeroOMI;
    }

    public void setNumeroOMI(String numeroOMI)
    {
            this.numeroOMI = numeroOMI;
    }

    public String getAnioEmbarcacion()
    {
        return anioEmbarcacion;
    }

    public void setAnioEmbarcacion(String anioEmbarcacion)
    {
        this.anioEmbarcacion = anioEmbarcacion;
    }

    public String getNombreEmbarc()
    {
        return nombreEmbarc;
    }

    public void setNombreEmbarc(String nombreEmbarc)
    {
        this.nombreEmbarc = nombreEmbarc;
    }

    public String getNacionalidadEmbarc()
    {
        return nacionalidadEmbarc;
    }

    public void setNacionalidadEmbarc(String nacionalidadEmbarc)
    {
        this.nacionalidadEmbarc = nacionalidadEmbarc;
    }

    public BigDecimal getUnidadesDeArqBruto()
    {
        return unidadesDeArqBruto;
    }

    public void setUnidadesDeArqBruto(BigDecimal unidadesDeArqBruto)
    {
        this.unidadesDeArqBruto = unidadesDeArqBruto;
    }

    public String getTipoCarga()
    {
        return tipoCarga;
    }

    public void setTipoCarga(String tipoCarga)
    {
        this.tipoCarga = tipoCarga;
    }

    public String getNumCertITC()
    {
        return numCertITC;
    }

    public void setNumCertITC(String numCertITC) {
        this.numCertITC = numCertITC;
    }

    public BigDecimal getEslora()
    {
        return eslora;
    }

    public void setEslora(BigDecimal eslora)
    {
        this.eslora = eslora;
    }

    public BigDecimal getManga()
    {
        return manga;
    }

    public void setManga(BigDecimal manga)
    {
        this.manga = manga;
    }

    public BigDecimal getCalado()
    {
        return calado;
    }

    public void setCalado(BigDecimal calado)
    {
        this.calado = calado;
    }

    public String getLineaNaviera()
    {
        return lineaNaviera;
    }

    public void setLineaNaviera(String lineaNaviera)
    {
        this.lineaNaviera = lineaNaviera;
    }

    public String getNombreAgenteNaviero()
    {
        return nombreAgenteNaviero;
    }

    public void setNombreAgenteNaviero(String nombreAgenteNaviero)
    {
        this.nombreAgenteNaviero = nombreAgenteNaviero;
    }

    public String getNumAutorizacionNaviero()
    {
        return numAutorizacionNaviero;
    }

    public void setNumAutorizacionNaviero(String numAutorizacionNaviero)
    {
        this.numAutorizacionNaviero = numAutorizacionNaviero;
    }

    public String getNumViaje()
    {
        return numViaje;
    }

    public void setNumViaje(String numViaje)
    {
        this.numViaje = numViaje;
    }

    public String getNumConocEmbarc()
    {
        return numConocEmbarc;
    }

    public void setNumConocEmbarc(String numConocEmbarc)
    {
        this.numConocEmbarc = numConocEmbarc;
    }

    public ContenedorVO getContenedorVO()
    {
        return contenedorVO;
    }

    public void setContenedorVO(ContenedorVO contenedorVO)
    {
        this.contenedorVO = contenedorVO;
    }
}