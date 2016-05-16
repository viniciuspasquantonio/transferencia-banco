package br.com.vinicius.pasquantonio.transferencia.bancaria.models;

import org.joda.time.DateTime;

public class TipoTransferenciaC implements TipoTransferencia{

	@Override
	public double calculaTaxa(double valor, DateTime dataAgendamento) {
		
		Taxa taxaMaior30Dias = new TaxaCMaior30Dias();
		Taxa taxaAte30Dias = new TaxaCAte30Dias();
		TaxaCAte25Dias taxaCAte25Dias = new TaxaCAte25Dias();
		taxaCAte25Dias.setProxima(taxaAte30Dias);
		taxaAte30Dias.setProxima(taxaMaior30Dias);
		taxaMaior30Dias.setProxima(new SemTaxa());
		return taxaCAte25Dias.calcula(valor,dataAgendamento);
	}

}
