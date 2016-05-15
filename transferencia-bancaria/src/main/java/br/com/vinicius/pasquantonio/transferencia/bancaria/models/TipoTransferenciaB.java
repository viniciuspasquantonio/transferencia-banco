package br.com.vinicius.pasquantonio.transferencia.bancaria.models;

import org.joda.time.DateTime;

public class TipoTransferenciaB implements TipoTransferencia{

	@Override
	public double calculaTaxa(double valor, DateTime dataAgendamento) {
		
		Taxa taxaAte30Dias = new TaxaBAte30Dias();
		Taxa taxaBMaior30Dias = new TaxaBMaior30Dias();
		taxaAte30Dias.setProxima(taxaBMaior30Dias);
		taxaBMaior30Dias.setProxima(new SemTaxa());
		return taxaAte30Dias.calcula(valor,dataAgendamento);
	}

}
