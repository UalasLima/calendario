/**
 * Programa desenvolvido como atividade prática na disciplina Técnicas de Programação I ministrada pelo professor Bosco
 * DC UFC Fortaleza-CE BR
 * 12_03_2020
 * Ualas Lima Damacêno
 */

//Classe para teste da classe Data

package br.ufc.dc.tpi.calendario;

public class DataTeste {
	
	public DataTeste() {
		
	}
	
	public void testeProximaData() {
		Data data = new Data();
		data.proximaData();
		if(data.toString() .equals("11/3/2020")) {
			System.out.println("testeProximaData passou! " + data.toString());
		}
		else {
			System.out.println("testeProximaData falhou " + data.toString());
		}
	}
	
	public void testeToString() {
		Data data = new Data();
		if(data.toString().equals("10/3/2020")) {
			System.out.println("testeToString passou! " + data.toString());
		}
		else {
			System.out.println("testeToString falhou! " + data.toString());
		}
	}
}
