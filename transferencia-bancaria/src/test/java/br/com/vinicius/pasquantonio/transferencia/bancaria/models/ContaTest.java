package br.com.vinicius.pasquantonio.transferencia.bancaria.models;

import org.junit.Assert;
import org.junit.Test;


public class ContaTest {
	@Test
	public void realizaTransferenciaTipoA(){
		Conta contaOrigem = new Conta("11111­1",500);
		Conta contaDestino = new Conta("22222­2",500);
		TipoTransferenciaA tipo = new TipoTransferenciaA();
		contaOrigem.transfere(120,contaDestino,tipo);
		Assert.assertEquals(contaOrigem.getSaldo(), 374,4);
		Assert.assertEquals(contaDestino.getSaldo(), 620,0);
	}
}
