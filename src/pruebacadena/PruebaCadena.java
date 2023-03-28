/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebacadena;

import java.util.ArrayList;
import pruebacadena.dao.ComplementoCartaPorteDao;
import pruebacadena.vo.AutotransporteVO;
import pruebacadena.vo.CantidadTransportaVO;
import pruebacadena.vo.CarroVO;
import pruebacadena.vo.CartaPorteVO;
import pruebacadena.vo.ContenedorVO;
import pruebacadena.vo.DerechosDePasoVO;
import pruebacadena.vo.DetalleMercanciaVO;
import pruebacadena.vo.DomicilioVO;
import pruebacadena.vo.FiguraTransporteVO;
import pruebacadena.vo.GuiasIdentificacionVO;
import pruebacadena.vo.IdentificacionVehicularVO;
import pruebacadena.vo.MercanciasVO;
import pruebacadena.vo.MercanciaVO;
import pruebacadena.vo.PartesTransporteVO;
import pruebacadena.vo.ParteTransporteVO;
import pruebacadena.vo.PedimentosVO;
import pruebacadena.vo.PedimentoVO;
import pruebacadena.vo.RemolquesVO;
import pruebacadena.vo.RemolqueVO;
import pruebacadena.vo.SegurosVO;
import pruebacadena.vo.TiposFiguraVO;
import pruebacadena.vo.TransporteAereoVO;
import pruebacadena.vo.TransporteFerroviarioVO;
import pruebacadena.vo.TransporteMaritimoVO;
import pruebacadena.vo.UbicacionesVO;
import pruebacadena.vo.UbicacionVO;

/**
 *
 * @author usuario
 */
public class PruebaCadena {

    /**
     * @param args the command line arguments
     */
    static public void main(String[] args) {
        generaCadenaCCP();
        //prueba();
    }
            
    static public String addCadena(String dato) {
        String regresar = "";
        if (dato == null) {
            return regresar;
        }
        String temp = dato.replaceAll(" +", " ").trim();
        if (temp != null && !temp.equals("")) {
            regresar = temp + "|";
        }
        return regresar;
    }

    static public String generaCadenaCCP(){
        
        String cadenaCCP = "||";
        int fctClef = 1;
        ComplementoCartaPorteDao complementoCartaPorteDao = new ComplementoCartaPorteDao();
        CartaPorteVO cartaPorteVO = complementoCartaPorteDao.consultaCartaPorte(fctClef);
        
        try {
            cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getVersion());
            cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getTranspInternac());
            if (cartaPorteVO.getEntradaSalidaMerc() != null && !cartaPorteVO.getEntradaSalidaMerc().equals("")){
                cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getEntradaSalidaMerc());
            }
            if (cartaPorteVO.getPaisOrigenDestino() != null && !cartaPorteVO.getPaisOrigenDestino().equals("")){
                cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getPaisOrigenDestino());
            }
            if (cartaPorteVO.getViaEntradaSalida() != null && !cartaPorteVO.getViaEntradaSalida().equals("")){
                cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getViaEntradaSalida());
            }
            if (cartaPorteVO.getTotalDistRec() != null && !cartaPorteVO.getTotalDistRec().equals("")){
                cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getTotalDistRec().toString());
            }
            if(cartaPorteVO.getUbicacionesVO() != null){   
                if(cartaPorteVO.getUbicacionesVO().getUbicacionVO() != null){
                    for(int i=0; i<cartaPorteVO.getUbicacionesVO().getUbicacionVO().size(); i++){
                        cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getUbicacionesVO().getUbicacionVO().get(i).getTipoUbicacion());
                        if(cartaPorteVO.getUbicacionesVO().getUbicacionVO().get(i).getIdUbicacion() != null && !cartaPorteVO.getUbicacionesVO().getUbicacionVO().get(i).getIdUbicacion().equals("")){
                            cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getUbicacionesVO().getUbicacionVO().get(i).getIdUbicacion());
                        }
                        cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getUbicacionesVO().getUbicacionVO().get(i).getRfcRemitenteDestinatario());
                        if(cartaPorteVO.getUbicacionesVO().getUbicacionVO().get(i).getNombreRemitenteDestinatario() != null && !cartaPorteVO.getUbicacionesVO().getUbicacionVO().get(i).getNombreRemitenteDestinatario().equals("")){
                            cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getUbicacionesVO().getUbicacionVO().get(i).getNombreRemitenteDestinatario());
                        }
                        if(cartaPorteVO.getUbicacionesVO().getUbicacionVO().get(i).getNumRegIdTrib() != null && !cartaPorteVO.getUbicacionesVO().getUbicacionVO().get(i).getNumRegIdTrib().equals("")){
                            cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getUbicacionesVO().getUbicacionVO().get(i).getNumRegIdTrib());
                        }
                        if(cartaPorteVO.getUbicacionesVO().getUbicacionVO().get(i).getResidenciaFiscal() != null && !cartaPorteVO.getUbicacionesVO().getUbicacionVO().get(i).getResidenciaFiscal().equals("")){
                            cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getUbicacionesVO().getUbicacionVO().get(i).getResidenciaFiscal());
                        }
                        if(cartaPorteVO.getUbicacionesVO().getUbicacionVO().get(i).getNumEstacion() != null && !cartaPorteVO.getUbicacionesVO().getUbicacionVO().get(i).getNumEstacion().equals("")){
                            cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getUbicacionesVO().getUbicacionVO().get(i).getNumEstacion());
                        }
                        if(cartaPorteVO.getUbicacionesVO().getUbicacionVO().get(i).getNombreEstacion() != null && !cartaPorteVO.getUbicacionesVO().getUbicacionVO().get(i).getNombreEstacion().equals("")){
                            cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getUbicacionesVO().getUbicacionVO().get(i).getNombreEstacion());
                        }
                        if(cartaPorteVO.getUbicacionesVO().getUbicacionVO().get(i).getNavegacionTrafico() != null && !cartaPorteVO.getUbicacionesVO().getUbicacionVO().get(i).getNavegacionTrafico().equals("")){
                            cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getUbicacionesVO().getUbicacionVO().get(i).getNavegacionTrafico());
                        }
                        cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getUbicacionesVO().getUbicacionVO().get(i).getFechaHoraSalidaLlegada().toString());
                        if(cartaPorteVO.getUbicacionesVO().getUbicacionVO().get(i).getTipoEstacion() != null && !cartaPorteVO.getUbicacionesVO().getUbicacionVO().get(i).getTipoEstacion().equals("")){
                            cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getUbicacionesVO().getUbicacionVO().get(i).getTipoEstacion());
                        }
                        if(cartaPorteVO.getUbicacionesVO().getUbicacionVO().get(i).getDistanciaRecorrida() != null && !cartaPorteVO.getUbicacionesVO().getUbicacionVO().get(i).getDistanciaRecorrida().equals("")){
                            cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getUbicacionesVO().getUbicacionVO().get(i).getDistanciaRecorrida());
                        }
                        if(cartaPorteVO.getUbicacionesVO().getUbicacionVO().get(i).getDomicilioVO() != null){
                            if(cartaPorteVO.getUbicacionesVO().getUbicacionVO().get(i).getDomicilioVO().getCalle() != null && !cartaPorteVO.getUbicacionesVO().getUbicacionVO().get(i).getDomicilioVO().getCalle().equals("")){
                                cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getUbicacionesVO().getUbicacionVO().get(i).getDomicilioVO().getCalle());
                            }
                            if(cartaPorteVO.getUbicacionesVO().getUbicacionVO().get(i).getDomicilioVO().getNumeroExterior() != null && !cartaPorteVO.getUbicacionesVO().getUbicacionVO().get(i).getDomicilioVO().getNumeroExterior().equals("")){
                                cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getUbicacionesVO().getUbicacionVO().get(i).getDomicilioVO().getNumeroExterior());
                            }
                            if(cartaPorteVO.getUbicacionesVO().getUbicacionVO().get(i).getDomicilioVO().getNumeroInterior() != null && !cartaPorteVO.getUbicacionesVO().getUbicacionVO().get(i).getDomicilioVO().getNumeroInterior().equals("")){
                                cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getUbicacionesVO().getUbicacionVO().get(i).getDomicilioVO().getNumeroInterior());
                            }
                            if(cartaPorteVO.getUbicacionesVO().getUbicacionVO().get(i).getDomicilioVO().getColonia() != null && !cartaPorteVO.getUbicacionesVO().getUbicacionVO().get(i).getDomicilioVO().getColonia().equals("")){
                                cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getUbicacionesVO().getUbicacionVO().get(i).getDomicilioVO().getColonia());
                            }
                            if(cartaPorteVO.getUbicacionesVO().getUbicacionVO().get(i).getDomicilioVO().getLocalidad() != null && !cartaPorteVO.getUbicacionesVO().getUbicacionVO().get(i).getDomicilioVO().getLocalidad().equals("")){
                                cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getUbicacionesVO().getUbicacionVO().get(i).getDomicilioVO().getLocalidad());
                            }
                            if(cartaPorteVO.getUbicacionesVO().getUbicacionVO().get(i).getDomicilioVO().getReferencia() != null && !cartaPorteVO.getUbicacionesVO().getUbicacionVO().get(i).getDomicilioVO().getReferencia().equals("")){
                                cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getUbicacionesVO().getUbicacionVO().get(i).getDomicilioVO().getReferencia());
                            }
                            if(cartaPorteVO.getUbicacionesVO().getUbicacionVO().get(i).getDomicilioVO().getMunicipio() != null && !cartaPorteVO.getUbicacionesVO().getUbicacionVO().get(i).getDomicilioVO().getMunicipio().equals("")){
                                cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getUbicacionesVO().getUbicacionVO().get(i).getDomicilioVO().getMunicipio());
                            }
                            cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getUbicacionesVO().getUbicacionVO().get(i).getDomicilioVO().getEstado());
                            cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getUbicacionesVO().getUbicacionVO().get(i).getDomicilioVO().getPais());
                            cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getUbicacionesVO().getUbicacionVO().get(i).getDomicilioVO().getCodigoPostal());
                        }
                    }
                }
            }
            if(cartaPorteVO.getMercanciasVO() != null){
                cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getMercanciasVO().getPesoBrutoTotal().toString());
                cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getMercanciasVO().getUnidadPeso().toString());
                if(cartaPorteVO.getMercanciasVO().getPesoNetoTotal() != null && !cartaPorteVO.getMercanciasVO().getPesoNetoTotal().equals("")){
                    cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getMercanciasVO().getPesoNetoTotal().toString());
                }
                cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getMercanciasVO().getNumTotalMercancias().toString());
                if(cartaPorteVO.getMercanciasVO().getCargoPorTasacion() != null && !cartaPorteVO.getMercanciasVO().getCargoPorTasacion().equals("")){
                    cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getMercanciasVO().getCargoPorTasacion().toString());
                }
                if(cartaPorteVO.getMercanciasVO().getMercanciaVO() != null){
                    cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getMercanciasVO().getMercanciaVO().getBienesTransp());
                    if(cartaPorteVO.getMercanciasVO().getMercanciaVO().getClaveSTCC() != null && !cartaPorteVO.getMercanciasVO().getMercanciaVO().getClaveSTCC().equals("")){
                        cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getMercanciasVO().getMercanciaVO().getClaveSTCC());                
                    }
                    cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getMercanciasVO().getMercanciaVO().getDescripcion());
                    cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getMercanciasVO().getMercanciaVO().getCantidad().toString());
                    cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getMercanciasVO().getMercanciaVO().getClaveUnidad());
                    if(cartaPorteVO.getMercanciasVO().getMercanciaVO().getUnidad() != null && !cartaPorteVO.getMercanciasVO().getMercanciaVO().getUnidad().equals("")){
                        cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getMercanciasVO().getMercanciaVO().getUnidad());
                    }
                    if(cartaPorteVO.getMercanciasVO().getMercanciaVO().getDimensiones() != null && !cartaPorteVO.getMercanciasVO().getMercanciaVO().getDimensiones().equals("")){
                        cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getMercanciasVO().getMercanciaVO().getDimensiones());
                    }
                    if(cartaPorteVO.getMercanciasVO().getMercanciaVO().getMaterialPeligroso() != null && !cartaPorteVO.getMercanciasVO().getMercanciaVO().getMaterialPeligroso().equals("")){
                        cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getMercanciasVO().getMercanciaVO().getMaterialPeligroso());
                    }
                    if(cartaPorteVO.getMercanciasVO().getMercanciaVO().getCveMaterialPeligroso() != null && !cartaPorteVO.getMercanciasVO().getMercanciaVO().getCveMaterialPeligroso().equals("")){
                        cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getMercanciasVO().getMercanciaVO().getCveMaterialPeligroso());
                    }
                    if(cartaPorteVO.getMercanciasVO().getMercanciaVO().getEmbalaje() != null && !cartaPorteVO.getMercanciasVO().getMercanciaVO().getEmbalaje().equals("")){
                        cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getMercanciasVO().getMercanciaVO().getEmbalaje());
                    }
                    if(cartaPorteVO.getMercanciasVO().getMercanciaVO().getDescripEmbalaje() != null && !cartaPorteVO.getMercanciasVO().getMercanciaVO().getDescripEmbalaje().equals("")){
                        cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getMercanciasVO().getMercanciaVO().getDescripEmbalaje());
                    }
                    cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getMercanciasVO().getMercanciaVO().getPesoEnKg().toString());
                    if(cartaPorteVO.getMercanciasVO().getMercanciaVO().getValorMercancia() != null && !cartaPorteVO.getMercanciasVO().getMercanciaVO().getValorMercancia().equals("")){
                        cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getMercanciasVO().getMercanciaVO().getValorMercancia().toString());
                    }
                    if(cartaPorteVO.getMercanciasVO().getMercanciaVO().getMoneda() != null && !cartaPorteVO.getMercanciasVO().getMercanciaVO().getMoneda().equals("")){
                        cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getMercanciasVO().getMercanciaVO().getMoneda());
                    }
                    if(cartaPorteVO.getMercanciasVO().getMercanciaVO().getFraccionArancelaria() != null && !cartaPorteVO.getMercanciasVO().getMercanciaVO().getFraccionArancelaria().equals("")){
                        cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getMercanciasVO().getMercanciaVO().getFraccionArancelaria());
                    }
                    if(cartaPorteVO.getMercanciasVO().getMercanciaVO().getUuidComercioExt() != null && !cartaPorteVO.getMercanciasVO().getMercanciaVO().getUuidComercioExt().equals("")){
                        cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getMercanciasVO().getMercanciaVO().getUuidComercioExt());
                    }
                    if(cartaPorteVO.getMercanciasVO().getMercanciaVO().getPedimentosVO() != null){

                        if(cartaPorteVO.getMercanciasVO().getMercanciaVO().getPedimentosVO().getPedimentoVO() != null){
                            for(int i=0; i<cartaPorteVO.getMercanciasVO().getMercanciaVO().getPedimentosVO().getPedimentoVO().size(); i++){
                                if(cartaPorteVO.getMercanciasVO().getMercanciaVO().getPedimentosVO().getPedimentoVO().get(i).getPedimento() != null && !cartaPorteVO.getMercanciasVO().getMercanciaVO().getPedimentosVO().getPedimentoVO().get(i).getPedimento().equals("")){
                                    cadenaCCP =  cadenaCCP + addCadena(cartaPorteVO.getMercanciasVO().getMercanciaVO().getPedimentosVO().getPedimentoVO().get(i).getPedimento());
                                }
                            }
                        }
                    }
                    if(cartaPorteVO.getMercanciasVO().getMercanciaVO().getGuiasIdentificacionVO() != null){
                        cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getMercanciasVO().getMercanciaVO().getGuiasIdentificacionVO().getNumeroGuiaIdentificacion());
                        cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getMercanciasVO().getMercanciaVO().getGuiasIdentificacionVO().getDescripGuiaIdentificacion());
                        cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getMercanciasVO().getMercanciaVO().getGuiasIdentificacionVO().getPesoGuiaIdentificacion().toString());
                    }
                    if(cartaPorteVO.getMercanciasVO().getMercanciaVO().getCantidadTransportaVO() != null && !cartaPorteVO.getMercanciasVO().getMercanciaVO().getCantidadTransportaVO().equals("")){
                        cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getMercanciasVO().getMercanciaVO().getCantidadTransportaVO().getCantidad().toString());
                        cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getMercanciasVO().getMercanciaVO().getCantidadTransportaVO().getIdOrigen());
                        cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getMercanciasVO().getMercanciaVO().getCantidadTransportaVO().getIdDestino());
                        if(cartaPorteVO.getMercanciasVO().getMercanciaVO().getCantidadTransportaVO().getCvesTransporte() != null && !cartaPorteVO.getMercanciasVO().getMercanciaVO().getCantidadTransportaVO().getCvesTransporte().equals("")){
                            cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getMercanciasVO().getMercanciaVO().getCantidadTransportaVO().getCvesTransporte());
                        }
                    }
                    if(cartaPorteVO.getMercanciasVO().getMercanciaVO().getDetalleMercanciaVO() != null){
                        cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getMercanciasVO().getMercanciaVO().getDetalleMercanciaVO().getUnidadPesoMerc());
                        cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getMercanciasVO().getMercanciaVO().getDetalleMercanciaVO().getPesoBruto().toString());
                        cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getMercanciasVO().getMercanciaVO().getDetalleMercanciaVO().getPesoNeto().toString());
                        cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getMercanciasVO().getMercanciaVO().getDetalleMercanciaVO().getPesoTara().toString());
                        if(cartaPorteVO.getMercanciasVO().getMercanciaVO().getDetalleMercanciaVO().getNumPiezas() != null && !cartaPorteVO.getMercanciasVO().getMercanciaVO().getDetalleMercanciaVO().getNumPiezas().equals("")){
                            cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getMercanciasVO().getMercanciaVO().getDetalleMercanciaVO().getNumPiezas().toString());
                        }
                    }
                }
                if(cartaPorteVO.getMercanciasVO().getAutotransporteVO() != null){
                    cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getMercanciasVO().getAutotransporteVO().getPermSCT());
                    cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getMercanciasVO().getAutotransporteVO().getNumPermisoSCT());
                    if(cartaPorteVO.getMercanciasVO().getAutotransporteVO().getIdentificacionVehicularVO() != null && !cartaPorteVO.getMercanciasVO().getAutotransporteVO().getIdentificacionVehicularVO().equals("")){
                        cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getMercanciasVO().getAutotransporteVO().getIdentificacionVehicularVO().getConfigVehicular());
                        cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getMercanciasVO().getAutotransporteVO().getIdentificacionVehicularVO().getPlacaVM());
                        cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getMercanciasVO().getAutotransporteVO().getIdentificacionVehicularVO().getAnioModeloVM().toString());
                    }
                    if(cartaPorteVO.getMercanciasVO().getAutotransporteVO().getSegurosVO() != null){
                        cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getMercanciasVO().getAutotransporteVO().getSegurosVO().getAseguraRespCivil());
                        cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getMercanciasVO().getAutotransporteVO().getSegurosVO().getPolizaRespCivil());
                        if(cartaPorteVO.getMercanciasVO().getAutotransporteVO().getSegurosVO().getAseguraMedAmbiente() != null && !cartaPorteVO.getMercanciasVO().getAutotransporteVO().getSegurosVO().getAseguraMedAmbiente().equals("")){
                            cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getMercanciasVO().getAutotransporteVO().getSegurosVO().getAseguraMedAmbiente());
                        }
                        if(cartaPorteVO.getMercanciasVO().getAutotransporteVO().getSegurosVO().getPolizaMedAmbiente() != null && !cartaPorteVO.getMercanciasVO().getAutotransporteVO().getSegurosVO().getPolizaMedAmbiente().equals("")){
                            cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getMercanciasVO().getAutotransporteVO().getSegurosVO().getPolizaMedAmbiente());
                        }
                        if(cartaPorteVO.getMercanciasVO().getAutotransporteVO().getSegurosVO().getAseguraCarga() != null && !cartaPorteVO.getMercanciasVO().getAutotransporteVO().getSegurosVO().getAseguraCarga().equals("")){
                            cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getMercanciasVO().getAutotransporteVO().getSegurosVO().getAseguraCarga());
                        }
                        if(cartaPorteVO.getMercanciasVO().getAutotransporteVO().getSegurosVO().getPolizaCarga() != null && !cartaPorteVO.getMercanciasVO().getAutotransporteVO().getSegurosVO().getPolizaCarga().equals("")){
                            cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getMercanciasVO().getAutotransporteVO().getSegurosVO().getPolizaCarga());
                        }
                        if(cartaPorteVO.getMercanciasVO().getAutotransporteVO().getSegurosVO().getPrimaSeguro() != null && !cartaPorteVO.getMercanciasVO().getAutotransporteVO().getSegurosVO().getPrimaSeguro().equals("")){
                            cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getMercanciasVO().getAutotransporteVO().getSegurosVO().getPrimaSeguro().toString());
                        }
                    }
                    if(cartaPorteVO.getMercanciasVO().getAutotransporteVO().getRemolquesVO() != null){
                        if(cartaPorteVO.getMercanciasVO().getAutotransporteVO().getRemolquesVO().getRemolqueVO() != null && !cartaPorteVO.getMercanciasVO().getAutotransporteVO().getRemolquesVO().getRemolqueVO().equals("")){
                            for(int i = 0; i<cartaPorteVO.getMercanciasVO().getAutotransporteVO().getRemolquesVO().getRemolqueVO().size(); i++){
                                cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getMercanciasVO().getAutotransporteVO().getRemolquesVO().getRemolqueVO().get(i).getSubTipoRem());
                                cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getMercanciasVO().getAutotransporteVO().getRemolquesVO().getRemolqueVO().get(i).getPlaca());
                            }
                        }
                    }
                }
                if(cartaPorteVO.getMercanciasVO().getTransporteMaritimoVO() != null){
                    if(cartaPorteVO.getMercanciasVO().getTransporteMaritimoVO().getPermSCT() != null && !cartaPorteVO.getMercanciasVO().getTransporteMaritimoVO().getPermSCT().equals("")){
                        cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getMercanciasVO().getTransporteMaritimoVO().getPermSCT());
                    }
                    if(cartaPorteVO.getMercanciasVO().getTransporteMaritimoVO().getNumPermisoSCT() != null && !cartaPorteVO.getMercanciasVO().getTransporteMaritimoVO().getNumPermisoSCT().equals("")){
                        cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getMercanciasVO().getTransporteMaritimoVO().getNumPermisoSCT());
                    }
                    if(cartaPorteVO.getMercanciasVO().getTransporteMaritimoVO().getNombreAseg() != null && !cartaPorteVO.getMercanciasVO().getTransporteMaritimoVO().getNombreAseg().equals("")){
                        cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getMercanciasVO().getTransporteMaritimoVO().getNombreAseg());
                    }
                    if(cartaPorteVO.getMercanciasVO().getTransporteMaritimoVO().getNumPolizaSeguro() != null && !cartaPorteVO.getMercanciasVO().getTransporteMaritimoVO().getNumPolizaSeguro().equals("")){
                        cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getMercanciasVO().getTransporteMaritimoVO().getNumPolizaSeguro());
                    }
                    cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getMercanciasVO().getTransporteMaritimoVO().getTipoEmbarcacion());
                    cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getMercanciasVO().getTransporteMaritimoVO().getMatricula());
                    cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getMercanciasVO().getTransporteMaritimoVO().getNumeroOMI());
                    if(cartaPorteVO.getMercanciasVO().getTransporteMaritimoVO().getAnioEmbarcacion() != null && !cartaPorteVO.getMercanciasVO().getTransporteMaritimoVO().getAnioEmbarcacion().equals("")){
                        cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getMercanciasVO().getTransporteMaritimoVO().getAnioEmbarcacion());
                    }
                    if(cartaPorteVO.getMercanciasVO().getTransporteMaritimoVO().getNombreEmbarc() != null && !cartaPorteVO.getMercanciasVO().getTransporteMaritimoVO().getNombreEmbarc().equals("")){
                        cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getMercanciasVO().getTransporteMaritimoVO().getNombreEmbarc());
                    }
                    cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getMercanciasVO().getTransporteMaritimoVO().getNacionalidadEmbarc());
                    cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getMercanciasVO().getTransporteMaritimoVO().getUnidadesDeArqBruto().toString());
                    cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getMercanciasVO().getTransporteMaritimoVO().getTipoCarga());
                    cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getMercanciasVO().getTransporteMaritimoVO().getNumCertITC());
                    if(cartaPorteVO.getMercanciasVO().getTransporteMaritimoVO().getEslora() != null && !cartaPorteVO.getMercanciasVO().getTransporteMaritimoVO().getEslora().equals("")){
                        cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getMercanciasVO().getTransporteMaritimoVO().getEslora().toString());
                    }
                    if(cartaPorteVO.getMercanciasVO().getTransporteMaritimoVO().getManga() != null && !cartaPorteVO.getMercanciasVO().getTransporteMaritimoVO().getManga().equals("")){
                        cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getMercanciasVO().getTransporteMaritimoVO().getManga().toString());
                    }
                    if(cartaPorteVO.getMercanciasVO().getTransporteMaritimoVO().getCalado() != null && !cartaPorteVO.getMercanciasVO().getTransporteMaritimoVO().getCalado().equals("")){
                        cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getMercanciasVO().getTransporteMaritimoVO().getCalado().toString());
                    }
                    if(cartaPorteVO.getMercanciasVO().getTransporteMaritimoVO().getLineaNaviera() != null && !cartaPorteVO.getMercanciasVO().getTransporteMaritimoVO().getLineaNaviera().equals("")){
                        cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getMercanciasVO().getTransporteMaritimoVO().getLineaNaviera());
                    }
                    cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getMercanciasVO().getTransporteMaritimoVO().getNombreAgenteNaviero());
                    cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getMercanciasVO().getTransporteMaritimoVO().getNumAutorizacionNaviero());
                    if(cartaPorteVO.getMercanciasVO().getTransporteMaritimoVO().getNumViaje() != null && !cartaPorteVO.getMercanciasVO().getTransporteMaritimoVO().getNumViaje().equals("")){
                        cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getMercanciasVO().getTransporteMaritimoVO().getNumViaje());
                    }
                    if(cartaPorteVO.getMercanciasVO().getTransporteMaritimoVO().getNumConocEmbarc() != null && !cartaPorteVO.getMercanciasVO().getTransporteMaritimoVO().getNumConocEmbarc().equals("")){
                        cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getMercanciasVO().getTransporteMaritimoVO().getNumConocEmbarc());
                    }
                    if(cartaPorteVO.getMercanciasVO().getTransporteMaritimoVO().getContenedorVO() != null){
                        cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getMercanciasVO().getTransporteMaritimoVO().getContenedorVO().getMatriculaContenedor());
                        cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getMercanciasVO().getTransporteMaritimoVO().getContenedorVO().getTipoContenedor());
                        if(cartaPorteVO.getMercanciasVO().getTransporteMaritimoVO().getContenedorVO().getNumPrecinto() != null && !cartaPorteVO.getMercanciasVO().getTransporteMaritimoVO().getContenedorVO().getNumPrecinto().equals("")){
                            cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getMercanciasVO().getTransporteMaritimoVO().getContenedorVO().getNumPrecinto());
                        }
                    }
                }
                if(cartaPorteVO.getMercanciasVO().getTransporteAereoVO() != null){
                    cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getMercanciasVO().getTransporteAereoVO().getPermSCT());
                    cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getMercanciasVO().getTransporteAereoVO().getNumPermisoSCT());
                    if(cartaPorteVO.getMercanciasVO().getTransporteAereoVO().getMatriculaAeronave() != null && !cartaPorteVO.getMercanciasVO().getTransporteAereoVO().getMatriculaAeronave().equals("")){
                        cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getMercanciasVO().getTransporteAereoVO().getMatriculaAeronave());
                    }
                    if(cartaPorteVO.getMercanciasVO().getTransporteAereoVO().getNombreAseg() != null && !cartaPorteVO.getMercanciasVO().getTransporteAereoVO().getNombreAseg().equals("")){
                        cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getMercanciasVO().getTransporteAereoVO().getNombreAseg());
                    }
                    if(cartaPorteVO.getMercanciasVO().getTransporteAereoVO().getNumPolizaSeguro() != null && !cartaPorteVO.getMercanciasVO().getTransporteAereoVO().getNumPolizaSeguro().equals("")){
                        cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getMercanciasVO().getTransporteAereoVO().getNumPolizaSeguro());
                    }
                    cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getMercanciasVO().getTransporteAereoVO().getNumeroGuia());
                    if(cartaPorteVO.getMercanciasVO().getTransporteAereoVO().getLugarContrato() != null && !cartaPorteVO.getMercanciasVO().getTransporteAereoVO().getLugarContrato().equals("")){
                        cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getMercanciasVO().getTransporteAereoVO().getLugarContrato());
                    }
                    cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getMercanciasVO().getTransporteAereoVO().getCodigoTransportista());
                    if(cartaPorteVO.getMercanciasVO().getTransporteAereoVO().getRfcEmbarcador() != null && !cartaPorteVO.getMercanciasVO().getTransporteAereoVO().getRfcEmbarcador().equals("")){
                        cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getMercanciasVO().getTransporteAereoVO().getRfcEmbarcador());
                    }
                    if(cartaPorteVO.getMercanciasVO().getTransporteAereoVO().getNumRegIdTribEmbarc() != null && !cartaPorteVO.getMercanciasVO().getTransporteAereoVO().getNumRegIdTribEmbarc().equals("")){
                        cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getMercanciasVO().getTransporteAereoVO().getNumRegIdTribEmbarc());
                    }
                    if(cartaPorteVO.getMercanciasVO().getTransporteAereoVO().getResidenciaFiscalEmbarc() != null && !cartaPorteVO.getMercanciasVO().getTransporteAereoVO().getResidenciaFiscalEmbarc().equals("")){
                        cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getMercanciasVO().getTransporteAereoVO().getResidenciaFiscalEmbarc());
                    }
                    if(cartaPorteVO.getMercanciasVO().getTransporteAereoVO().getNombreEmbarcador() != null && !cartaPorteVO.getMercanciasVO().getTransporteAereoVO().getNombreEmbarcador().equals("")){
                        cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getMercanciasVO().getTransporteAereoVO().getNombreEmbarcador());
                    }
                }
                if(cartaPorteVO.getMercanciasVO().getTransporteFerroviarioVO() != null){
                    cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getMercanciasVO().getTransporteFerroviarioVO().getTipoDeServicio());
                    cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getMercanciasVO().getTransporteFerroviarioVO().getTipoDeTrafico());
                    if(cartaPorteVO.getMercanciasVO().getTransporteFerroviarioVO().getNombreAseg() != null && !cartaPorteVO.getMercanciasVO().getTransporteFerroviarioVO().getNombreAseg().equals("")){
                        cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getMercanciasVO().getTransporteFerroviarioVO().getNombreAseg());
                    }
                    if(cartaPorteVO.getMercanciasVO().getTransporteFerroviarioVO().getNumPolizaSeguro() != null && !cartaPorteVO.getMercanciasVO().getTransporteFerroviarioVO().getNumPolizaSeguro().equals("")){
                        cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getMercanciasVO().getTransporteFerroviarioVO().getNumPolizaSeguro());
                    }
                    if(cartaPorteVO.getMercanciasVO().getTransporteFerroviarioVO().getDerechosDePasoVO() != null){
                        cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getMercanciasVO().getTransporteFerroviarioVO().getDerechosDePasoVO().getTipoDerechoDePaso());
                        cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getMercanciasVO().getTransporteFerroviarioVO().getDerechosDePasoVO().getKilometrajePagado().toString());
                    }
                    if(cartaPorteVO.getMercanciasVO().getTransporteFerroviarioVO().getCarroVO() != null){
                        cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getMercanciasVO().getTransporteFerroviarioVO().getCarroVO().getTipoCarro());
                        cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getMercanciasVO().getTransporteFerroviarioVO().getCarroVO().getMatriculaCarro());
                        cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getMercanciasVO().getTransporteFerroviarioVO().getCarroVO().getGuiaCarro());
                        cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getMercanciasVO().getTransporteFerroviarioVO().getCarroVO().getToneladasNetasCarro().toString());
                        if(cartaPorteVO.getMercanciasVO().getTransporteFerroviarioVO().getCarroVO().getContenedorVO() != null){
                            cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getMercanciasVO().getTransporteFerroviarioVO().getCarroVO().getContenedorVO().getTipoContenedor());
                            cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getMercanciasVO().getTransporteFerroviarioVO().getCarroVO().getContenedorVO().getPesoContenedorVacio().toString());
                            cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getMercanciasVO().getTransporteFerroviarioVO().getCarroVO().getContenedorVO().getPesoNetoMercancia().toString());
                        }
                    }
                }
            }
            if(cartaPorteVO.getFiguraTransporteVO() != null){
                if(cartaPorteVO.getFiguraTransporteVO().getTiposFiguraVO() != null && !cartaPorteVO.getFiguraTransporteVO().getTiposFiguraVO().equals("")){
                    cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getFiguraTransporteVO().getTiposFiguraVO().getTipoFigura());
                    if(cartaPorteVO.getFiguraTransporteVO().getTiposFiguraVO().getRfcFigura() != null && !cartaPorteVO.getFiguraTransporteVO().getTiposFiguraVO().getRfcFigura().equals("")){
                        cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getFiguraTransporteVO().getTiposFiguraVO().getRfcFigura());
                    }
                    if(cartaPorteVO.getFiguraTransporteVO().getTiposFiguraVO().getNumLicencia() != null && !cartaPorteVO.getFiguraTransporteVO().getTiposFiguraVO().getNumLicencia().equals("")){
                        cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getFiguraTransporteVO().getTiposFiguraVO().getNumLicencia());
                    }
                    if(cartaPorteVO.getFiguraTransporteVO().getTiposFiguraVO().getNombreFigura() != null && !cartaPorteVO.getFiguraTransporteVO().getTiposFiguraVO().getNombreFigura().equals("")){
                        cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getFiguraTransporteVO().getTiposFiguraVO().getNombreFigura());
                    }
                    if(cartaPorteVO.getFiguraTransporteVO().getTiposFiguraVO().getNumRegIdTribFigura() != null && !cartaPorteVO.getFiguraTransporteVO().getTiposFiguraVO().getNumRegIdTribFigura().equals("")){
                        cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getFiguraTransporteVO().getTiposFiguraVO().getNumRegIdTribFigura());
                    }
                    if(cartaPorteVO.getFiguraTransporteVO().getTiposFiguraVO().getResidenciaFiscalFigura() != null && !cartaPorteVO.getFiguraTransporteVO().getTiposFiguraVO().getResidenciaFiscalFigura().equals("")){
                        cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getFiguraTransporteVO().getTiposFiguraVO().getResidenciaFiscalFigura());
                    }
                    if(cartaPorteVO.getFiguraTransporteVO().getTiposFiguraVO().getPartesTransporteVO() != null){
                        //PartesTransporteVO ptsVO = null;
                        if(cartaPorteVO.getFiguraTransporteVO().getTiposFiguraVO().getPartesTransporteVO().getParteTransporteVO() != null){
                            //ArrayList<ParteTransporteVO> ptVO = complementoCartaPorteDao.consultaParteTransporte(fctClef);
                            for(int i=0; i<cartaPorteVO.getFiguraTransporteVO().getTiposFiguraVO().getPartesTransporteVO().getParteTransporteVO().size(); i++){
                                cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getFiguraTransporteVO().getTiposFiguraVO().getPartesTransporteVO().getParteTransporteVO().get(i).getParteTransporte());
                            }
                        }
                    }
                    if(cartaPorteVO.getFiguraTransporteVO().getTiposFiguraVO().getDomicilioVO() != null){
                        if(cartaPorteVO.getFiguraTransporteVO().getTiposFiguraVO().getDomicilioVO().getCalle() != null && !cartaPorteVO.getFiguraTransporteVO().getTiposFiguraVO().getDomicilioVO().getCalle().equals("")){
                            cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getFiguraTransporteVO().getTiposFiguraVO().getDomicilioVO().getCalle());
                        }
                        if(cartaPorteVO.getFiguraTransporteVO().getTiposFiguraVO().getDomicilioVO().getNumeroExterior() != null && !cartaPorteVO.getFiguraTransporteVO().getTiposFiguraVO().getDomicilioVO().getNumeroExterior().equals("")){
                            cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getFiguraTransporteVO().getTiposFiguraVO().getDomicilioVO().getNumeroExterior());
                        }
                        if(cartaPorteVO.getFiguraTransporteVO().getTiposFiguraVO().getDomicilioVO().getNumeroInterior() != null && !cartaPorteVO.getFiguraTransporteVO().getTiposFiguraVO().getDomicilioVO().getNumeroInterior().equals("")){
                            cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getFiguraTransporteVO().getTiposFiguraVO().getDomicilioVO().getNumeroInterior());
                        }
                        if(cartaPorteVO.getFiguraTransporteVO().getTiposFiguraVO().getDomicilioVO().getColonia() != null && !cartaPorteVO.getFiguraTransporteVO().getTiposFiguraVO().getDomicilioVO().getColonia().equals("")){
                            cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getFiguraTransporteVO().getTiposFiguraVO().getDomicilioVO().getColonia());
                        }
                        if(cartaPorteVO.getFiguraTransporteVO().getTiposFiguraVO().getDomicilioVO().getLocalidad() != null && !cartaPorteVO.getFiguraTransporteVO().getTiposFiguraVO().getDomicilioVO().getLocalidad().equals("")){
                            cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getFiguraTransporteVO().getTiposFiguraVO().getDomicilioVO().getLocalidad());
                        }
                        if(cartaPorteVO.getFiguraTransporteVO().getTiposFiguraVO().getDomicilioVO().getReferencia() != null && !cartaPorteVO.getFiguraTransporteVO().getTiposFiguraVO().getDomicilioVO().getReferencia().equals("")){
                            cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getFiguraTransporteVO().getTiposFiguraVO().getDomicilioVO().getReferencia());
                        }
                        if(cartaPorteVO.getFiguraTransporteVO().getTiposFiguraVO().getDomicilioVO().getMunicipio() != null && !cartaPorteVO.getFiguraTransporteVO().getTiposFiguraVO().getDomicilioVO().getMunicipio().equals("")){
                            cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getFiguraTransporteVO().getTiposFiguraVO().getDomicilioVO().getMunicipio());
                        }
                        cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getFiguraTransporteVO().getTiposFiguraVO().getDomicilioVO().getEstado());
                        cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getFiguraTransporteVO().getTiposFiguraVO().getDomicilioVO().getPais());
                        cadenaCCP = cadenaCCP + addCadena(cartaPorteVO.getFiguraTransporteVO().getTiposFiguraVO().getDomicilioVO().getCodigoPostal());
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Cadena " + cadenaCCP);
        return cadenaCCP;
    }

    static public void prueba(){
        int fctClef = 1;
        ComplementoCartaPorteDao complementoCartaPorteDao = new ComplementoCartaPorteDao();
        CartaPorteVO cartaPorteVO = complementoCartaPorteDao.consultaCartaPorte(fctClef);
        
        //System.out.println(ubVO.get(1).getDistanciaRecorrida());
        for(int i=0; i<cartaPorteVO.getUbicacionesVO().getUbicacionVO().size(); i++){
            System.out.println(cartaPorteVO.getUbicacionesVO().getUbicacionVO().get(i).getTipoUbicacion());
            System.out.println(cartaPorteVO.getUbicacionesVO().getUbicacionVO().get(i).getDomicilioVO().getEstado());
//            System.out.println(ubVO.get(i).getIdUbicacion());
//            if(ubVO.get(i).getRfcRemitenteDestinatario() != null && !ubVO.get(i).getRfcRemitenteDestinatario().equals("")){
//                System.out.println(ubVO.get(i).getRfcRemitenteDestinatario());
                  
//            }
//            System.out.println(ubVO.get(i).getNombreRemitenteDestinatario());
//            System.out.println(ubVO.get(i).getNumRegIdTrib());
//            System.out.println(ubVO.get(i).getResidenciaFiscal());
//            System.out.println(ubVO.get(i).getNumEstacion());
//            System.out.println(ubVO.get(i).getNombreEstacion());
//            System.out.println(ubVO.get(i).getNavegacionTrafico());
//            System.out.println(ubVO.get(i).getFechaHoraSalidaLlegada());
//            System.out.println(ubVO.get(i).getTipoEstacion());
//            System.out.println(ubVO.get(i).getDistanciaRecorrida());
        }
    }
    
}

