package br.com.vinicius.pasquantonio.transferencia.bancaria.models;

import org.joda.time.DateTime;
import org.joda.time.Duration;

public class SemTaxaB implements TaxaB {

	@Override
	public double calcula(DateTime dataAgendamento) {
		return 0;
        
	}

	@Override
	public void setProxima(TaxaB proxima) {
//		sem taxa
		
	}

}
