/*NESSA CLASSE SERA O CICLO PRINCIPAL DO JOGO QUE IRÁ FICAR ITERAGINDO COM O USUARIO every moment */
package com.unicamp.mc322.Estrutura;


import java.util.Scanner;

public class Game {
	private boolean exitSelected;
	
	Scanner read=new Scanner(System.in);
	Configuracao config=new Configuracao();
	CicloJogo ciclo=new CicloJogo();

	public void start() {
		exitSelected =false;
		System.out.println("Jogo Iniciado!\n");
		//
		
		while(!exitSelected) {
			drawBoard();
			updateBoard(readInput());
		}
		System.out.println("Jogo Terminado. Tchau!\n");
	}
	
	private void drawBoard() {
		System.out.println("Digite -end- para encerrar o jogo ou\n");
		System.out.println("Escolha o que deseja fazer:\n");
		verificaOndeEstaJogoPrinta();
	}
	
	private String readInput() {
		String aux=read.next();
		if(aux.equals("end")) {
			this.exitSelected=true;
		}
		return aux;
	}
	
	private void updateBoard(String input) {
		verificaOndeEstaJogoTrata(input);
	}
	
	private void verificaOndeEstaJogoPrinta() {
		if(config.estaAi()) {
			config.printaConfigMessages();
		}
		else {
			if(ciclo.getIniciou()==false) {
				ciclo.interpretaConfig(config);
				ciclo.inicia();
				ciclo.setInicio(true);
				System.out.println("Mapa criado\n");
				ciclo.printaCicloMessages();
			}
			else {
				ciclo.setEstaAqui(true);
				ciclo.printaCicloMessages();
			}
		}
	}
	
	private void verificaOndeEstaJogoTrata(String valor) {
		if(config.estaAi()) {
			config.trataInput(valor);
		}
		else {
			if(ciclo.getIniciou()==false) {
				ciclo.interpretaConfig(config);
				ciclo.inicia();
				ciclo.setInicio(true);
			}
			else {
				ciclo.setEstaAqui(true);
				ciclo.trataInput(valor);
			}
		}
	}
}
