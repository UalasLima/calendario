package br.ufc.dc.tpi.calendario;

public class Data {
	private int dia;
	private int mes;
	private int ano;
	
	public Data() {
		dia = 10;
		mes = 03;
		ano = 2020;
	}
	
	public String toString() {
		return (dia + "/" + mes + "/" + ano);
	}
	
	public void proximaData( ) {
		dia++;
		checkDiaOverFlow();
	}
	
	private void checkDiaOverFlow() {
		if(dia > diasDoMes()) {
			dia = 1;
			mes = mes + 1;
			checkMesOverFlow();
		}
	}
		
	private void checkMesOverFlow( ) {
		if(mes > 12) {
			mes = 1;
			ano = ano + 1;
		}
	}
	
	private int diaDoMes() {
		int diasDoMes[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int result = diasDoMes[mes - 1];
		if(mes == 2 && isAnoBissexto()) {
			result = result + 1;
		}
		return result;
	}
	
	private boolean isAnoBissexto() {
		return(divide(4, ano) && !(divide(100, ano))
	}
}
