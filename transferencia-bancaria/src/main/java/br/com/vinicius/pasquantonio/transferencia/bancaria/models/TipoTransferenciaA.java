package br.com.vinicius.pasquantonio.transferencia.bancaria.models;

public class TipoTransferenciaA implements TipoTransferencia {

	public double calculaTaxa(double valor) {
		return (valor * 0.03) + 2;
	}


}
