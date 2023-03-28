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
public class CartaPorteVO implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    private String version;
    private String transpInternac;
    private String entradaSalidaMerc;
    private String paisOrigenDestino;
    private String viaEntradaSalida;
    private BigDecimal totalDistRec;
    private UbicacionesVO ubicacionesVO;
    private MercanciasVO mercanciasVO;
    private FiguraTransporteVO figuraTransporteVO;
    
    /**
     * @return the version
     */
    public String getVersion() {
        return version;
    }

    /**
     * @param version the version to set
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * @return the transpInternac
     */
    public String getTranspInternac() {
        return transpInternac;
    }

    /**
     * @param transpInternac the transpInternac to set
     */
    public void setTranspInternac(String transpInternac) {
        this.transpInternac = transpInternac;
    }

    /**
     * @return the entradaSalidaMerc
     */
    public String getEntradaSalidaMerc() {
        return entradaSalidaMerc;
    }

    /**
     * @param entradaSalidaMerc the entradaSalidaMerc to set
     */
    public void setEntradaSalidaMerc(String entradaSalidaMerc) {
        this.entradaSalidaMerc = entradaSalidaMerc;
    }

    /**
     * @return the paisOrigenDestino
     */
    public String getPaisOrigenDestino() {
        return paisOrigenDestino;
    }

    /**
     * @param paisOrigenDestino the paisOrigenDestino to set
     */
    public void setPaisOrigenDestino(String paisOrigenDestino) {
        this.paisOrigenDestino = paisOrigenDestino;
    }

    /**
     * @return the viaEntradaSalida
     */
    public String getViaEntradaSalida() {
        return viaEntradaSalida;
    }

    /**
     * @param viaEntradaSalida the viaEntradaSalida to set
     */
    public void setViaEntradaSalida(String viaEntradaSalida) {
        this.viaEntradaSalida = viaEntradaSalida;
    }

    /**
     * @return the totalDistRec
     */
    public BigDecimal getTotalDistRec() {
        return totalDistRec;
    }

    /**
     * @param totalDistRec the totalDistRec to set
     */
    public void setTotalDistRec(BigDecimal totalDistRec) {
        this.totalDistRec = totalDistRec;
    }

    /**
     * @return the ubicacionesVO
     */
    public UbicacionesVO getUbicacionesVO() {
        return ubicacionesVO;
    }

    /**
     * @param ubicacionesVO the ubicacionesVO to set
     */
    public void setUbicacionesVO(UbicacionesVO ubicacionesVO) {
        this.ubicacionesVO = ubicacionesVO;
    }

    /**
     * @return the mercanciasVO
     */
    public MercanciasVO getMercanciasVO() {
        return mercanciasVO;
    }

    /**
     * @param mercanciasVO the mercanciasVO to set
     */
    public void setMercanciasVO(MercanciasVO mercanciasVO) {
        this.mercanciasVO = mercanciasVO;
    }

    /**
     * @return the figuraTransporteVO
     */
    public FiguraTransporteVO getFiguraTransporteVO() {
        return figuraTransporteVO;
    }

    /**
     * @param figuraTransporteVO the figuraTransporteVO to set
     */
    public void setFiguraTransporteVO(FiguraTransporteVO figuraTransporteVO) {
        this.figuraTransporteVO = figuraTransporteVO;
    }
    
}
