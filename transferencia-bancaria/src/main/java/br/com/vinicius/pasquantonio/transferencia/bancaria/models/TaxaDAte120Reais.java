package br.com.vinicius.pasquantonio.transferencia.bancaria.models;

import org.joda.time.DateTime;

public class TaxaDAte120Reais implements Taxa {
	private Taxa proxima;
	@Override
	public double calcula(double valor, DateTime dataAgendamento) {
		if(valor <= 120){
			TipoTransferenciaB tipoTransferenciaB = new TipoTransferenciaB();
			return tipoTransferenciaB.calculaTaxa(valor, dataAgendamento);
		}
		return proxima.calcula(valor, dataAgendamento);
	}

	@Override
	public void setProxima(Taxa proxima) {
		this.proxima = proxima;

	}

}
