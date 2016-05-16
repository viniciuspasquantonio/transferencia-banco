package br.com.vinicius.pasquantonio.transferencia.bancaria.models;

import org.joda.time.DateTime;

public class TaxaDAte25Reais implements Taxa {
	private Taxa proxima;
	@Override
	public double calcula(double valor, DateTime dataAgendamento) {
		if(valor <= 25){
			TipoTransferenciaA tipoTransferenciaA = new TipoTransferenciaA();
			return tipoTransferenciaA.calculaTaxa(valor, dataAgendamento);
		}
		return proxima.calcula(valor, dataAgendamento);
	}

	@Override
	public void setProxima(Taxa proxima) {
		this.proxima = proxima;

	}

}
