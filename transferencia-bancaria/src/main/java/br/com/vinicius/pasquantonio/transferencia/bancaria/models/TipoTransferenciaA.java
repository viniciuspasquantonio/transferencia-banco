package br.com.vinicius.pasquantonio.transferencia.bancaria.models;

import org.joda.time.DateTime;

public class TipoTransferenciaA implements TipoTransferencia {

	public double calculaTaxa(double valor, DateTime dataAgendamento) {
		return (valor * 0.03) + 2;
	}


}
