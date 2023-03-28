/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebacadena.dao;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
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
import pruebacadena.vo.ParteTransporteVO;
import pruebacadena.vo.PartesTransporteVO;
import pruebacadena.vo.PedimentoVO;
import pruebacadena.vo.PedimentosVO;
import pruebacadena.vo.RemolquesVO;
import pruebacadena.vo.RemolqueVO;
import pruebacadena.vo.SegurosVO;
import pruebacadena.vo.TiposFiguraVO;
import pruebacadena.vo.TransporteAereoVO;
import pruebacadena.vo.TransporteFerroviarioVO;
import pruebacadena.vo.TransporteMaritimoVO;
import pruebacadena.vo.UbicacionVO;
import pruebacadena.vo.UbicacionesVO;

/**
 *
 * @author usuario
 */
public class ComplementoCartaPorteDao {

    /**
     * Metodo que llena los atributos de CartaPorte
     * @param fctClef
     * @return cartaPorteVO
     */
    public CartaPorteVO consultaCartaPorte(int fctClef) {
        CartaPorteVO cartaPorteVO = new CartaPorteVO();
        
        try {
            cartaPorteVO.setVersion("2.0");
            cartaPorteVO.setTranspInternac("No");
            cartaPorteVO.setEntradaSalidaMerc("Entrada");
            cartaPorteVO.setPaisOrigenDestino("MEX");
            cartaPorteVO.setViaEntradaSalida("MEX");
            cartaPorteVO.setTotalDistRec(new BigDecimal(20.5));

            UbicacionesVO ubicacionesVO = this.consultaUbicaciones(fctClef);
            cartaPorteVO.setUbicacionesVO(ubicacionesVO);

            MercanciasVO mercanciasVO = this.consultaMercancias(fctClef);
            cartaPorteVO.setMercanciasVO(mercanciasVO);
            
            FiguraTransporteVO figuraTransporteVO = this.consultaFiguraTransporte(fctClef);
            cartaPorteVO.setFiguraTransporteVO(figuraTransporteVO);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cartaPorteVO;
    }

    /**
     * Metodo que llena las ubicaciones de Carta porte 
     * @param fctClef
     * @return UbicacionesVO
     */
    public UbicacionesVO consultaUbicaciones(int fctClef) {
        UbicacionesVO ubicacionesVO = new UbicacionesVO();
        ArrayList<UbicacionVO> ubicacionArray = null;

        try {
            if (fctClef > 0) {
                ubicacionArray = new ArrayList<UbicacionVO>();
                ubicacionArray = this.consultaUbicacion(fctClef);

                ubicacionesVO.setUbicacionVO(ubicacionArray);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return ubicacionesVO;
    }

    /**
     * Metodo que llena la Ubicacion de Carta Porte
     * @param fctClef
     * @return ubicacion
     */
    public ArrayList<UbicacionVO> consultaUbicacion(int fctClef) {
        ArrayList<UbicacionVO> ubicacion = new ArrayList<UbicacionVO>();
        DateTimeFormatter formato = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        LocalDateTime localDT = LocalDateTime.now();

        try {
            UbicacionVO ubicacionVOo = new UbicacionVO();
            ubicacionVOo.setTipoUbicacion("Origen");
            ubicacionVOo.setIdUbicacion("DE000456");
            ubicacionVOo.setRfcRemitenteDestinatario("JFIMA420127R44");
            ubicacionVOo.setNombreRemitenteDestinatario("Alejandro Filomeno Ruízo");
            ubicacionVOo.setNumRegIdTrib("121585958");
            ubicacionVOo.setResidenciaFiscal("USA");
            ubicacionVOo.setNumEstacion("PM002");
            ubicacionVOo.setNombreEstacion("La Mision");
            ubicacionVOo.setNavegacionTrafico("Cabotaje");
            ubicacionVOo.setFechaHoraSalidaLlegada(localDT.parse("2022-12-01T11:49:48", formato));
            ubicacionVOo.setTipoEstacion("01");
            ubicacionVOo.setDistanciaRecorrida("1319.20");
            DomicilioVO domicilioVO = this.consultaDomicilio(fctClef);
            ubicacionVOo.setDomicilioVO(domicilioVO);
            ubicacion.add(ubicacionVOo);

            UbicacionVO ubicacionVOd = new UbicacionVO();
            ubicacionVOd.setTipoUbicacion("Destino");
            ubicacionVOd.setIdUbicacion("FE001456");
            ubicacionVOd.setRfcRemitenteDestinatario("RUMA901023UM6");
            ubicacionVOd.setNombreRemitenteDestinatario("Roberto Cruz Ramirez");
            ubicacionVOd.setNumRegIdTrib("121585958");
            ubicacionVOd.setResidenciaFiscal("MEX");
            ubicacionVOd.setNumEstacion("PM006");
            ubicacionVOd.setNombreEstacion("Punta China");
            ubicacionVOd.setNavegacionTrafico("Cabotaje");
            ubicacionVOd.setFechaHoraSalidaLlegada(localDT.parse("2022-12-09T10:00:48", formato));
            ubicacionVOd.setTipoEstacion("03");
            ubicacionVOd.setDistanciaRecorrida("209.20");
            ubicacionVOo.setDomicilioVO(domicilioVO);
            ubicacion.add(ubicacionVOd);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ubicacion;
    }

    /**
     * Metodo que llena el Domicilio de Carta Porte
     * @param fctClef
     * @return domicilioVO
     */
    public DomicilioVO consultaDomicilio(int fctClef) {
        DomicilioVO domicilioVO = new DomicilioVO();

        try {
            domicilioVO.setCalle("Center Street");
            domicilioVO.setNumeroExterior("1303");
            domicilioVO.setNumeroInterior("89");
            domicilioVO.setColonia("0900");
            domicilioVO.setLocalidad("06");
            domicilioVO.setReferencia("20.655617, -105.240738");
            domicilioVO.setMunicipio("015");
            domicilioVO.setEstado("CMX");
            domicilioVO.setPais("MEX");
            domicilioVO.setCodigoPostal("06300");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return domicilioVO;
    }

    /**
     * Metodo que llena las Mercancias de Carta Porte
     * @param fctClef
     * @return mercanciasVO
     */
    public MercanciasVO consultaMercancias(int fctClef) {
        MercanciasVO mercanciasVO = new MercanciasVO();

        try {
            mercanciasVO.setPesoBrutoTotal(new BigDecimal(715.00));
            mercanciasVO.setUnidadPeso("KGM");
            mercanciasVO.setPesoNetoTotal(new BigDecimal(100.00));
            mercanciasVO.setNumTotalMercancias(2);
            mercanciasVO.setCargoPorTasacion(new BigDecimal(100.00));
            MercanciaVO mercanciaVO = this.consultaMercancia(fctClef);
            mercanciasVO.setMercanciaVO(mercanciaVO);
            AutotransporteVO autotransporteVO = this.consultaAutotransporte(fctClef);
            mercanciasVO.setAutotransporteVO(autotransporteVO);
            TransporteMaritimoVO transporteMaritimoVO = this.consultaTransporteMaritimo(fctClef);
            mercanciasVO.setTransporteMaritimoVO(transporteMaritimoVO);
            TransporteAereoVO transporteAereoVO = this.consultaTransporteAereo(fctClef);
            mercanciasVO.setTransporteAereoVO(transporteAereoVO);
            TransporteFerroviarioVO transporteFerroviarioVO = this.consultaTransporteFerroviario(fctClef); 
            mercanciasVO.setTransporteFerroviarioVO(transporteFerroviarioVO);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return mercanciasVO;
    }

    /**
     * Metodo que llena Mercancia de Carta Porte
     * @param fctClef
     * @return mercanciaVO
     */
    public MercanciaVO consultaMercancia(int fctClef) {
        MercanciaVO mercanciaVO = new MercanciaVO();

        try {
            mercanciaVO.setBienesTransp("24131510");
            mercanciaVO.setClaveSTCC("1234567");
            mercanciaVO.setDescripcion("Refrigeradores de mostrador");
            mercanciaVO.setCantidad(new BigDecimal(100.00));
            mercanciaVO.setClaveUnidad("H87");
            mercanciaVO.setUnidad("Pieza");
            mercanciaVO.setDimensiones("59/40/36plg");
            mercanciaVO.setMaterialPeligroso("Sí");
            mercanciaVO.setCveMaterialPeligroso("2857");
            mercanciaVO.setEmbalaje("4D");
            mercanciaVO.setDescripEmbalaje("Cajas de madera contrachapada.");
            mercanciaVO.setPesoEnKg(new BigDecimal(715.00));
            mercanciaVO.setValorMercancia(new BigDecimal(100.00));
            mercanciaVO.setMoneda("MXN");
            mercanciaVO.setFraccionArancelaria("01011001");
            mercanciaVO.setUuidComercioExt("6cf6f4ca-301a-4d09-9522-412cb8adad0d");
            PedimentosVO pedimentosVO = this.consultaPedimentos(fctClef);
            mercanciaVO.setPedimentosVO(pedimentosVO);
            GuiasIdentificacionVO guiasIdentificacionVO = this.consultaGuiasIdentificacion(fctClef);
            mercanciaVO.setGuiasIdentificacionVO(guiasIdentificacionVO);
            CantidadTransportaVO cantidadTransportaVO = this.consultaCantidadTransporta(fctClef);
            mercanciaVO.setCantidadTransportaVO(cantidadTransportaVO);
            DetalleMercanciaVO detalleMercanciaVO = this.consultaDetalleMercancia(fctClef);
            mercanciaVO.setDetalleMercanciaVO(detalleMercanciaVO);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mercanciaVO;
    }

    /**
     * Este metodo obtiene el ArrayList del metodo consultaPedimento
     * @param fctClef
     * @return pedimentosVO
     */
    public PedimentosVO consultaPedimentos(int fctClef) {
        PedimentosVO pedimentosVO = new PedimentosVO();
        ArrayList<PedimentoVO> pedimentoArray = null;
        
        try {
            if(fctClef > 0){
                pedimentoArray = new ArrayList<PedimentoVO>();
                pedimentoArray = this.consultaPedimento(fctClef);
                pedimentosVO.setPedimentoVO(pedimentoArray);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return pedimentosVO;
    }

    /**
     * Metodo que llena el Pedimento de Carta Porte
     * @param fctClef
     * @return pedimento
     */
    public ArrayList<PedimentoVO> consultaPedimento(int fctClef) {
        ArrayList<PedimentoVO> pedimento = new ArrayList<PedimentoVO>();

        try {
            PedimentoVO pedimentoVO1 = new PedimentoVO();
            pedimentoVO1.setPedimento("123456789012345");
            pedimento.add(pedimentoVO1);

            PedimentoVO pedimentoVO2 = new PedimentoVO();
            pedimentoVO2.setPedimento("987654321012345");
            pedimento.add(pedimentoVO2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pedimento;
    }

    /**
     * Metodo que llena GuiasIdentificacion de Carta Porte
     * @param fctClef
     * @return guiasIdentificacionVO
     */
    public GuiasIdentificacionVO consultaGuiasIdentificacion(int fctClef) {
        GuiasIdentificacionVO guiasIdentificacionVO = new GuiasIdentificacionVO();
        
        try {
            guiasIdentificacionVO.setNumeroGuiaIdentificacion("AFGF987654321");
            guiasIdentificacionVO.setDescripGuiaIdentificacion("ABCD123456789");
            guiasIdentificacionVO.setPesoGuiaIdentificacion(new BigDecimal(100.00));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return guiasIdentificacionVO;
    }

    /**
     * Metodo que llena CantidadTransporte de Carta Porte
     * @param fctClef
     * @return cantidadTransportaVO
     */
    public CantidadTransportaVO consultaCantidadTransporta(int fctClef) {
        CantidadTransportaVO cantidadTransportaVO = new CantidadTransportaVO();

        try {
            cantidadTransportaVO.setCantidad(new BigDecimal(100.00));
            cantidadTransportaVO.setIdOrigen("OR000687");
            cantidadTransportaVO.setIdDestino("DE000687");
            cantidadTransportaVO.setCvesTransporte("01");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cantidadTransportaVO;
    }

    /**
     * Metodo que llena DetalleMercancia de Carta Porte
     * @param fctClef
     * @return detalleMercanciaVO
     */
    public DetalleMercanciaVO consultaDetalleMercancia(int fctClef) {
        DetalleMercanciaVO detalleMercanciaVO = new DetalleMercanciaVO();
        try {
            detalleMercanciaVO.setUnidadPesoMerc("");
            detalleMercanciaVO.setPesoBruto(new BigDecimal(100.00));
            detalleMercanciaVO.setPesoNeto(new BigDecimal(100.00));
            detalleMercanciaVO.setPesoTara(new BigDecimal(100.00));
            detalleMercanciaVO.setNumPiezas(1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return detalleMercanciaVO;
    }

    /**
     * Metodo que llena AutoTransporte de Carta Porte
     * @param fctClef
     * @return autotransporteVO
     */
    public AutotransporteVO consultaAutotransporte(int fctClef) {
        AutotransporteVO autotransporteVO = new AutotransporteVO();

        try {
            autotransporteVO.setPermSCT("TPAF01");
            autotransporteVO.setNumPermisoSCT("0X2XTXZ0X5X0X3X2X1X0");
            IdentificacionVehicularVO identificacionVehicularVO = this.consultaIdentificacionVehicular(fctClef);
            autotransporteVO.setIdentificacionVehicularVO(identificacionVehicularVO);
            SegurosVO segurosVO = this.consultaSeguros(fctClef);
            autotransporteVO.setSegurosVO(segurosVO);
            RemolquesVO remolquesVO = this.consultaRemolques(fctClef);
            autotransporteVO.setRemolquesVO(remolquesVO);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return autotransporteVO;
    }

    /**
     * Metodo que consulta IdentificacionVehicular de Carta Porte
     * @param fctClef
     * @return identificacionVehicularVO
     */
    public IdentificacionVehicularVO consultaIdentificacionVehicular(int fctClef) {
        IdentificacionVehicularVO identificacionVehicularVO = new IdentificacionVehicularVO();

        try {
            identificacionVehicularVO.setConfigVehicular("C2R2");
            identificacionVehicularVO.setPlacaVM("501&&");
            identificacionVehicularVO.setAnioModeloVM(2010);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return identificacionVehicularVO;
    }

    /**
     * Metodo que llena Seguros de Carta Porte
     * @param ccpClef
     * @return segurosVO
     */
    public SegurosVO consultaSeguros(int fctClef) {
        SegurosVO segurosVO = new SegurosVO();

        try {
            segurosVO.setAseguraRespCivil("PFG& Seguros S.A. de C.V.");
            segurosVO.setPolizaRespCivil("154647");
            segurosVO.setAseguraMedAmbiente("Olimpo S.A. de C.V.");
            segurosVO.setPolizaMedAmbiente("987423");
            segurosVO.setAseguraCarga(" La VillaIOS S. A. de C.V.");
            segurosVO.setPolizaCarga("368549");
            segurosVO.setPrimaSeguro(new BigDecimal(100.00));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return segurosVO;
    }

    /**
     * Metodo que llena Remolques de Carta Porte
     * @param ccpClef
     * @return remolquesVO
     */
    public RemolquesVO consultaRemolques(int fctClef) {
        RemolquesVO remolquesVO = new RemolquesVO();
        ArrayList<RemolqueVO> remolqueArray = null;

        try {
            if(fctClef > 0){
                remolqueArray = new ArrayList<RemolqueVO>();
                remolqueArray = this.consultaRemolque(fctClef);
                remolquesVO.setRemolqueVO(remolqueArray);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return remolquesVO;
    }

    /**
     * Metodo que llena Remolque de Carta Porte
     * @param ccpClef
     * @return remolque
     */
    public ArrayList<RemolqueVO> consultaRemolque(int fctClef) {
        ArrayList<RemolqueVO> remolque = new ArrayList<RemolqueVO>();

        try {
            RemolqueVO remolqueVO = new RemolqueVO();
            remolqueVO.setSubTipoRem("CTR004");
            remolqueVO.setPlaca("501&&");
            remolque.add(remolqueVO);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return remolque;
    }

    /**
     * Metodo que llena TransporteMaritimo de Carta Porte
     * @param fctClef
     * @return transporteMaritimoVO
     */
    public TransporteMaritimoVO consultaTransporteMaritimo(int fctClef) {
        TransporteMaritimoVO transporteMaritimoVO = new TransporteMaritimoVO();

        try {
            transporteMaritimoVO.setPermSCT("TPTM01");
            transporteMaritimoVO.setNumPermisoSCT("0X2XTXZ0X5X0X3X2X1X0");
            transporteMaritimoVO.setNombreAseg("La VillaIOS S. A. de C. V.");
            transporteMaritimoVO.setNumPolizaSeguro("154647");
            transporteMaritimoVO.setTipoEmbarcacion("B07");
            transporteMaritimoVO.setMatricula("501&&81");
            transporteMaritimoVO.setNumeroOMI("IMO8607489");
            transporteMaritimoVO.setAnioEmbarcacion("2000");
            transporteMaritimoVO.setNombreEmbarc("Embarca Gump");
            transporteMaritimoVO.setNacionalidadEmbarc("MEX");
            transporteMaritimoVO.setUnidadesDeArqBruto(new BigDecimal("200.023"));
            transporteMaritimoVO.setTipoCarga("CGC");
            transporteMaritimoVO.setNumCertITC("4512&874");
            transporteMaritimoVO.setEslora(new BigDecimal("190.05"));
            transporteMaritimoVO.setManga(new BigDecimal("48.24"));
            transporteMaritimoVO.setCalado(new BigDecimal("15.66"));
            transporteMaritimoVO.setLineaNaviera("Transportadora Gump&");
            transporteMaritimoVO.setNombreAgenteNaviero("Agente$");
            transporteMaritimoVO.setNumAutorizacionNaviero("SCT418/014/2017");
            transporteMaritimoVO.setNumViaje("65248");
            transporteMaritimoVO.setNumConocEmbarc("84595");
            ContenedorVO contenedorVO = this.consultaContenedor(fctClef);
            transporteMaritimoVO.setContenedorVO(contenedorVO);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return transporteMaritimoVO;
    }

    /**
     * Metodo que llena Contenedor de Carta Porte
     * @param fctClef
     * @return contenedorVO
     */
    public ContenedorVO consultaContenedor(int fctClef) {
        ContenedorVO contenedorVO = new ContenedorVO();

        try {
            contenedorVO.setMatriculaContenedor("T&P&L&00000");
            contenedorVO.setTipoContenedor("CM006");
            contenedorVO.setNumPrecinto("5398745");

            contenedorVO.setPesoContenedorVacio(new BigDecimal("1123.000"));
            contenedorVO.setPesoNetoMercancia(new BigDecimal("100.000"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return contenedorVO;
    }

    /**
     * Metodo que llena TransporteAereo de Carta Porte
     * @param fctClef
     * @return transporteAereoVO
     */
    public TransporteAereoVO consultaTransporteAereo(int fctClef) {
        TransporteAereoVO transporteAereoVO = new TransporteAereoVO();
            
        try {
            transporteAereoVO.setPermSCT("TPTA01");
            transporteAereoVO.setNumPermisoSCT("0X2XTXZ0X5X0X3X2X1X0");
            transporteAereoVO.setMatriculaAeronave("1234567-MEX");
            transporteAereoVO.setNombreAseg("PFG& Seguros S.A. de C.V.");
            transporteAereoVO.setNumPolizaSeguro("154647");
            transporteAereoVO.setNumeroGuia("803117555500");
            transporteAereoVO.setLugarContrato("MEX");
            transporteAereoVO.setCodigoTransportista("CA149");
            transporteAereoVO.setRfcEmbarcador("FIMA420127R44");
            transporteAereoVO.setNumRegIdTribEmbarc("121585958");
            transporteAereoVO.setResidenciaFiscalEmbarc("USA");
            transporteAereoVO.setNombreEmbarcador("Rafaeli Camposorio Ruízo");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return transporteAereoVO;
    }

    /**
     * Metodo que llena TransporteFerroviario de Carta Porte
     * @param fctClef
     * @return transporteFerroviarioVO
     */
    public TransporteFerroviarioVO consultaTransporteFerroviario(int fctClef) {
        TransporteFerroviarioVO transporteFerroviarioVO = new TransporteFerroviarioVO();

        try {
            transporteFerroviarioVO.setTipoDeServicio("TS01");
            transporteFerroviarioVO.setTipoDeTrafico("TT02");
            transporteFerroviarioVO.setNombreAseg("La Villa Esp0 S A de C V");
            transporteFerroviarioVO.setNumPolizaSeguro("368549");
            DerechosDePasoVO derechosDePasoVO = this.consultaDerechosDePaso(fctClef);
            transporteFerroviarioVO.setDerechosDePasoVO(derechosDePasoVO);
            CarroVO carroVO = this.consultaCarro(fctClef);
            transporteFerroviarioVO.setCarroVO(carroVO);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return transporteFerroviarioVO;
    }

    /**
     * Metodo que llena DerechoDePaso de Carta Porte
     * @param fctClef
     * @return derechoDePasoVO
     */
    public DerechosDePasoVO consultaDerechosDePaso(int fctClef) {
        DerechosDePasoVO derechosDePasoVO = new DerechosDePasoVO();

        try {
            derechosDePasoVO.setTipoDerechoDePaso("CDP001");
            derechosDePasoVO.setKilometrajePagado(new BigDecimal("108.05"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return derechosDePasoVO;
    }

    /**
     * Metodo que llena Carro de Carta Porte
     * @param fctClef
     * @return carroVO
     */
    public CarroVO consultaCarro(int fctClef) {
        CarroVO carroVO = new CarroVO();

        try {
            carroVO.setTipoCarro("TC01");
            carroVO.setMatriculaCarro("501-&&-8");
            carroVO.setGuiaCarro("123456789012345");
            carroVO.setToneladasNetasCarro(new BigDecimal("4.023"));
            ContenedorVO contenedorVO = this.consultaContenedor(fctClef);
            carroVO.setContenedorVo(contenedorVO);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return carroVO;
    }
    
    /**
     * Metodo que llena FiguraTransporte de Carta Porte
     * @param fctClef
     * @return 
     */
    public FiguraTransporteVO consultaFiguraTransporte(int fctClef){
        FiguraTransporteVO figuraTransporteVO = new FiguraTransporteVO();
        
        try {
            TiposFiguraVO tiposFiguraVO = this.consultaTiposFigura(fctClef);
            figuraTransporteVO.setTiposFiguraVO(tiposFiguraVO);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return figuraTransporteVO;
    }
    
    /**
     * Metodo que llena TiposFigura de Carta Porte
     * @param fctClef
     * @return tiposFiguraVO
     */
    public TiposFiguraVO consultaTiposFigura(int fctClef) {
        TiposFiguraVO tiposFiguraVO = new TiposFiguraVO();
        
        try {
            tiposFiguraVO.setTipoFigura("04");
            tiposFiguraVO.setRfcFigura("PEAT9605152C1");
            tiposFiguraVO.setNumLicencia("123XX212");
            tiposFiguraVO.setNombreFigura("Andrey Pérez Tujano");
            tiposFiguraVO.setNumRegIdTribFigura("121585958");
            tiposFiguraVO.setResidenciaFiscalFigura("USA");
            PartesTransporteVO partesTransporteVO = this.consultaPartesTransporte(fctClef);
            tiposFiguraVO.setPartesTransporteVO(partesTransporteVO);
            DomicilioVO domicilioVO = this.consultaDomicilio(fctClef);
            tiposFiguraVO.setDomicilioVO(domicilioVO);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tiposFiguraVO;
    }

    /**
     * Metodo que llena ParteTransporte de Carta Porte
     * @param fctClef
     * @return parteTransporte
     */
    public PartesTransporteVO consultaPartesTransporte(int fctClef) {
        PartesTransporteVO partesTransporteVO = new PartesTransporteVO();
        ArrayList<ParteTransporteVO> parteTransporteArray = null;

        try {
            if(fctClef > 0){
                parteTransporteArray = new ArrayList<ParteTransporteVO>();
                parteTransporteArray = this.consultaParteTransporte(fctClef);
                partesTransporteVO.setParteTransporteVO(parteTransporteArray);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return partesTransporteVO;
    }
    
    /**
     * Metodo que llena ParteTransporte de Carta Porte
     * @param fctClef
     * @return parteTransporte
     */
    public ArrayList<ParteTransporteVO> consultaParteTransporte(int fctClef) {
        ArrayList<ParteTransporteVO> parteTransporte = new ArrayList<ParteTransporteVO>();

        try {
            ParteTransporteVO parteTransporteVO = new ParteTransporteVO();
            parteTransporteVO.setParteTransporte("PT09");
            parteTransporte.add(parteTransporteVO);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return parteTransporte;
    }

}
