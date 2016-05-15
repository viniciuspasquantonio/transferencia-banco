package br.com.vinicius.pasquantonio.transferencia.bancaria.models;

import org.joda.time.DateTime;
import org.joda.time.Duration;

public class TipoTransferenciaB implements TipoTransferencia{

	@Override
	public double calculaTaxa(double valor, DateTime dataAgendamento) {
		
		DateTime dtHoje = new DateTime();         
        Duration dur = new Duration(dtHoje,dataAgendamento); 
        System.out.println(dur.getStandardDays());
        if(dur.getStandardDays() <= 30){
        	return 10;
        }
		return 8;
	}

}
