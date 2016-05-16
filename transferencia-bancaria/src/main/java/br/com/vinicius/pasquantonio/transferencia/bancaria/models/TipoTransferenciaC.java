package br.com.vinicius.pasquantonio.transferencia.bancaria.models;

import org.joda.time.DateTime;

public class TipoTransferenciaC implements TipoTransferencia{

	@Override
	public double calculaTaxa(double valor, DateTime dataAgendamento) {
		
		Taxa taxaMaior30Dias = new TaxaCMaior30Dias();
		Taxa taxaAte30Dias = new TaxaCAte30Dias();
		Taxa taxaCAte25Dias = new TaxaCAte25Dias();
		Taxa taxaCAte20Dias = new TaxaCAte20Dias();
		Taxa taxaCAte15Dias = new TaxaCAte15Dias();
		Taxa taxaCAte10Dias = new TaxaCAte10Dias();
		Taxa taxaCAte5Dias = new TaxaCAte5Dias();
		taxaCAte5Dias.setProxima(taxaCAte10Dias);
		taxaCAte10Dias.setProxima(taxaCAte15Dias);
		taxaCAte15Dias.setProxima(taxaCAte20Dias);
		taxaCAte20Dias.setProxima(taxaCAte25Dias);
		taxaCAte25Dias.setProxima(taxaAte30Dias);
		taxaAte30Dias.setProxima(taxaMaior30Dias);
		taxaMaior30Dias.setProxima(new SemTaxa());
		return taxaCAte5Dias.calcula(valor,dataAgendamento);
	}

}
