/*CLASSE ONDE GUARDARA A SEQUENCIA DO QUE FOI FEITO E DETERMINARA O ESTAGIO DO JOGO*/
package com.unicamp.mc322.Estrutura;

public class StageSequence implements IMessages{
	private boolean configMaked;
	private Configuracao config;
	private String message;
	
	public StageSequence() {
		this.config=new Configuracao();
	}
	
	public String atualiza() {
		if(this.configMaked=false) {
		}
	}
	
	@Override
	public String stageActual() {
		return this.message;
	}
	public void readString(String input) {
		
	}
}
