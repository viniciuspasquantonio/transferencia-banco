package br.com.vinicius.pasquantonio.transferencia.bancaria.models;

import org.joda.time.DateTime;

public interface TipoTransferencia {
	public double calculaTaxa(double valor, DateTime dataAgendamento);
}
