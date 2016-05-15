package br.com.vinicius.pasquantonio.transferencia.bancaria.models;

import java.util.Date;

public class Conta {
	private String conta;
	private double saldo;
	public Conta(String conta,double saldo) {
		this.conta = conta;
		this.saldo = saldo;
	}
	public void transfere(double valor,Conta contaDestino,TipoTransferencia tipoTansferencia,Date dataAgendamento) {
		this.saldo -= valor + tipoTansferencia.calculaTaxa(valor,dataAgendamento);
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
