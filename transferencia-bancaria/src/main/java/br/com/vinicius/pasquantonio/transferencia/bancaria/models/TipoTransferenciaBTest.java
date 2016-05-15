package br.com.vinicius.pasquantonio.transferencia.bancaria.models;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

public class TipoTransferenciaBTest {

	@Test
	public void calculaTaxaParaTransferenciaDe120ComAgendamentoAte30Dias(){
		TipoTransferenciaB tipoTransferenciaB = new TipoTransferenciaB();
		Assert.assertEquals(tipoTransferenciaB.calculaTaxa(120,new Date()),10,0);
	}
}
