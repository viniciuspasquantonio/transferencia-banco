package br.com.vinicius.pasquantonio.transferencia.bancaria.models;

import org.joda.time.DateTime;
import org.joda.time.Duration;

public class TaxaBMaior30Dias implements Taxa {

	private Taxa proxima;
	@Override
	public double calcula(DateTime dataAgendamento) {
		DateTime dtHoje = new DateTime();         
        Duration dur = new Duration(dtHoje,dataAgendamento); 
        if(dur.getStandardDays() > 30){
        	return 8;
        }
        return proxima.calcula(dataAgendamento);
        
	}

	@Override
	public void setProxima(Taxa proxima) {
		this.proxima = proxima;
		
	}

}
