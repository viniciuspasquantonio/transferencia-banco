package br.com.vinicius.pasquantonio.transferencia.bancaria.models;

import java.util.Date;

public class TipoTransferenciaA implements TipoTransferencia {

	public double calculaTaxa(double valor, Date dataAgendamento) {
		return (valor * 0.03) + 2;
	}


}
