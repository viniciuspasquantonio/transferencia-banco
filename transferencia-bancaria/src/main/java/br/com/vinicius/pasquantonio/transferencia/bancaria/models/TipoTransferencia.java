package br.com.vinicius.pasquantonio.transferencia.bancaria.models;

import java.util.Date;

public interface TipoTransferencia {
	public double calculaTaxa(double valor, Date dataAgendamento);
}
