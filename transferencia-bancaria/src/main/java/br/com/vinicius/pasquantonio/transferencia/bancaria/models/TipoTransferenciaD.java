package br.com.vinicius.pasquantonio.transferencia.bancaria.models;

import org.joda.time.DateTime;

public class TipoTransferenciaD implements TipoTransferencia{

	@Override
	public double calculaTaxa(double valor, DateTime dataAgendamento) {
		
		Taxa taxaMaior120Reais= new TaxaDMaior120Reais();
		taxaMaior120Reais.setProxima(new SemTaxa());
		return taxaMaior120Reais.calcula(valor,dataAgendamento);
	}

}
