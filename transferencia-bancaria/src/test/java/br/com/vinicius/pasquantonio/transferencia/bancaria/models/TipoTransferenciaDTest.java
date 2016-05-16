package br.com.vinicius.pasquantonio.transferencia.bancaria.models;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.junit.Assert;
import org.junit.Test;

public class TipoTransferenciaDTest {

	private static final double VALOR_MENOR_IGUAL_120 = 120;
	private static final double VALOR_MAIOR_120 = 120.001;
	private TipoTransferenciaD tipoTransferenciaD = new TipoTransferenciaD();
	private TipoTransferenciaC tipoTransferenciaC = new TipoTransferenciaC();
	private TipoTransferenciaB tipoTransferenciaB = new TipoTransferenciaB();
	@Test
	public void calculaTaxaParaTransferenciaMaiorQue120ComAgendamentoMaior30Dias(){
		Assert.assertEquals(tipoTransferenciaC.calculaTaxa(VALOR_MAIOR_120,new DateTime().plusDays(31)),tipoTransferenciaD.calculaTaxa(VALOR_MAIOR_120, new DateTime().plusDays(31)),0);
	}
	
	@Test
	public void calculaTaxaParaTransferenciaMaiorQue120ComAgendamentoAte30Dias(){
		Assert.assertEquals(tipoTransferenciaC.calculaTaxa(VALOR_MAIOR_120,new DateTime().plusDays(30)),tipoTransferenciaD.calculaTaxa(VALOR_MAIOR_120,new DateTime().plusDays(30)),0);
	}
	
	@Test
	public void calculaTaxaParaTransferenciaMaiorQue120ComAgendamentoAte25Dias(){
		Assert.assertEquals(tipoTransferenciaC.calculaTaxa(VALOR_MAIOR_120,new DateTime().plusDays(25)),tipoTransferenciaD.calculaTaxa(VALOR_MAIOR_120,new DateTime().plusDays(25)),0);
	}
	
	@Test
	public void calculaTaxaParaTransferenciaMaiorQue120ComAgendamentoAte20Dias(){
		Assert.assertEquals(tipoTransferenciaC.calculaTaxa(VALOR_MAIOR_120,new DateTime().plusDays(20)),tipoTransferenciaD.calculaTaxa(VALOR_MAIOR_120,new DateTime().plusDays(20)),0);
	}
	
	@Test
	public void calculaTaxaParaTransferenciaMaiorQue120ComAgendamentoAte15Dias(){
		Assert.assertEquals(tipoTransferenciaC.calculaTaxa(VALOR_MAIOR_120,new DateTime().plusDays(15)),tipoTransferenciaC.calculaTaxa(VALOR_MAIOR_120,new DateTime().plusDays(15)),0);
	}
	
	@Test
	public void calculaTaxaParaTransferenciaMaiorQue120ComAgendamentoAte10Dias(){
		Assert.assertEquals(tipoTransferenciaC.calculaTaxa(VALOR_MAIOR_120,new DateTime().plusDays(10)),tipoTransferenciaC.calculaTaxa(VALOR_MAIOR_120,new DateTime().plusDays(10)),0);
	}
	
	@Test
	public void calculaTaxaParaTransferenciaMaiorQue120ComAgendamentoAte5Dias(){
		Assert.assertEquals(tipoTransferenciaC.calculaTaxa(VALOR_MAIOR_120,new DateTime()),tipoTransferenciaC.calculaTaxa(VALOR_MAIOR_120,new DateTime()),0);
		Assert.assertEquals(tipoTransferenciaC.calculaTaxa(VALOR_MAIOR_120,new DateTime().plusDays(5)),tipoTransferenciaC.calculaTaxa(VALOR_MAIOR_120,new DateTime().plusDays(5)),0);
	}
	
	@Test
	public void calculaTaxaParaTransferenciaDe120ComAgendamentoAte30Dias(){
		Assert.assertEquals(tipoTransferenciaB.calculaTaxa(VALOR_MENOR_IGUAL_120,new DateTime()),tipoTransferenciaD.calculaTaxa(120,new DateTime()),0);
		Assert.assertEquals(tipoTransferenciaB.calculaTaxa(VALOR_MENOR_IGUAL_120,new DateTime().plusDays(30)),tipoTransferenciaD.calculaTaxa(VALOR_MENOR_IGUAL_120,new DateTime().plusDays(30)),0);
	}
	
	@Test
	public void calculaTaxaParaTransferenciaDe120ComAgendamentoMaior30Dias(){
		Assert.assertEquals(tipoTransferenciaB.calculaTaxa(VALOR_MENOR_IGUAL_120,new DateTime().plusDays(31)),tipoTransferenciaD.calculaTaxa(VALOR_MENOR_IGUAL_120,new DateTime().plusDays(31)),0);
	}
	
	
}
