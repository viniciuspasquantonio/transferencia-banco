package br.com.vinicius.pasquantonio.transferencia.bancaria.models;

import org.joda.time.DateTime;
import org.joda.time.Days;

public class TaxaCMaior30Dias implements Taxa {

	private Taxa proxima;
	@Override
	public double calcula(double valor,DateTime dataAgendamento) {
		DateTime dtHoje = new DateTime();         
        if(Days.daysBetween(dtHoje.toLocalDate(), dataAgendamento.toLocalDate()).getDays() > 30){
        	return valor*0.012;
        }
        return proxima.calcula(valor,dataAgendamento);
	}

	@Override
	public void setProxima(Taxa proxima) {
		this.proxima = proxima;

	}

}
