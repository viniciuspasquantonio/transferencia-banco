package br.com.vinicius.pasquantonio.transferencia.bancaria.models;

import org.junit.Assert;
import org.junit.Test;

public class TipoTransferenciaATest {
	@Test
	public void calculaTaxaParaTransferenciaDe120(){
		TipoTransferenciaA tipoTransferenciaA = new TipoTransferenciaA();
		Assert.assertEquals(tipoTransferenciaA.calculaTaxa(120),5,6);
	}
}
