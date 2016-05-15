package br.com.vinicius.pasquantonio.transferencia.bancaria.models;

import org.joda.time.DateTime;
import org.joda.time.Duration;

public class TipoTransferenciaB implements TipoTransferencia{

	@Override
	public double calculaTaxa(double valor, DateTime dataAgendamento) {
		
		DateTime dtToday = new DateTime(); //pega data e hora atual
        DateTime dtOther = new DateTime(dataAgendamento	); //exemplo
        Duration dur = new Duration(dtOther, dtToday); //pega a duração da diferença dos dois
        if(dur.getStandardDays() <= 30){
        	return 10;
        }
		return 8;
	}

}
