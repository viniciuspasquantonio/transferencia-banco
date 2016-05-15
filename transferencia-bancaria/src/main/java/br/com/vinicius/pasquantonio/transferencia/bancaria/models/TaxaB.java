package br.com.vinicius.pasquantonio.transferencia.bancaria.models;

import org.joda.time.DateTime;

public interface TaxaB {
	double calcula(DateTime dataAgendamento);
	void setProxima(TaxaB proxima);
}
