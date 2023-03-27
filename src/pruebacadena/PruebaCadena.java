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
        CartaPorteVO cpVO = complementoCartaPorteDao.consultaCartaPorte(fctClef);
        UbicacionesVO ubsVO = complementoCartaPorteDao.consultaUbicaciones(fctClef);
        ContenedorVO ctVO = complementoCartaPorteDao.consultaContenedor(fctClef);
        MercanciasVO mrsVO = complementoCartaPorteDao.consultaMercancias(fctClef);
        MercanciaVO mrVO = complementoCartaPorteDao.consultaMercancia(fctClef);
        GuiasIdentificacionVO giVO = complementoCartaPorteDao.consultaGuiasIdentificacion(fctClef);
        CantidadTransportaVO ctrVO = complementoCartaPorteDao.consultaCantidadTransporta(fctClef);
        DetalleMercanciaVO demVO = complementoCartaPorteDao.consultaDetalleMercancia(fctClef);
        IdentificacionVehicularVO ivVO = complementoCartaPorteDao.consultaIdentificacionVehicular(fctClef);
        SegurosVO sgVO = complementoCartaPorteDao.consultaSeguros(fctClef);
        RemolquesVO rmsVO = complementoCartaPorteDao.consultaRemolques(fctClef);
        TransporteMaritimoVO tmVO = complementoCartaPorteDao.consultaTransporteMaritimo(fctClef);
        TransporteAereoVO taVO = complementoCartaPorteDao.consultaTransporteAereo(fctClef);
        TransporteFerroviarioVO tfvVO = complementoCartaPorteDao.consultaTransporteFerroviario(fctClef);
        DerechosDePasoVO ddpVO = complementoCartaPorteDao.consultaDerechosDePaso(fctClef);
        CarroVO crVO = complementoCartaPorteDao.consultaCarro(fctClef);
        TiposFiguraVO tfVO = complementoCartaPorteDao.consultaTiposFigura(fctClef);
        DomicilioVO dmVO = complementoCartaPorteDao.consultaDomicilio(fctClef);
        AutotransporteVO autVO = complementoCartaPorteDao.consultaAutotransporte(fctClef);
                
        cadenaCCP = cadenaCCP + addCadena(cpVO.getVersion());
        cadenaCCP = cadenaCCP + addCadena(cpVO.getTranspInternac());
        if (cpVO.getEntradaSalidaMerc() != null && !cpVO.getEntradaSalidaMerc().equals("")){
            cadenaCCP = cadenaCCP + addCadena(cpVO.getEntradaSalidaMerc());
        }
        if (cpVO.getPaisOrigenDestino() != null && !cpVO.getPaisOrigenDestino().equals("")){
            cadenaCCP = cadenaCCP + addCadena(cpVO.getPaisOrigenDestino());
        }
        if (cpVO.getViaEntradaSalida() != null && !cpVO.getViaEntradaSalida().equals("")){
            cadenaCCP = cadenaCCP + addCadena(cpVO.getViaEntradaSalida());
        }
        if (cpVO.getTotalDistRec() != null && !cpVO.getTotalDistRec().equals("")){
            cadenaCCP = cadenaCCP + addCadena(cpVO.getTotalDistRec().toString());
        }
        //if (cpVO.getUbicacionesVO() != null && !cpVO.getUbicacionesVO().equals("")){
            //if(ubsVO.getUbicacionVO() != null && !ubsVO.getUbicacionVO().equals("")){
                ArrayList<UbicacionVO> ubVO = complementoCartaPorteDao.consultaUbicacion(fctClef);
                for(int i=0; i<ubVO.size(); i++){
                    cadenaCCP = cadenaCCP + addCadena(ubVO.get(i).getTipoUbicacion());
                    if(ubVO.get(i).getIdUbicacion() != null && !ubVO.get(i).getIdUbicacion().equals("")){
                        cadenaCCP = cadenaCCP + addCadena(ubVO.get(i).getIdUbicacion());
                    }
                    cadenaCCP = cadenaCCP + addCadena(ubVO.get(i).getRfcRemitenteDestinatario());
                    if(ubVO.get(i).getNombreRemitenteDestinatario() != null && !ubVO.get(i).getNombreRemitenteDestinatario().equals("")){
                        cadenaCCP = cadenaCCP + addCadena(ubVO.get(i).getNombreRemitenteDestinatario());
                    }
                    if(ubVO.get(i).getNumRegIdTrib() != null && !ubVO.get(i).getNumRegIdTrib().equals("")){
                        cadenaCCP = cadenaCCP + addCadena(ubVO.get(i).getNumRegIdTrib());
                    }
                    if(ubVO.get(i).getResidenciaFiscal() != null && !ubVO.get(i).getResidenciaFiscal().equals("")){
                        cadenaCCP = cadenaCCP + addCadena(ubVO.get(i).getResidenciaFiscal());
                    }
                    if(ubVO.get(i).getNumEstacion() != null && !ubVO.get(i).getNumEstacion().equals("")){
                        cadenaCCP = cadenaCCP + addCadena(ubVO.get(i).getNumEstacion());
                    }
                    if(ubVO.get(i).getNombreEstacion() != null && !ubVO.get(i).getNombreEstacion().equals("")){
                        cadenaCCP = cadenaCCP + addCadena(ubVO.get(i).getNombreEstacion());
                    }
                    if(ubVO.get(i).getNavegacionTrafico() != null && !ubVO.get(i).getNavegacionTrafico().equals("")){
                        cadenaCCP = cadenaCCP + addCadena(ubVO.get(i).getNavegacionTrafico());
                    }
                    cadenaCCP = cadenaCCP + addCadena(ubVO.get(i).getFechaHoraSalidaLlegada().toString());
                    if(ubVO.get(i).getTipoEstacion() != null && !ubVO.get(i).getTipoEstacion().equals("")){
                        cadenaCCP = cadenaCCP + addCadena(ubVO.get(i).getTipoEstacion());
                    }
                    if(ubVO.get(i).getDistanciaRecorrida() != null && !ubVO.get(i).getDistanciaRecorrida().equals("")){
                        cadenaCCP = cadenaCCP + addCadena(ubVO.get(i).getDistanciaRecorrida());
                    }
                }
//                cadenaCCP = cadenaCCP + addCadena(ubVO.get(0).toString());
//                if(ubVO.get(1).toString() != null && !ubVO.get(1).toString().equals("")){
//                    cadenaCCP = cadenaCCP + addCadena(ubVO.get(1).toString());
//                }
//                cadenaCCP = cadenaCCP + addCadena(ubVO.get(2).toString());
//                if(ubVO.get(3).toString() != null && !ubVO.get(3).toString().equals("")){
//                    cadenaCCP = cadenaCCP + addCadena(ubVO.get(3).toString());
//                }
//                if(ubVO.get(4).toString() != null && !ubVO.get(4).toString().equals("")){
//                    cadenaCCP = cadenaCCP + addCadena(ubVO.get(4).toString());
//                }
//                if(ubVO.get(5).toString() != null && !ubVO.get(5).toString().equals("")){
//                    cadenaCCP = cadenaCCP + addCadena(ubVO.get(5).toString());
//                }
//                if(ubVO.get(6).toString() != null && !ubVO.get(6).toString().equals("")){
//                    cadenaCCP = cadenaCCP + addCadena(ubVO.get(6).toString());
//                }
//                if(ubVO.get(7).toString() != null && !ubVO.get(7).toString().equals("")){
//                    cadenaCCP = cadenaCCP + addCadena(ubVO.get(7).toString());
//                }
//                if(ubVO.get(8).toString() != null && !ubVO.get(8).toString().equals("")){
//                    cadenaCCP = cadenaCCP + addCadena(ubVO.get(8).toString());
//                }
//                cadenaCCP = cadenaCCP + addCadena(ubVO.get(9).toString());
//                if(ubVO.get(10).toString() != null && !ubVO.get(10).toString().equals("")){
//                    cadenaCCP = cadenaCCP + addCadena(ubVO.get(3).toString());
//                }
//                if(ubVO.get(11).toString() != null && !ubVO.get(11).toString().equals("")){
//                    cadenaCCP = cadenaCCP + addCadena(ubVO.get(11).toString());
//                }
//                if(ubVO.get(12).toString() != null && !ubVO.get(12).toString().equals("")){
//                    if(dmVO.getCalle() != null && !dmVO.getCalle().equals("")){
//                        cadenaCCP = cadenaCCP + addCadena(dmVO.getCalle());
//                    }
//                    if(dmVO.getNumeroExterior() != null && !dmVO.getNumeroExterior().equals("")){
//                        cadenaCCP = cadenaCCP + addCadena(dmVO.getNumeroExterior());
//                    }
//                    if(dmVO.getNumeroInterior() != null && !dmVO.getNumeroInterior().equals("")){
//                        cadenaCCP = cadenaCCP + addCadena(dmVO.getNumeroInterior());
//                    }
//                    if(dmVO.getColonia() != null && !dmVO.getColonia().equals("")){
//                        cadenaCCP = cadenaCCP + addCadena(dmVO.getColonia());
//                    }
//                    if(dmVO.getLocalidad() != null && !dmVO.getLocalidad().equals("")){
//                        cadenaCCP = cadenaCCP + addCadena(dmVO.getLocalidad());
//                    }
//                    if(dmVO.getReferencia() != null && !dmVO.getReferencia().equals("")){
//                        cadenaCCP = cadenaCCP + addCadena(dmVO.getReferencia());
//                    }
//                    if(dmVO.getMunicipio() != null && !dmVO.getMunicipio().equals("")){
//                        cadenaCCP = cadenaCCP + addCadena(dmVO.getMunicipio());
//                    }
//                    cadenaCCP = cadenaCCP + addCadena(dmVO.getEstado());
//                    cadenaCCP = cadenaCCP + addCadena(dmVO.getPais());
//                    cadenaCCP = cadenaCCP + addCadena(dmVO.getCodigoPostal());
//                }
            //}
        //}
        //if(cpVO.getMercanciasVO() != null && !cpVO.getMercanciasVO().equals("")){
            
            cadenaCCP = cadenaCCP + addCadena(mrsVO.getPesoBrutoTotal().toString());
            cadenaCCP = cadenaCCP + addCadena(mrsVO.getUnidadPeso().toString());
            if(mrsVO.getPesoNetoTotal() != null && !mrsVO.getPesoNetoTotal().equals("")){
                cadenaCCP = cadenaCCP + addCadena(mrsVO.getPesoNetoTotal().toString());
            }
            cadenaCCP = cadenaCCP + addCadena(mrsVO.getNumTotalMercancias().toString());
            if(mrsVO.getCargoPorTasacion() != null && !mrsVO.getCargoPorTasacion().equals("")){
                cadenaCCP = cadenaCCP + addCadena(mrsVO.getCargoPorTasacion().toString());
            }
            if(mrsVO.getMercanciaVO() != null && !mrsVO.getMercanciaVO().equals("")){
                cadenaCCP = cadenaCCP + addCadena(mrVO.getBienesTransp());
                if(mrVO.getClaveSTCC() != null && !mrVO.getClaveSTCC().equals("")){
                    cadenaCCP = cadenaCCP + addCadena(mrVO.getClaveSTCC());                
                }
                cadenaCCP = cadenaCCP + addCadena(mrVO.getDescripcion());
                cadenaCCP = cadenaCCP + addCadena(mrVO.getCantidad().toString());
                cadenaCCP = cadenaCCP + addCadena(mrVO.getClaveUnidad());
                if(mrVO.getUnidad() != null && !mrVO.getUnidad().equals("")){
                    cadenaCCP = cadenaCCP + addCadena(mrVO.getUnidad());
                }
                if(mrVO.getDimensiones() != null && !mrVO.getDimensiones().equals("")){
                    cadenaCCP = cadenaCCP + addCadena(mrVO.getDimensiones());
                }
                if(mrVO.getMaterialPeligroso() != null && !mrVO.getMaterialPeligroso().equals("")){
                    cadenaCCP = cadenaCCP + addCadena(mrVO.getMaterialPeligroso());
                }
                if(mrVO.getCveMaterialPeligroso() != null && !mrVO.getCveMaterialPeligroso().equals("")){
                    cadenaCCP = cadenaCCP + addCadena(mrVO.getCveMaterialPeligroso());
                }
                if(mrVO.getEmbalaje() != null && !mrVO.getEmbalaje().equals("")){
                    cadenaCCP = cadenaCCP + addCadena(mrVO.getEmbalaje());
                }
                if(mrVO.getDescripEmbalaje() != null && !mrVO.getDescripEmbalaje().equals("")){
                    cadenaCCP = cadenaCCP + addCadena(mrVO.getDescripEmbalaje());
                }
                cadenaCCP = cadenaCCP + addCadena(mrVO.getPesoEnKg().toString());
                if(mrVO.getValorMercancia() != null && !mrVO.getValorMercancia().equals("")){
                    cadenaCCP = cadenaCCP + addCadena(mrVO.getValorMercancia().toString());
                }
                if(mrVO.getMoneda() != null && !mrVO.getMoneda().equals("")){
                    cadenaCCP = cadenaCCP + addCadena(mrVO.getMoneda());
                }
                if(mrVO.getFraccionArancelaria() != null && !mrVO.getFraccionArancelaria().equals("")){
                    cadenaCCP = cadenaCCP + addCadena(mrVO.getFraccionArancelaria());
                }
                if(mrVO.getUuidComercioExt() != null && !mrVO.getUuidComercioExt().equals("")){
                    cadenaCCP = cadenaCCP + addCadena(mrVO.getUuidComercioExt());
                }
                if(mrVO.getPedimentosVO() != null && !mrVO.getPedimentosVO().equals("")){
                    PedimentosVO pdsVO = complementoCartaPorteDao.consultaPedimentos(fctClef);
                    if(pdsVO.getPedimentoVO() != null && !pdsVO.getPedimentoVO().equals("")){
                        ArrayList<PedimentoVO> pdVO = complementoCartaPorteDao.consultaPedimento(fctClef);
                        if(pdVO.get(0).toString() != null && !pdVO.get(0).toString().equals("")){
                            cadenaCCP =  cadenaCCP + addCadena(pdVO.get(0).toString());
                        }
                    }
                }
                if(mrVO.getGuiasIdentificacionVO() != null && !mrVO.getGuiasIdentificacionVO().equals("")){
                    cadenaCCP = cadenaCCP + addCadena(giVO.getNumeroGuiaIdentificacion());
                    cadenaCCP = cadenaCCP + addCadena(giVO.getDescripGuiaIdentificacion());
                    cadenaCCP = cadenaCCP + addCadena(giVO.getPesoGuiaIdentificacion().toString());
                }
                if(mrVO.getCantidadTransportaVO() != null && !mrVO.getCantidadTransportaVO().equals("")){
                    cadenaCCP = cadenaCCP + addCadena(ctrVO.getCantidad().toString());
                    cadenaCCP = cadenaCCP + addCadena(ctrVO.getIdOrigen());
                    cadenaCCP = cadenaCCP + addCadena(ctrVO.getIdDestino());
                    if(ctrVO.getCvesTransporte() != null && !ctrVO.getCvesTransporte().equals("")){
                        cadenaCCP = cadenaCCP + addCadena(ctrVO.getCvesTransporte());
                    }
                }
                if(mrVO.getDetalleMercanciaVO() != null && !mrVO.getDetalleMercanciaVO().equals("")){
                    cadenaCCP = cadenaCCP + addCadena(demVO.getUnidadPesoMerc());
                    cadenaCCP = cadenaCCP + addCadena(demVO.getPesoBruto().toString());
                    cadenaCCP = cadenaCCP + addCadena(demVO.getPesoNeto().toString());
                    cadenaCCP = cadenaCCP + addCadena(demVO.getPesoTara().toString());
                    if(demVO.getNumPiezas() != null && !demVO.getNumPiezas().equals("")){
                        cadenaCCP = cadenaCCP + addCadena(demVO.getNumPiezas().toString());
                    }
                }
            }
            if(mrsVO.getAutotransporteVO() != null && !mrsVO.getAutotransporteVO().equals("")){
                cadenaCCP = cadenaCCP + addCadena(autVO.getPermSCT());
                cadenaCCP = cadenaCCP + addCadena(autVO.getNumPermisoSCT());
                if(autVO.getIdentificacionVehicularVO() != null && !autVO.getIdentificacionVehicularVO().equals("")){
                    cadenaCCP = cadenaCCP + addCadena(ivVO.getConfigVehicular());
                    cadenaCCP = cadenaCCP + addCadena(ivVO.getPlacaVM());
                    cadenaCCP = cadenaCCP + addCadena(ivVO.getAnioModeloVM().toString());
                }
                if(autVO.getSegurosVO() != null && !autVO.getSegurosVO().equals("")){
                    cadenaCCP = cadenaCCP + addCadena(sgVO.getAseguraRespCivil());
                    cadenaCCP = cadenaCCP + addCadena(sgVO.getPolizaRespCivil());
                    if(sgVO.getAseguraMedAmbiente() != null && !sgVO.getAseguraMedAmbiente().equals("")){
                        cadenaCCP = cadenaCCP + addCadena(sgVO.getAseguraMedAmbiente());
                    }
                    if(sgVO.getPolizaMedAmbiente() != null && !sgVO.getPolizaMedAmbiente().equals("")){
                        cadenaCCP = cadenaCCP + addCadena(sgVO.getPolizaMedAmbiente());
                    }
                    if(sgVO.getAseguraCarga() != null && !sgVO.getAseguraCarga().equals("")){
                        cadenaCCP = cadenaCCP + addCadena(sgVO.getAseguraCarga());
                    }
                    if(sgVO.getPolizaCarga() != null && !sgVO.getPolizaCarga().equals("")){
                        cadenaCCP = cadenaCCP + addCadena(sgVO.getPolizaCarga());
                    }
                    if(sgVO.getPrimaSeguro() != null && !sgVO.getPrimaSeguro().equals("")){
                        cadenaCCP = cadenaCCP + addCadena(sgVO.getPrimaSeguro().toString());
                    }
                }
                if(autVO.getRemolquesVO() != null && !autVO.getRemolquesVO().equals("")){
                    if(rmsVO.getRemolqueVO() != null && !rmsVO.getRemolqueVO().equals("")){
                        RemolqueVO rmVO = null;
                        cadenaCCP = cadenaCCP + addCadena(rmVO.getSubTipoRem());
                        cadenaCCP = cadenaCCP + addCadena(rmVO.getPlaca());
                    }
                }
            }
            if(mrsVO.getTransporteMaritimoVO() != null && !mrsVO.getTransporteMaritimoVO().equals("")){
                if(tmVO.getPermSCT() != null && !tmVO.getPermSCT().equals("")){
                    cadenaCCP = cadenaCCP + addCadena(tmVO.getPermSCT());
                }
                if(tmVO.getNumPermisoSCT() != null && !tmVO.getNumPermisoSCT().equals("")){
                    cadenaCCP = cadenaCCP + addCadena(tmVO.getNumPermisoSCT());
                }
                if(tmVO.getNombreAseg() != null && !tmVO.getNombreAseg().equals("")){
                    cadenaCCP = cadenaCCP + addCadena(tmVO.getNombreAseg());
                }
                if(tmVO.getNumPolizaSeguro() != null && !tmVO.getNumPolizaSeguro().equals("")){
                    cadenaCCP = cadenaCCP + addCadena(tmVO.getNumPolizaSeguro());
                }
                cadenaCCP = cadenaCCP + addCadena(tmVO.getTipoEmbarcacion());
                cadenaCCP = cadenaCCP + addCadena(tmVO.getMatricula());
                cadenaCCP = cadenaCCP + addCadena(tmVO.getNumeroOMI());
                if(tmVO.getAnioEmbarcacion() != null && !tmVO.getAnioEmbarcacion().equals("")){
                    cadenaCCP = cadenaCCP + addCadena(tmVO.getAnioEmbarcacion());
                }
                if(tmVO.getNombreEmbarc() != null && !tmVO.getNombreEmbarc().equals("")){
                    cadenaCCP = cadenaCCP + addCadena(tmVO.getNombreEmbarc());
                }
                cadenaCCP = cadenaCCP + addCadena(tmVO.getNacionalidadEmbarc());
                cadenaCCP = cadenaCCP + addCadena(tmVO.getUnidadesDeArqBruto().toString());
                cadenaCCP = cadenaCCP + addCadena(tmVO.getTipoCarga());
                cadenaCCP = cadenaCCP + addCadena(tmVO.getNumCertITC());
                if(tmVO.getEslora() != null && !tmVO.getEslora().equals("")){
                    cadenaCCP = cadenaCCP + addCadena(tmVO.getEslora().toString());
                }
                if(tmVO.getManga() != null && !tmVO.getManga().equals("")){
                    cadenaCCP = cadenaCCP + addCadena(tmVO.getManga().toString());
                }
                if(tmVO.getCalado() != null && !tmVO.getCalado().equals("")){
                    cadenaCCP = cadenaCCP + addCadena(tmVO.getCalado().toString());
                }
                if(tmVO.getLineaNaviera() != null && !tmVO.getLineaNaviera().equals("")){
                    cadenaCCP = cadenaCCP + addCadena(tmVO.getLineaNaviera());
                }
                cadenaCCP = cadenaCCP + addCadena(tmVO.getNombreAgenteNaviero());
                cadenaCCP = cadenaCCP + addCadena(tmVO.getNumAutorizacionNaviero());
                if(tmVO.getNumViaje() != null && !tmVO.getNumViaje().equals("")){
                    cadenaCCP = cadenaCCP + addCadena(tmVO.getNumViaje());
                }
                if(tmVO.getNumConocEmbarc() != null && !tmVO.getNumConocEmbarc().equals("")){
                    cadenaCCP = cadenaCCP + addCadena(tmVO.getNumConocEmbarc());
                }
                if(tmVO.getContenedorVO() != null && !tmVO.getContenedorVO().equals("")){
                    cadenaCCP = cadenaCCP + addCadena(ctVO.getMatriculaContenedor());
                    cadenaCCP = cadenaCCP + addCadena(ctVO.getTipoContenedor());
                    if(ctVO.getNumPrecinto() != null && !ctVO.getNumPrecinto().equals("")){
                        cadenaCCP = cadenaCCP + addCadena(ctVO.getNumPrecinto());
                    }
                }
            }
            if(mrsVO.getTransporteAereoVO() != null && !mrsVO.getAutotransporteVO().equals("")){
                cadenaCCP = cadenaCCP + addCadena(taVO.getPermSCT());
                cadenaCCP = cadenaCCP + addCadena(taVO.getNumPermisoSCT());
                if(taVO.getMatriculaAeronave() != null && !taVO.getMatriculaAeronave().equals("")){
                    cadenaCCP = cadenaCCP + addCadena(taVO.getMatriculaAeronave());
                }
                if(taVO.getNombreAseg() != null && !taVO.getNombreAseg().equals("")){
                    cadenaCCP = cadenaCCP + addCadena(taVO.getNombreAseg());
                }
                if(taVO.getNumPolizaSeguro() != null && !taVO.getNumPolizaSeguro().equals("")){
                    cadenaCCP = cadenaCCP + addCadena(taVO.getNumPolizaSeguro());
                }
                cadenaCCP = cadenaCCP + addCadena(taVO.getNumeroGuia());
                if(taVO.getLugarContrato() != null && !taVO.getLugarContrato().equals("")){
                    cadenaCCP = cadenaCCP + addCadena(taVO.getLugarContrato());
                }
                cadenaCCP = cadenaCCP + addCadena(taVO.getCodigoTransportista());
                if(taVO.getRfcEmbarcador() != null && !taVO.getRfcEmbarcador().equals("")){
                    cadenaCCP = cadenaCCP + addCadena(taVO.getRfcEmbarcador());
                }
                if(taVO.getNumRegIdTribEmbarc() != null && !taVO.getNumRegIdTribEmbarc().equals("")){
                    cadenaCCP = cadenaCCP + addCadena(taVO.getNumRegIdTribEmbarc());
                }
                if(taVO.getResidenciaFiscalEmbarc() != null && !taVO.getResidenciaFiscalEmbarc().equals("")){
                    cadenaCCP = cadenaCCP + addCadena(taVO.getResidenciaFiscalEmbarc());
                }
                if(taVO.getNombreEmbarcador() != null && !taVO.getNombreEmbarcador().equals("")){
                    cadenaCCP = cadenaCCP + addCadena(taVO.getNombreEmbarcador());
                }
            }
            if(mrsVO.getTransporteFerroviarioVO() != null && mrsVO.getTransporteFerroviarioVO().equals("")){
                cadenaCCP = cadenaCCP + addCadena(tfvVO.getTipoDeServicio());
                cadenaCCP = cadenaCCP + addCadena(tfvVO.getTipoDeTrafico());
                if(tfvVO.getNombreAseg() != null && !tfvVO.getNombreAseg().equals("")){
                    cadenaCCP = cadenaCCP + addCadena(tfvVO.getNombreAseg());
                }
                if(tfvVO.getNumPolizaSeguro() != null && !tfvVO.getNumPolizaSeguro().equals("")){
                    cadenaCCP = cadenaCCP + addCadena(tfvVO.getNumPolizaSeguro());
                }
                if(tfvVO.getDerechosDePasoVO() != null && !tfvVO.getDerechosDePasoVO().equals("")){
                    cadenaCCP = cadenaCCP + addCadena(ddpVO.getTipoDerechoDePaso());
                    cadenaCCP = cadenaCCP + addCadena(ddpVO.getKilometrajePagado().toString());
                }
                if(tfvVO.getCarroVO() != null && !tfvVO.getCarroVO().equals("")){
                    cadenaCCP = cadenaCCP + addCadena(crVO.getTipoCarro());
                    cadenaCCP = cadenaCCP + addCadena(crVO.getMatriculaCarro());
                    cadenaCCP = cadenaCCP + addCadena(crVO.getGuiaCarro());
                    cadenaCCP = cadenaCCP + addCadena(crVO.getToneladasNetasCarro().toString());
                    if(crVO.getContenedorVO() != null && !crVO.getContenedorVO().equals("")){
                        cadenaCCP = cadenaCCP + addCadena(ctVO.getTipoContenedor());
                        cadenaCCP = cadenaCCP + addCadena(ctVO.getPesoContenedorVacio().toString());
                        cadenaCCP = cadenaCCP + addCadena(ctVO.getPesoNetoMercancia().toString());
                    }
                }
            }
        //}
        if(cpVO.getFiguraTransporteVO() != null && !cpVO.getFiguraTransporteVO().equals("")){
            FiguraTransporteVO ftVO = null; 
            if(ftVO.getTiposFiguraVO() != null && !ftVO.getTiposFiguraVO().equals("")){
                cadenaCCP = cadenaCCP + addCadena(tfVO.getTipoFigura());
                if(tfVO.getRfcFigura() != null && !tfVO.getRfcFigura().equals("")){
                    cadenaCCP = cadenaCCP + addCadena(tfVO.getRfcFigura());
                }
                if(tfVO.getNumLicencia() != null && !tfVO.getNumLicencia().equals("")){
                    cadenaCCP = cadenaCCP + addCadena(tfVO.getNumLicencia());
                }
                if(tfVO.getNombreFigura() != null && !tfVO.getNombreFigura().equals("")){
                    cadenaCCP = cadenaCCP + addCadena(tfVO.getNombreFigura());
                }
                if(tfVO.getNumRegIdTribFigura() != null && !tfVO.getNumRegIdTribFigura().equals("")){
                    cadenaCCP = cadenaCCP + addCadena(tfVO.getNumRegIdTribFigura());
                }
                if(tfVO.getResidenciaFiscalFigura() != null && !tfVO.getResidenciaFiscalFigura().equals("")){
                    cadenaCCP = cadenaCCP + addCadena(tfVO.getResidenciaFiscalFigura());
                }
                if(tfVO.getPartesTransporteVO() != null && !tfVO.getPartesTransporteVO().equals("")){
                    PartesTransporteVO ptsVO = null;
                    if(ptsVO.getParteTransporteVO() != null && !ptsVO.getParteTransporteVO().equals("")){
                        ArrayList<ParteTransporteVO> ptVO = complementoCartaPorteDao.consultaParteTransporte(fctClef);
                        cadenaCCP = cadenaCCP + addCadena(ptVO.get(0).toString());
                    }
                }
                if(tfVO.getDomicilioVO() != null && !tfVO.getDomicilioVO().equals("")){
                    if(dmVO.getCalle() != null && !dmVO.getCalle().equals("")){
                        cadenaCCP = cadenaCCP + addCadena(dmVO.getCalle());
                    }
                    if(dmVO.getNumeroExterior() != null && !dmVO.getNumeroExterior().equals("")){
                        cadenaCCP = cadenaCCP + addCadena(dmVO.getNumeroExterior());
                    }
                    if(dmVO.getNumeroInterior() != null && !dmVO.getNumeroInterior().equals("")){
                        cadenaCCP = cadenaCCP + addCadena(dmVO.getNumeroInterior());
                    }
                    if(dmVO.getColonia() != null && !dmVO.getColonia().equals("")){
                        cadenaCCP = cadenaCCP + addCadena(dmVO.getColonia());
                    }
                    if(dmVO.getLocalidad() != null && !dmVO.getLocalidad().equals("")){
                        cadenaCCP = cadenaCCP + addCadena(dmVO.getLocalidad());
                    }
                    if(dmVO.getReferencia() != null && !dmVO.getReferencia().equals("")){
                        cadenaCCP = cadenaCCP + addCadena(dmVO.getReferencia());
                    }
                    if(dmVO.getMunicipio() != null && !dmVO.getMunicipio().equals("")){
                        cadenaCCP = cadenaCCP + addCadena(dmVO.getMunicipio());
                    }
                    cadenaCCP = cadenaCCP + addCadena(dmVO.getEstado());
                    cadenaCCP = cadenaCCP + addCadena(dmVO.getPais());
                    cadenaCCP = cadenaCCP + addCadena(dmVO.getCodigoPostal());
                }
            }
        }
        
        System.out.println("Cadena " + cadenaCCP);
        return cadenaCCP;
    }

    static public void prueba(){
        int fctClef = 1;
        ComplementoCartaPorteDao complementoCartaPorteDao = new ComplementoCartaPorteDao();
        ArrayList<UbicacionVO> ubVO = complementoCartaPorteDao.consultaUbicacion(fctClef);
        
        //System.out.println(ubVO.get(1).getDistanciaRecorrida());
        for(int i=0; i<ubVO.size(); i++){
            System.out.println(ubVO.get(i).getTipoUbicacion());
            System.out.println(ubVO.get(i).getIdUbicacion());
            if(ubVO.get(i).getRfcRemitenteDestinatario() != null && !ubVO.get(i).getRfcRemitenteDestinatario().equals("")){
                System.out.println(ubVO.get(i).getRfcRemitenteDestinatario());
            }
            System.out.println(ubVO.get(i).getNombreRemitenteDestinatario());
            System.out.println(ubVO.get(i).getNumRegIdTrib());
            System.out.println(ubVO.get(i).getResidenciaFiscal());
            System.out.println(ubVO.get(i).getNumEstacion());
            System.out.println(ubVO.get(i).getNombreEstacion());
            System.out.println(ubVO.get(i).getNavegacionTrafico());
            System.out.println(ubVO.get(i).getFechaHoraSalidaLlegada());
            System.out.println(ubVO.get(i).getTipoEstacion());
            System.out.println(ubVO.get(i).getDistanciaRecorrida());
        }
    }
    
}

