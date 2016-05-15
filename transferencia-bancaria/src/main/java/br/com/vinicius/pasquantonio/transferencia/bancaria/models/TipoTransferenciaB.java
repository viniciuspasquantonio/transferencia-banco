package br.com.vinicius.pasquantonio.transferencia.bancaria.models;

import java.util.Date;

public class TipoTransferenciaB implements TipoTransferencia{

	@Override
	public double calculaTaxa(double valor, Date dataAgendamento) {
		
		return 10;
	}

}
