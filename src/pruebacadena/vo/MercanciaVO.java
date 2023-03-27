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
public class MercanciaVO implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    private String bienesTransp;
    private String claveSTCC;
    private String descripcion;
    private BigDecimal cantidad;
    private String claveUnidad;
    private String unidad;
    private String dimensiones;
    private String materialPeligroso;
    private String cveMaterialPeligroso;
    private String embalaje;
    private String descripEmbalaje;
    private BigDecimal pesoEnKg;
    private BigDecimal valorMercancia;
    private String moneda;
    private String fraccionArancelaria;
    private String uuidComercioExt;
    private PedimentosVO pedimentosVO;
    private GuiasIdentificacionVO guiasIdentificacionVO;
    private CantidadTransportaVO cantidadTransportaVO;
    private DetalleMercanciaVO detalleMercanciaVO;
        
    /**
     * @return the bienesTransp
     */
    public String getBienesTransp() {
        return bienesTransp;
    }

    /**
     * @param bienesTransp the bienesTransp to set
     */
    public void setBienesTransp(String bienesTransp) {
        this.bienesTransp = bienesTransp;
    }

    /**
     * @return the claveSTCC
     */
    public String getClaveSTCC() {
        return claveSTCC;
    }

    /**
     * @param claveSTCC the claveSTCC to set
     */
    public void setClaveSTCC(String claveSTCC) {
        this.claveSTCC = claveSTCC;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the cantidad
     */
    public BigDecimal getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(BigDecimal cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the claveUnidad
     */
    public String getClaveUnidad() {
        return claveUnidad;
    }

    /**
     * @param claveUnidad the claveUnidad to set
     */
    public void setClaveUnidad(String claveUnidad) {
        this.claveUnidad = claveUnidad;
    }

    /**
     * @return the unidad
     */
    public String getUnidad() {
        return unidad;
    }

    /**
     * @param unidad the unidad to set
     */
    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    /**
     * @return the dimensiones
     */
    public String getDimensiones() {
        return dimensiones;
    }

    /**
     * @param dimensiones the dimensiones to set
     */
    public void setDimensiones(String dimensiones) {
        this.dimensiones = dimensiones;
    }

    /**
     * @return the materialPeligroso
     */
    public String getMaterialPeligroso() {
        return materialPeligroso;
    }

    /**
     * @param materialPeligroso the materialPeligroso to set
     */
    public void setMaterialPeligroso(String materialPeligroso) {
        this.materialPeligroso = materialPeligroso;
    }

    /**
     * @return the cveMaterialPeligroso
     */
    public String getCveMaterialPeligroso() {
        return cveMaterialPeligroso;
    }

    /**
     * @param cveMaterialPeligroso the cveMaterialPeligroso to set
     */
    public void setCveMaterialPeligroso(String cveMaterialPeligroso) {
        this.cveMaterialPeligroso = cveMaterialPeligroso;
    }

    /**
     * @return the embalaje
     */
    public String getEmbalaje() {
        return embalaje;
    }

    /**
     * @param embalaje the embalaje to set
     */
    public void setEmbalaje(String embalaje) {
        this.embalaje = embalaje;
    }

    /**
     * @return the descripEmbalaje
     */
    public String getDescripEmbalaje() {
        return descripEmbalaje;
    }

    /**
     * @param descripEmbalaje the descripEmbalaje to set
     */
    public void setDescripEmbalaje(String descripEmbalaje) {
        this.descripEmbalaje = descripEmbalaje;
    }

    /**
     * @return the pesoEnKg
     */
    public BigDecimal getPesoEnKg() {
        return pesoEnKg;
    }

    /**
     * @param pesoEnKg the pesoEnKg to set
     */
    public void setPesoEnKg(BigDecimal pesoEnKg) {
        this.pesoEnKg = pesoEnKg;
    }

    /**
     * @return the valorMercancia
     */
    public BigDecimal getValorMercancia() {
        return valorMercancia;
    }

    /**
     * @param valorMercancia the valorMercancia to set
     */
    public void setValorMercancia(BigDecimal valorMercancia) {
        this.valorMercancia = valorMercancia;
    }

    /**
     * @return the moneda
     */
    public String getMoneda() {
        return moneda;
    }

    /**
     * @param moneda the moneda to set
     */
    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    /**
     * @return the fraccionArancelaria
     */
    public String getFraccionArancelaria() {
        return fraccionArancelaria;
    }

    /**
     * @param fraccionArancelaria the fraccionArancelaria to set
     */
    public void setFraccionArancelaria(String fraccionArancelaria) {
        this.fraccionArancelaria = fraccionArancelaria;
    }

    /**
     * @return the uuidComercioExt
     */
    public String getUuidComercioExt() {
        return uuidComercioExt;
    }

    /**
     * @param uuidComercioExt the uuidComercioExt to set
     */
    public void setUuidComercioExt(String uuidComercioExt) {
        this.uuidComercioExt = uuidComercioExt;
    }

    /**
     * @return the pedimentosVO
     */
    public PedimentosVO getPedimentosVO() {
        return pedimentosVO;
    }

    /**
     * @param pedimentosVO the pedimentosVO to set
     */
    public void setPedimentosVO(PedimentosVO pedimentosVO) {
        this.pedimentosVO = pedimentosVO;
    }

    /**
     * @return the guiasIdentificacionVO
     */
    public GuiasIdentificacionVO getGuiasIdentificacionVO() {
        return guiasIdentificacionVO;
    }

    /**
     * @param guiasIdentificacionVO the guiasIdentificacionVO to set
     */
    public void setGuiasIdentificacionVO(GuiasIdentificacionVO guiasIdentificacionVO) {
        this.guiasIdentificacionVO = guiasIdentificacionVO;
    }

    /**
     * @return the cantidadTransportaVO
     */
    public CantidadTransportaVO getCantidadTransportaVO() {
        return cantidadTransportaVO;
    }

    /**
     * @param cantidadTransportaVO the cantidadTransportaVO to set
     */
    public void setCantidadTransportaVO(CantidadTransportaVO cantidadTransportaVO) {
        this.cantidadTransportaVO = cantidadTransportaVO;
    }

    /**
     * @return the detalleMercanciaVO
     */
    public DetalleMercanciaVO getDetalleMercanciaVO() {
        return detalleMercanciaVO;
    }

    /**
     * @param detalleMercanciaVO the detalleMercanciaVO to set
     */
    public void setDetalleMercanciaVO(DetalleMercanciaVO detalleMercanciaVO) {
        this.detalleMercanciaVO = detalleMercanciaVO;
    }
    
}
