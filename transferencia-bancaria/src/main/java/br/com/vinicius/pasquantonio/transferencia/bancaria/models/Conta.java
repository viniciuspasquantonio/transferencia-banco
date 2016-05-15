package br.com.vinicius.pasquantonio.transferencia.bancaria.models;

public class Conta {
	private String conta;
	private double saldo;
	public Conta(String conta,double saldo) {
		this.conta = conta;
		this.saldo = saldo;
	}
	public void transfere(double valor,Conta contaDestino,TipoTransferencia tipoTansferencia) {
		this.saldo -= valor + tipoTansferencia.calculaTaxa(valor);
		contaDestino.saldo += valor; 
	}
	
	public String getConta() {
		return conta;
	}
	public void setConta(String conta) {
		this.conta = conta;
	}
	public double getSaldo() {
		return saldo;
	}

}
