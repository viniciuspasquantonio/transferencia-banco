package br.com.vinicius.pasquantonio.transferencia.bancaria.models;

import org.joda.time.DateTime;

public class TipoTransferenciaC implements TipoTransferencia{

	@Override
	public double calculaTaxa(double valor, DateTime dataAgendamento) {
		
		Taxa taxaMaior30Dias = new TaxaCMaior30Dias();
		Taxa taxaAte30Dias = new TaxaCAte30Dias();
		taxaMaior30Dias.setProxima(taxaAte30Dias);
		taxaAte30Dias.setProxima(new SemTaxa());
		return taxaMaior30Dias.calcula(valor,dataAgendamento);
	}

}
