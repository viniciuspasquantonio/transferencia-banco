package br.com.vinicius.pasquantonio.transferencia.bancaria.models;

import org.joda.time.DateTime;

public class TipoTransferenciaC implements TipoTransferencia{

	@Override
	public double calculaTaxa(double valor, DateTime dataAgendamento) {
		
		Taxa taxaMaior30Dias = new TaxaCMaior30Dias();
		taxaMaior30Dias.setProxima(new SemTaxa());
		return taxaMaior30Dias.calcula(valor,dataAgendamento);
	}

}
