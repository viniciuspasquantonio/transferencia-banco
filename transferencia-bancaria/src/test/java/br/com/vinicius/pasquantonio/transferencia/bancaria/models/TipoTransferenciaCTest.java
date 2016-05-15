package br.com.vinicius.pasquantonio.transferencia.bancaria.models;

import org.joda.time.DateTime;
import org.junit.Assert;
import org.junit.Test;

public class TipoTransferenciaCTest {

	@Test
	public void calculaTaxaParaTransferenciaDe120ComAgendamentoMaior30Dias(){
		TipoTransferenciaC tipoTransferenciaB = new TipoTransferenciaC();
		Assert.assertEquals(tipoTransferenciaB.calculaTaxa(120,new DateTime().plusDays(31)),1,44);
	}
	
	
	
}
