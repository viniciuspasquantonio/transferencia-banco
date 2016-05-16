package br.com.vinicius.pasquantonio.transferencia.bancaria.models;

import org.joda.time.DateTime;
import org.junit.Assert;
import org.junit.Test;


public class ContaTest {
	
	private static final double VALOR_MAIOR_120 = 120.001;
	private static final double VALOR_MENOR_IGUAL_120 = 120;

	@Test
	public void realizaTransferenciaTipoA(){
		Conta contaOrigem = new Conta("11111­1",500);
		Conta contaDestino = new Conta("22222­2",500);
		TipoTransferenciaA tipo = new TipoTransferenciaA();
		contaOrigem.transfere(120,contaDestino,tipo,new DateTime());
		Assert.assertEquals(contaOrigem.getSaldo(), 374.4,0);
		Assert.assertEquals(contaDestino.getSaldo(), 620,0);
	}
	
	@Test
	public void realizaTransferenciaTipoAComAgendamentoMaior30Dias(){
		Conta contaOrigem = new Conta("11111­1",500);
		Conta contaDestino = new Conta("22222­2",500);
		TipoTransferenciaA tipo = new TipoTransferenciaA();
		contaOrigem.transfere(100,contaDestino,tipo,new DateTime().plusDays(31));
		Assert.assertEquals(395,contaOrigem.getSaldo(), 0);
		Assert.assertEquals(600,contaDestino.getSaldo(), 0);
	}
	
	@Test
	public void realizaTransferenciaTipoBComAgendamentoAte30Dias(){
		Conta contaOrigem = new Conta("11111­1",500);
		Conta contaDestino = new Conta("22222­2",500);
		TipoTransferenciaB tipo = new TipoTransferenciaB();
		
		contaOrigem.transfere(120,contaDestino,tipo,new DateTime());
		Assert.assertEquals(contaOrigem.getSaldo(), 370,0);
		Assert.assertEquals(contaDestino.getSaldo(), 620,0);
	}
	
	@Test
	public void realizaTransferenciaTipoBComAgendamentoMaior30Dias(){
		Conta contaOrigem = new Conta("11111­1",500);
		Conta contaDestino = new Conta("22222­2",500);
		TipoTransferenciaB tipo = new TipoTransferenciaB();
		
		contaOrigem.transfere(100,contaDestino,tipo,new DateTime().plusDays(31));
		Assert.assertEquals(392,contaOrigem.getSaldo(),0);
		Assert.assertEquals(600,contaDestino.getSaldo(), 0);
	}
	
	@Test
	public void realizaTransferenciaTipoCComAgendamentoAte30Dias(){
		Conta contaOrigem = new Conta("11111­1",500);
		Conta contaDestino = new Conta("22222­2",500);
		TipoTransferenciaC tipo = new TipoTransferenciaC();
		
		contaOrigem.transfere(100,contaDestino,tipo,new DateTime().plusDays(26));
		Assert.assertEquals(397.9,contaOrigem.getSaldo(), 0);
		Assert.assertEquals(600,contaDestino.getSaldo(), 0);
	}
	
	@Test
	public void realizaTransferenciaTipoCComAgendamentoMaior30Dias(){
		Conta contaOrigem = new Conta("11111­1",500);
		Conta contaDestino = new Conta("22222­2",500);
		TipoTransferenciaC tipo = new TipoTransferenciaC();
		contaOrigem.transfere(100,contaDestino,tipo,new DateTime().plusDays(31));
		Assert.assertEquals(398.8,contaOrigem.getSaldo(), 0);
		Assert.assertEquals(600,contaDestino.getSaldo(), 0);
	}
	
	@Test
	public void realizaTransferenciaTipoCComAgendamentoAte25Dias(){
		Conta contaOrigem = new Conta("11111­1",500);
		Conta contaDestino = new Conta("22222­2",500);
		TipoTransferenciaC tipo = new TipoTransferenciaC();
		
		contaOrigem.transfere(100,contaDestino,tipo,new DateTime().plusDays(25));
		Assert.assertEquals(395.7,contaOrigem.getSaldo(), 0);
		Assert.assertEquals(600,contaDestino.getSaldo(), 0);
	}
	
	@Test
	public void realizaTransferenciaTipoCComAgendamentoAte20Dias(){
		Conta contaOrigem = new Conta("11111­1",500);
		Conta contaDestino = new Conta("22222­2",500);
		TipoTransferenciaC tipo = new TipoTransferenciaC();
		
		contaOrigem.transfere(100,contaDestino,tipo,new DateTime().plusDays(20));
		Assert.assertEquals(394.6,contaOrigem.getSaldo(), 0);
		Assert.assertEquals(600,contaDestino.getSaldo(), 0);
	}
	
	@Test
	public void realizaTransferenciaTipoCComAgendamentoAte15Dias(){
		Conta contaOrigem = new Conta("11111­1",500);
		Conta contaDestino = new Conta("22222­2",500);
		TipoTransferenciaC tipo = new TipoTransferenciaC();
		
		contaOrigem.transfere(100,contaDestino,tipo,new DateTime().plusDays(15));
		Assert.assertEquals(393.3,contaOrigem.getSaldo(), 0);
		Assert.assertEquals(600,contaDestino.getSaldo(), 0);
	}
	@Test
	public void realizaTransferenciaTipoCComAgendamentoAte10Dias(){
		Conta contaOrigem = new Conta("11111­1",500);
		Conta contaDestino = new Conta("22222­2",500);
		TipoTransferenciaC tipo = new TipoTransferenciaC();
		
		contaOrigem.transfere(100,contaDestino,tipo,new DateTime().plusDays(10));
		Assert.assertEquals(392.6,contaOrigem.getSaldo(), 0);
		Assert.assertEquals(600,contaDestino.getSaldo(), 0);
		
	}
	@Test
	public void realizaTransferenciaTipoCComAgendamentoAte5Dias(){
		Conta contaOrigem = new Conta("11111­1",500);
		Conta contaDestino = new Conta("22222­2",500);
		TipoTransferenciaC tipo = new TipoTransferenciaC();
		
		contaOrigem.transfere(100,contaDestino,tipo,new DateTime().plusDays(5));
		Assert.assertEquals(391.7,contaOrigem.getSaldo(), 0);
		Assert.assertEquals(600,contaDestino.getSaldo(), 0);
		
	}
	
	@Test
	public void realizaTransferenciaTipoDComValorMaior120EAgendamentoAte30Dias(){
		Conta contaOrigem = new Conta("11111­1",500);
		Conta contaDestino = new Conta("22222­2",500);
		TipoTransferenciaC tipo = new TipoTransferenciaC();
		
		contaOrigem.transfere(VALOR_MAIOR_120,contaDestino,tipo,new DateTime().plusDays(26));

		Conta outraContaOrigem = new Conta("11111­2",500);
		Conta outraContaDestino = new Conta("22222­3",500);
		TipoTransferenciaD tipoD = new TipoTransferenciaD();
		outraContaOrigem.transfere(VALOR_MAIOR_120,outraContaDestino,tipoD,new DateTime().plusDays(26));
		
		Assert.assertEquals(contaOrigem.getSaldo(),outraContaOrigem.getSaldo(), 0);
		Assert.assertEquals(contaDestino.getSaldo(),outraContaDestino.getSaldo(), 0);

	}
	
	@Test
	public void realizaTransferenciaTipoDComValorMaior120EAgendamentoMaior30Dias(){
		Conta contaOrigem = new Conta("11111­1",500);
		Conta contaDestino = new Conta("22222­2",500);
		TipoTransferenciaC tipo = new TipoTransferenciaC();
		contaOrigem.transfere(VALOR_MAIOR_120,contaDestino,tipo,new DateTime().plusDays(31));
		
		Conta outraContaOrigem = new Conta("11111­2",500);
		Conta outraContaDestino = new Conta("22222­3",500);
		TipoTransferenciaD tipoD = new TipoTransferenciaD();
		outraContaOrigem.transfere(VALOR_MAIOR_120,outraContaDestino,tipoD,new DateTime().plusDays(31));
		
		Assert.assertEquals(contaOrigem.getSaldo(),outraContaOrigem.getSaldo(), 0);
		Assert.assertEquals(contaDestino.getSaldo(),outraContaDestino.getSaldo(), 0);
	}
	
	@Test
	public void realizaTransferenciaTipoDComValorMaior120EAgendamentoAte25Dias(){
		Conta contaOrigem = new Conta("11111­1",500);
		Conta contaDestino = new Conta("22222­2",500);
		TipoTransferenciaC tipo = new TipoTransferenciaC();
		
		contaOrigem.transfere(VALOR_MAIOR_120,contaDestino,tipo,new DateTime().plusDays(25));
		
		Conta outraContaOrigem = new Conta("11111­2",500);
		Conta outraContaDestino = new Conta("22222­3",500);
		TipoTransferenciaD tipoD = new TipoTransferenciaD();
		outraContaOrigem.transfere(VALOR_MAIOR_120,outraContaDestino,tipoD,new DateTime().plusDays(25));
		
		Assert.assertEquals(contaOrigem.getSaldo(),outraContaOrigem.getSaldo(), 0);
		Assert.assertEquals(contaDestino.getSaldo(),outraContaDestino.getSaldo(), 0);
	}
	
	@Test
	public void realizaTransferenciaTipoDComValorMaior120EAgendamentoAte20Dias(){
		Conta contaOrigem = new Conta("11111­1",500);
		Conta contaDestino = new Conta("22222­2",500);
		TipoTransferenciaC tipo = new TipoTransferenciaC();
		
		contaOrigem.transfere(VALOR_MAIOR_120,contaDestino,tipo,new DateTime().plusDays(20));

		Conta outraContaOrigem = new Conta("11111­2",500);
		Conta outraContaDestino = new Conta("22222­3",500);
		TipoTransferenciaD tipoD = new TipoTransferenciaD();
		outraContaOrigem.transfere(VALOR_MAIOR_120,outraContaDestino,tipoD,new DateTime().plusDays(20));
		
		Assert.assertEquals(contaOrigem.getSaldo(),outraContaOrigem.getSaldo(), 0);
		Assert.assertEquals(contaDestino.getSaldo(),outraContaDestino.getSaldo(), 0);
	}
	
	@Test
	public void realizaTransferenciaTipoDComValorMaior120EAgendamentoAte15Dias(){
		Conta contaOrigem = new Conta("11111­1",500);
		Conta contaDestino = new Conta("22222­2",500);
		TipoTransferenciaC tipo = new TipoTransferenciaC();
		
		contaOrigem.transfere(VALOR_MAIOR_120,contaDestino,tipo,new DateTime().plusDays(15));

		Conta outraContaOrigem = new Conta("11111­2",500);
		Conta outraContaDestino = new Conta("22222­3",500);
		TipoTransferenciaD tipoD = new TipoTransferenciaD();
		outraContaOrigem.transfere(VALOR_MAIOR_120,outraContaDestino,tipoD,new DateTime().plusDays(15));
		
		Assert.assertEquals(contaOrigem.getSaldo(),outraContaOrigem.getSaldo(), 0);
		Assert.assertEquals(contaDestino.getSaldo(),outraContaDestino.getSaldo(), 0);
	}
	
	@Test
	public void realizaTransferenciaTipoDComValorMaior120EAgendamentoAte10Dias(){
		Conta contaOrigem = new Conta("11111­1",500);
		Conta contaDestino = new Conta("22222­2",500);
		TipoTransferenciaC tipo = new TipoTransferenciaC();
		
		contaOrigem.transfere(VALOR_MAIOR_120,contaDestino,tipo,new DateTime().plusDays(10));

		Conta outraContaOrigem = new Conta("11111­2",500);
		Conta outraContaDestino = new Conta("22222­3",500);
		TipoTransferenciaD tipoD = new TipoTransferenciaD();
		outraContaOrigem.transfere(VALOR_MAIOR_120,outraContaDestino,tipoD,new DateTime().plusDays(10));
		
		Assert.assertEquals(contaOrigem.getSaldo(),outraContaOrigem.getSaldo(), 0);
		Assert.assertEquals(contaDestino.getSaldo(),outraContaDestino.getSaldo(), 0);
		
	}
	@Test
	public void realizaTransferenciaTipoDComValorMaior120EAgendamentoAte5Dias(){
		Conta contaOrigem = new Conta("11111­1",500);
		Conta contaDestino = new Conta("22222­2",500);
		TipoTransferenciaC tipo = new TipoTransferenciaC();
		
		contaOrigem.transfere(VALOR_MAIOR_120,contaDestino,tipo,new DateTime().plusDays(5));

		Conta outraContaOrigem = new Conta("11111­2",500);
		Conta outraContaDestino = new Conta("22222­3",500);
		TipoTransferenciaD tipoD = new TipoTransferenciaD();
		outraContaOrigem.transfere(VALOR_MAIOR_120,outraContaDestino,tipoD,new DateTime().plusDays(5));
		
		Assert.assertEquals(contaOrigem.getSaldo(),outraContaOrigem.getSaldo(), 0);
		Assert.assertEquals(contaDestino.getSaldo(),outraContaDestino.getSaldo(), 0);
		
	}
	
	@Test
	public void realizaTransferenciaTipoDComValorAte120EAgendamentoAte30Dias(){
		Conta contaOrigem = new Conta("11111­1",500);
		Conta contaDestino = new Conta("22222­2",500);
		TipoTransferenciaB tipo = new TipoTransferenciaB();
		
		contaOrigem.transfere(VALOR_MENOR_IGUAL_120,contaDestino,tipo,new DateTime());

		Conta outraContaOrigem = new Conta("11111­2",500);
		Conta outraContaDestino = new Conta("22222­3",500);
		TipoTransferenciaD tipoD = new TipoTransferenciaD();
		outraContaOrigem.transfere(VALOR_MENOR_IGUAL_120,outraContaDestino,tipoD,new DateTime());
		
		Assert.assertEquals(contaOrigem.getSaldo(),outraContaOrigem.getSaldo(), 0);
		Assert.assertEquals(contaDestino.getSaldo(),outraContaDestino.getSaldo(), 0);
	}
	
	@Test
	public void realizaTransferenciaTipoDComValorAte120EAgendamentoMaior30Dias(){
		Conta contaOrigem = new Conta("11111­1",500);
		Conta contaDestino = new Conta("22222­2",500);
		TipoTransferenciaB tipo = new TipoTransferenciaB();
		
		contaOrigem.transfere(VALOR_MENOR_IGUAL_120,contaDestino,tipo,new DateTime().plusDays(31));

		Conta outraContaOrigem = new Conta("11111­2",500);
		Conta outraContaDestino = new Conta("22222­3",500);
		TipoTransferenciaD tipoD = new TipoTransferenciaD();
		outraContaOrigem.transfere(VALOR_MENOR_IGUAL_120,outraContaDestino,tipoD,new DateTime().plusDays(31));
		
		Assert.assertEquals(contaOrigem.getSaldo(),outraContaOrigem.getSaldo(), 0);
		Assert.assertEquals(contaDestino.getSaldo(),outraContaDestino.getSaldo(), 0);
	}
}
