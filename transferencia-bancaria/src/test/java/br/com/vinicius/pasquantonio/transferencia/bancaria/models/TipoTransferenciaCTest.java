package br.com.vinicius.pasquantonio.transferencia.bancaria.models;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.junit.Assert;
import org.junit.Test;

public class TipoTransferenciaCTest {

	@Test
	public void calculaTaxaParaTransferenciaDe100ComAgendamentoMaior30Dias(){
		TipoTransferenciaC tipoTransferenciaC = new TipoTransferenciaC();
		Assert.assertEquals(tipoTransferenciaC.calculaTaxa(100,new DateTime().plusDays(31)),1.2,0);
		Assert.assertNotEquals(tipoTransferenciaC.calculaTaxa(100,new DateTime().plusDays(30)),1.2,0);
	}
	
	@Test
	public void calculaTaxaParaTransferenciaDe100ComAgendamentoAte30Dias(){
		TipoTransferenciaC tipoTransferenciaC = new TipoTransferenciaC();
		Assert.assertEquals(tipoTransferenciaC.calculaTaxa(100,new DateTime().plusDays(30)),2.1,0);
		Assert.assertNotEquals(tipoTransferenciaC.calculaTaxa(100,new DateTime().plusDays(31)),2.1,0);
	}
	
	@Test
	public void calculaTaxaParaTransferenciaDe100ComAgendamentoAte25Dias(){
		TipoTransferenciaC tipoTransferenciaC = new TipoTransferenciaC();
		Assert.assertEquals(4.3,tipoTransferenciaC.calculaTaxa(100,new DateTime().plusDays(25)),0);
		Assert.assertNotEquals(4.3,tipoTransferenciaC.calculaTaxa(100,new DateTime().plusDays(26)),0);
	}
	
	@Test
	public void calculaTaxaParaTransferenciaDe100ComAgendamentoAte20Dias(){
		TipoTransferenciaC tipoTransferenciaC = new TipoTransferenciaC();
		Assert.assertEquals(5.4,tipoTransferenciaC.calculaTaxa(100,new DateTime().plusDays(20)),0);
		Assert.assertNotEquals(5.4,tipoTransferenciaC.calculaTaxa(100,new DateTime().plusDays(21)),0);
	}
	
	@Test
	public void calculaTaxaParaTransferenciaDe100ComAgendamentoAte15Dias(){
		TipoTransferenciaC tipoTransferenciaC = new TipoTransferenciaC();
		Assert.assertEquals(6.7,tipoTransferenciaC.calculaTaxa(100,new DateTime().plusDays(15)),0);
		Assert.assertNotEquals(6.7,tipoTransferenciaC.calculaTaxa(100,new DateTime().plusDays(16)),0);
	}
	
	@Test
	public void calculaTaxaParaTransferenciaDe100ComAgendamentoAte10Dias(){
		TipoTransferenciaC tipoTransferenciaC = new TipoTransferenciaC();
		Assert.assertEquals(7.4,tipoTransferenciaC.calculaTaxa(100,new DateTime().plusDays(10)),0);
		Assert.assertNotEquals(7.4,tipoTransferenciaC.calculaTaxa(100,new DateTime().plusDays(11)),0);
	}
	
	
	
}
