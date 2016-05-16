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
		TipoTransferenciaC tipoTransferenciaB = new TipoTransferenciaC();
		Assert.assertEquals(tipoTransferenciaB.calculaTaxa(100,new DateTime().plusDays(30)),2.1,0);
		Assert.assertNotEquals(tipoTransferenciaB.calculaTaxa(100,new DateTime().plusDays(31)),2.1,0);
	}
	
	
	
}
