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
import pruebacadena.vo.GuiasIdentificacionVO;
import pruebacadena.vo.IdentificacionVehicularVO;
import pruebacadena.vo.MercanciasVO;
import pruebacadena.vo.MercanciaVO;
import pruebacadena.vo.ParteTransporteVO;
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
     public CartaPorteVO consultaCartaPorte(int fctClef)
    {       
        CartaPorteVO cartaPorteVO = new CartaPorteVO();
        
        cartaPorteVO.setVersion("2.0");
        cartaPorteVO.setTranspInternac("No");
        cartaPorteVO.setEntradaSalidaMerc("Entrada");
        cartaPorteVO.setPaisOrigenDestino("MEX");
        cartaPorteVO.setViaEntradaSalida("MEX");
        cartaPorteVO.setTotalDistRec(new BigDecimal(20.5));

        return cartaPorteVO;
    }
    
    public UbicacionesVO consultaUbicaciones(int fctClef){
        UbicacionesVO ubicacionesVO = new UbicacionesVO();
                   
        ubicacionesVO.setUbicacionVO(new ArrayList<UbicacionVO>());
                
        return ubicacionesVO;
    }
    
    public ArrayList<UbicacionVO> consultaUbicacion(int fctClef){
        ArrayList<UbicacionVO> ubicacion = new ArrayList<UbicacionVO>();
        DateTimeFormatter formato = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        LocalDateTime localDT = LocalDateTime.now();
        
        UbicacionVO  ubicacionVOo = new UbicacionVO();
        ubicacionVOo.setTipoUbicacion("Origen");
        ubicacionVOo.setIdUbicacion("DE000456");
        ubicacionVOo.setRfcRemitenteDestinatario("JFIMA420127R44");
        ubicacionVOo.setNombreRemitenteDestinatario("Alejandro Filomeno Ruízo");
        ubicacionVOo.setNumRegIdTrib("121585958");
        ubicacionVOo.setResidenciaFiscal("USA");
        ubicacionVOo.setNumEstacion("PM002");
        ubicacionVOo.setNombreEstacion("La Mision");
        ubicacionVOo.setNavegacionTrafico("Cabotaje");
        ubicacionVOo.setFechaHoraSalidaLlegada(localDT.parse("2022-12-01T11:49:48",formato));
        ubicacionVOo.setTipoEstacion("01");
        ubicacionVOo.setDistanciaRecorrida("1319.20");
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
        ubicacionVOd.setFechaHoraSalidaLlegada(localDT.parse("2022-12-09T10:00:48",formato));
        ubicacionVOd.setTipoEstacion("03");
        ubicacionVOd.setDistanciaRecorrida("209.20");
        ubicacion.add(ubicacionVOd);
        
        return ubicacion;
    }
    
    public DomicilioVO consultaDomicilio(int fctClef){
        DomicilioVO domicilioVO = new DomicilioVO();
        
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
                
        return domicilioVO;
    }
    
    public MercanciasVO consultaMercancias(int fctClef){
        MercanciasVO mercanciasVO = new MercanciasVO();
        
        mercanciasVO.setPesoBrutoTotal(new BigDecimal(715.00));
        mercanciasVO.setUnidadPeso("KGM");
        mercanciasVO.setPesoNetoTotal(new BigDecimal(100.00));
        mercanciasVO.setNumTotalMercancias(2);
        mercanciasVO.setCargoPorTasacion(new BigDecimal(100.00));
//        mercanciasVO.setMercanciaVO();

        return mercanciasVO;
    }
    
    public MercanciaVO consultaMercancia(int fctClef){
        MercanciaVO mercanciaVO = new MercanciaVO();
        
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
        mercanciaVO.setUuidComercioExt("");
        
        return mercanciaVO;
    }
    
    public PedimentosVO consultaPedimentos(int fctClef){
        PedimentosVO pedimentosVO = new PedimentosVO();
        
        pedimentosVO.setPedimentoVO(new ArrayList<PedimentoVO>());
        
        return pedimentosVO;
    }
    
    public ArrayList<PedimentoVO> consultaPedimento(int fctClef){
        ArrayList<PedimentoVO> pedimento = new ArrayList<PedimentoVO>();
        
        PedimentoVO pedimentoVO = new PedimentoVO();
        pedimentoVO.setPedimento("123456789012345");
        pedimentoVO.setPedimento("987654321012345");
        pedimentoVO.setPedimento("123456789543210");
        pedimento.add(pedimentoVO);
        
        return pedimento;
    }
    
    public GuiasIdentificacionVO consultaGuiasIdentificacion(int fctClef){
        GuiasIdentificacionVO guiasIdentificacionVO = new GuiasIdentificacionVO();
        
        guiasIdentificacionVO.setNumeroGuiaIdentificacion("AFGF987654321");
        guiasIdentificacionVO.setDescripGuiaIdentificacion("ABCD123456789");
        guiasIdentificacionVO.setPesoGuiaIdentificacion(new BigDecimal(100.00));
        
        return guiasIdentificacionVO;
    }
    
    public CantidadTransportaVO consultaCantidadTransporta(int fctClef){
        CantidadTransportaVO cantidadTransportaVO = new CantidadTransportaVO();
        
        cantidadTransportaVO.setCantidad(new BigDecimal(100.00));
        cantidadTransportaVO.setIdOrigen("OR000687");
        cantidadTransportaVO.setIdDestino("DE000687");
        cantidadTransportaVO.setCvesTransporte("01");
        
        return cantidadTransportaVO;
    }
    
    public DetalleMercanciaVO consultaDetalleMercancia(int fctClef){
        DetalleMercanciaVO detalleMercanciaVO = new DetalleMercanciaVO();
        
        detalleMercanciaVO.setUnidadPesoMerc("");
        detalleMercanciaVO.setPesoBruto(new BigDecimal(100.00));
        detalleMercanciaVO.setPesoNeto(new BigDecimal(100.00));
        detalleMercanciaVO.setPesoTara(new BigDecimal(100.00));
        detalleMercanciaVO.setNumPiezas(1);
        
        return detalleMercanciaVO;
    } 
    
    public AutotransporteVO consultaAutotransporte(int fctClef){
        AutotransporteVO autotransporteVO = new AutotransporteVO();
        
        autotransporteVO.setPermSCT("TPAF01");
        autotransporteVO.setNumPermisoSCT("0X2XTXZ0X5X0X3X2X1X0");
        
        return autotransporteVO;
    }
    
    public IdentificacionVehicularVO consultaIdentificacionVehicular(int fctClef){
        IdentificacionVehicularVO identificacionVehicularVO = new IdentificacionVehicularVO();
        
        identificacionVehicularVO.setConfigVehicular("C2R2");
        identificacionVehicularVO.setPlacaVM("501&&");
        identificacionVehicularVO.setAnioModeloVM(2010);
        
        return identificacionVehicularVO;        
    }
    /**
     * 
     * @param ccpClef
     * @return 
     */
    public SegurosVO consultaSeguros(int fctClef){
        SegurosVO segurosVO = new SegurosVO();
        
        segurosVO.setAseguraRespCivil("PFG& Seguros S.A. de C.V.");
        segurosVO.setPolizaRespCivil("154647");
        segurosVO.setAseguraMedAmbiente("Olimpo S.A. de C.V.");
        segurosVO.setPolizaMedAmbiente("987423");
        segurosVO.setAseguraCarga(" La VillaIOS S. A. de C.V.");
        segurosVO.setPolizaCarga("368549");
        segurosVO.setPrimaSeguro(new BigDecimal(100.00));
        
        return segurosVO;
    }
    /**
     * 
     * @param ccpClef
     * @return 
     */
    public RemolquesVO consultaRemolques(int fctClef){
        RemolquesVO remolquesVO = new RemolquesVO();
        
        //RemolquesVO remolquesVO = new RemolquesVO();
        remolquesVO.setRemolqueVO(new ArrayList<>());
        //remolques.add(remolquesVO);
        
        return remolquesVO;
    }
    /**
     * 
     * @param ccpClef
     * @return 
     */
    public ArrayList<RemolqueVO> consultaRemolque(int fctClef){
        ArrayList<RemolqueVO> remolque = new ArrayList<RemolqueVO>();
        
        RemolqueVO remolqueVO = new RemolqueVO();
        remolqueVO.setSubTipoRem("CTR004");
        remolqueVO.setPlaca("501&&");
        remolque.add(remolqueVO);
        
        return remolque;
    }

    public static TransporteMaritimoVO consultaTransporteMaritimo(int fctClef)
    {
        TransporteMaritimoVO transporteMaritimoVO = new TransporteMaritimoVO();
        
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
        
        return transporteMaritimoVO;
    }
    /**
     * 
     * @param fctClef
     * @return 
     */
    public static ContenedorVO consultaContenedor(int fctClef)
    {
        ContenedorVO contenedorVO = new ContenedorVO();
        
        contenedorVO.setMatriculaContenedor("T&P&L&00000");
        contenedorVO.setTipoContenedor("CM006");
        contenedorVO.setNumPrecinto("5398745");
        
        //contenedorVO.setTipoContenedor("TC01");
        contenedorVO.setPesoContenedorVacio(new BigDecimal("1123.000"));
        contenedorVO.setPesoNetoMercancia(new BigDecimal("100.000"));
        
        return contenedorVO;
    }
    
    public static TransporteAereoVO consultaTransporteAereo(int fctClef)
    {
        TransporteAereoVO transporteAereoVO = new TransporteAereoVO();
        
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
        
        return transporteAereoVO;
    }
    
    public static TransporteFerroviarioVO consultaTransporteFerroviario(int fctClef)
    {
        TransporteFerroviarioVO transporteFerroviarioVO = new TransporteFerroviarioVO();
        
        transporteFerroviarioVO.setTipoDeServicio("TS01");
        transporteFerroviarioVO.setTipoDeTrafico("TT02");
        transporteFerroviarioVO.setNombreAseg("La Villa Esp0 S A de C V");
        transporteFerroviarioVO.setNumPolizaSeguro("368549");
        
        return transporteFerroviarioVO;
    }
    
    public static DerechosDePasoVO consultaDerechosDePaso(int fctClef)
    {
        DerechosDePasoVO derechosDePasoVO = new DerechosDePasoVO();
        
        derechosDePasoVO.setTipoDerechoDePaso("CDP001");
        derechosDePasoVO.setKilometrajePagado(new BigDecimal("108.05"));
        
        return derechosDePasoVO;
    }
    
    public static CarroVO consultaCarro(int fctClef)
    {
        CarroVO carroVO = new CarroVO();
        
        carroVO.setTipoCarro("TC01");
        carroVO.setMatriculaCarro("501-&&-8");
        carroVO.setGuiaCarro("123456789012345");
        carroVO.setToneladasNetasCarro(new BigDecimal("4.023"));
        
        return carroVO;
    }
    
    public static TiposFiguraVO consultaTiposFigura(int fctClef)
    {
        TiposFiguraVO tiposFiguraVO = new TiposFiguraVO();
        
        tiposFiguraVO.setTipoFigura("04");
        tiposFiguraVO.setRfcFigura("PEAT9605152C1");
        tiposFiguraVO.setNumLicencia("123XX212");
        tiposFiguraVO.setNombreFigura("Andrey Pérez Tujano");
        tiposFiguraVO.setNumRegIdTribFigura("121585958");
        tiposFiguraVO.setResidenciaFiscalFigura("USA");
        
        return tiposFiguraVO;
    }    
    
    public static ArrayList<ParteTransporteVO> consultaParteTransporte(int fctClef)
    {
        ArrayList<ParteTransporteVO> parteTransporte = new ArrayList<ParteTransporteVO>();
        
        ParteTransporteVO parteTransporteVO = new ParteTransporteVO();
        parteTransporteVO.setParteTransporte("PT09");
        parteTransporteVO.setParteTransporte("PT01");
        parteTransporte.add(parteTransporteVO);
        
        return parteTransporte;    
    }
    
}

