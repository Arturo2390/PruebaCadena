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
 * @author usuario
 */
public class MercanciasVO implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private BigDecimal pesoBrutoTotal;
    private String unidadPeso;
    private BigDecimal pesoNetoTotal;
    private Integer numTotalMercancias;
    private BigDecimal cargoPorTasacion;
    private MercanciaVO mercanciaVO;
    private AutotransporteVO autotransporteVO;
    private TransporteMaritimoVO transporteMaritimoVO;
    private TransporteAereoVO transporteAereoVO;
    private TransporteFerroviarioVO transporteFerroviarioVO;
    
    /**
     * @return the pesoBrutoTotal
     */
    public BigDecimal getPesoBrutoTotal() {
        return pesoBrutoTotal;
    }

    /**
     * @param pesoBrutoTotal the pesoBrutoTotal to set
     */
    public void setPesoBrutoTotal(BigDecimal pesoBrutoTotal) {
        this.pesoBrutoTotal = pesoBrutoTotal;
    }

    /**
     * @return the unidadPeso
     */
    public String getUnidadPeso() {
        return unidadPeso;
    }

    /**
     * @param unidadPeso the unidadPeso to set
     */
    public void setUnidadPeso(String unidadPeso) {
        this.unidadPeso = unidadPeso;
    }

    /**
     * @return the pesoNetoTotal
     */
    public BigDecimal getPesoNetoTotal() {
        return pesoNetoTotal;
    }

    /**
     * @param pesoNetoTotal the pesoNetoTotal to set
     */
    public void setPesoNetoTotal(BigDecimal pesoNetoTotal) {
        this.pesoNetoTotal = pesoNetoTotal;
    }

    /**
     * @return the numTotalMercancias
     */
    public Integer getNumTotalMercancias() {
        return numTotalMercancias;
    }

    /**
     * @param numTotalMercancias the numTotalMercancias to set
     */
    public void setNumTotalMercancias(Integer numTotalMercancias) {
        this.numTotalMercancias = numTotalMercancias;
    }

    /**
     * @return the cargoPorTasacion
     */
    public BigDecimal getCargoPorTasacion() {
        return cargoPorTasacion;
    }

    /**
     * @param cargoPorTasacion the cargoPorTasacion to set
     */
    public void setCargoPorTasacion(BigDecimal cargoPorTasacion) {
        this.cargoPorTasacion = cargoPorTasacion;
    }

    /**
     * @return the mercanciaVO
     */
    public MercanciaVO getMercanciaVO() {
        return mercanciaVO;
    }

    /**
     * @param mercanciaVO the mercanciaVO to set
     */
    public void setMercanciaVO(MercanciaVO mercanciaVO) {
        this.mercanciaVO = mercanciaVO;
    }
 
    /**
     * @return the autotransporteVO
     */
    public AutotransporteVO getAutotransporteVO() {
        return autotransporteVO;
    }

    /**
     * @param autotransporteVO the autotransporteVO to set
     */
    public void setAutotransporteVO(AutotransporteVO autotransporteVO) {
        this.autotransporteVO = autotransporteVO;
    }
 
    /**
     * @return the transporteMaritimoVO
     */
    public TransporteMaritimoVO getTransporteMaritimoVO() {
        return transporteMaritimoVO;
    }

    /**
     * @param transporteMaritimoVO the transporteMaritimoVO to set
     */
    public void setTransporteMaritimoVO(TransporteMaritimoVO transporteMaritimoVO) {
        this.transporteMaritimoVO = transporteMaritimoVO;
    }

    /**
     * @return the transporteAereoVO
     */
    public TransporteAereoVO getTransporteAereoVO() {
        return transporteAereoVO;
    }

    /**
     * @param transporteAereoVO the transporteAereoVO to set
     */
    public void setTransporteAereoVO(TransporteAereoVO transporteAereoVO) {
        this.transporteAereoVO = transporteAereoVO;
    }

    /**
     * @return the transporteFerroviarioVO
     */
    public TransporteFerroviarioVO getTransporteFerroviarioVO() {
        return transporteFerroviarioVO;
    }

    /**
     * @param transporteFerroviarioVO the transporteFerroviarioVO to set
     */
    public void setTransporteFerroviarioVO(TransporteFerroviarioVO transporteFerroviarioVO) {
        this.transporteFerroviarioVO = transporteFerroviarioVO;
    }
    
}