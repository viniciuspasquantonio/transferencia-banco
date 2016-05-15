package br.com.vinicius.pasquantonio.transferencia.bancaria.models;

import org.joda.time.DateTime;

public interface Taxa {
	double calcula(double valor,DateTime dataAgendamento);
	void setProxima(Taxa proxima);
}
