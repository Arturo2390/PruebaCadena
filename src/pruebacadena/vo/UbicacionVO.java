/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebacadena.vo;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 *
 * @author usuario
 */
public class UbicacionVO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String tipoUbicacion;
    private String idUbicacion;
    private String rfcRemitenteDestinatario;
    private String nombreRemitenteDestinatario;
    private String numRegIdTrib;
    private String residenciaFiscal;
    private String numEstacion;
    private String nombreEstacion;
    private String navegacionTrafico;
    private LocalDateTime fechaHoraSalidaLlegada;
    private String tipoEstacion;
    private String distanciaRecorrida;
    private DomicilioVO domicilioVO;
    
    /**
     * @return the tipoUbicacion
     */
    public String getTipoUbicacion() {
        return tipoUbicacion;
    }

    /**
     * @param tipoUbicacion the tipoUbicacion to set
     */
    public void setTipoUbicacion(String tipoUbicacion) {
        this.tipoUbicacion = tipoUbicacion;
    }

    /**
     * @return the idUbicacion
     */
    public String getIdUbicacion() {
        return idUbicacion;
    }

    /**
     * @param idUbicacion the idUbicacion to set
     */
    public void setIdUbicacion(String idUbicacion) {
        this.idUbicacion = idUbicacion;
    }

    /**
     * @return the rfcRemitenteDestinatario
     */
    public String getRfcRemitenteDestinatario() {
        return rfcRemitenteDestinatario;
    }

    /**
     * @param rfcRemitenteDestinatario the rfcRemitenteDestinatario to set
     */
    public void setRfcRemitenteDestinatario(String rfcRemitenteDestinatario) {
        this.rfcRemitenteDestinatario = rfcRemitenteDestinatario;
    }

    /**
     * @return the nombreRemitenteDestinatario
     */
    public String getNombreRemitenteDestinatario() {
        return nombreRemitenteDestinatario;
    }

    /**
     * @param nombreRemitenteDestinatario the nombreRemitenteDestinatario to set
     */
    public void setNombreRemitenteDestinatario(String nombreRemitenteDestinatario) {
        this.nombreRemitenteDestinatario = nombreRemitenteDestinatario;
    }

    /**
     * @return the numRegIdTrib
     */
    public String getNumRegIdTrib() {
        return numRegIdTrib;
    }

    /**
     * @param numRegIdTrib the numRegIdTrib to set
     */
    public void setNumRegIdTrib(String numRegIdTrib) {
        this.numRegIdTrib = numRegIdTrib;
    }

    /**
     * @return the residenciaFiscal
     */
    public String getResidenciaFiscal() {
        return residenciaFiscal;
    }

    /**
     * @param residenciaFiscal the residenciaFiscal to set
     */
    public void setResidenciaFiscal(String residenciaFiscal) {
        this.residenciaFiscal = residenciaFiscal;
    }

    /**
     * @return the numEstacion
     */
    public String getNumEstacion() {
        return numEstacion;
    }

    /**
     * @param numEstacion the numEstacion to set
     */
    public void setNumEstacion(String numEstacion) {
        this.numEstacion = numEstacion;
    }

    /**
     * @return the nombreEstacion
     */
    public String getNombreEstacion() {
        return nombreEstacion;
    }

    /**
     * @param nombreEstacion the nombreEstacion to set
     */
    public void setNombreEstacion(String nombreEstacion) {
        this.nombreEstacion = nombreEstacion;
    }

    /**
     * @return the navegacionTrafico
     */
    public String getNavegacionTrafico() {
        return navegacionTrafico;
    }

    /**
     * @param navegacionTrafico the navegacionTrafico to set
     */
    public void setNavegacionTrafico(String navegacionTrafico) {
        this.navegacionTrafico = navegacionTrafico;
    }

        /**
     * @return the fechaHoraSalidaLlegada
     */
    public LocalDateTime getFechaHoraSalidaLlegada() {
        return fechaHoraSalidaLlegada;
    }

    /**
     * @param fechaHoraSalidaLlegada the fechaHoraSalidaLlegada to set
     */
    public void setFechaHoraSalidaLlegada(LocalDateTime fechaHoraSalidaLlegada) {
        this.fechaHoraSalidaLlegada = fechaHoraSalidaLlegada;
    }

    /**
     * @return the tipoEstacion
     */
    public String getTipoEstacion() {
        return tipoEstacion;
    }

    /**
     * @param tipoEstacion the tipoEstacion to set
     */
    public void setTipoEstacion(String tipoEstacion) {
        this.tipoEstacion = tipoEstacion;
    }

    /**
     * @return the distanciaRecorrida
     */
    public String getDistanciaRecorrida() {
        return distanciaRecorrida;
    }

    /**
     * @param distanciaRecorrida the distanciaRecorrida to set
     */
    public void setDistanciaRecorrida(String distanciaRecorrida) {
        this.distanciaRecorrida = distanciaRecorrida;
    }
    
    /**
     * @return the domicilioVO
     */
    public DomicilioVO getDomicilioVO() {
        return domicilioVO;
    }

    /**
     * @param domicilioVO the domicilioVO to set
     */
    public void setDomicilioVO(DomicilioVO domicilioVO) {
        this.domicilioVO = domicilioVO;
    }

}
