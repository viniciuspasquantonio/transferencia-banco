package br.com.vinicius.pasquantonio.transferencia.bancaria.models;

import org.joda.time.DateTime;
import org.junit.Assert;
import org.junit.Test;

public class TipoTransferenciaBTest {

	@Test
	public void calculaTaxaParaTransferenciaDe120ComAgendamentoAte30Dias(){
		TipoTransferenciaB tipoTransferenciaB = new TipoTransferenciaB();
		Assert.assertEquals(tipoTransferenciaB.calculaTaxa(120,new DateTime()),10,0);
	}
	
	@Test
	public void calculaTaxaParaTransferenciaDe120ComAgendamentoMaior30Dias(){
		TipoTransferenciaB tipoTransferenciaB = new TipoTransferenciaB();
		Assert.assertEquals(tipoTransferenciaB.calculaTaxa(120,new DateTime().plusDays(31)),8,0);
	}
}
