package br.com.vinicius.pasquantonio.transferencia.bancaria.models;

import org.joda.time.DateTime;
import org.joda.time.Duration;

public class TaxaBAte30Dias implements TaxaB {

	private TaxaB proxima;
	@Override
	public double calcula(DateTime dataAgendamento) {
		DateTime dtHoje = new DateTime();         
        Duration dur = new Duration(dtHoje,dataAgendamento); 
        if(dur.getStandardDays() <= 30){
        	return 10;
        }
        return proxima.calcula(dataAgendamento);
        
	}

	@Override
	public void setProxima(TaxaB proxima) {
		this.proxima = proxima;
		
	}

}
