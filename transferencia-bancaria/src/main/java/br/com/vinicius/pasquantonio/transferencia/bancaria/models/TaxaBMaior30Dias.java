package br.com.vinicius.pasquantonio.transferencia.bancaria.models;

import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.Duration;
import org.joda.time.LocalDate;

public class TaxaBMaior30Dias implements Taxa {

	private Taxa proxima;
	@Override
	public double calcula(double valor,DateTime dataAgendamento) {
		DateTime dtHoje = new DateTime();
        if(Days.daysBetween(dtHoje.toLocalDate(), dataAgendamento.toLocalDate()).getDays() > 30){
        	return 8;
        }
        return proxima.calcula(valor,dataAgendamento);
        
	}

	@Override
	public void setProxima(Taxa proxima) {
		this.proxima = proxima;
		
	}

}
