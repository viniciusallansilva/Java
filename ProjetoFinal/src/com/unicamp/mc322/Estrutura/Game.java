/*NESSA CLASSE SERA O CICLO PRINCIPAL DO JOGO QUE IRÁ FICAR ITERAGINDO COM O USUARIO every moment */
package com.unicamp.mc322.Estrutura;

import com.unicamp.mc322.Movimento.*;

import java.util.Scanner;

public class Game {
	private boolean exitSelected;
	
	Scanner read=new Scanner(System.in);
	Configuracao config=new Configuracao();
	Exploration explore=new Exploration();

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
		System.out.println("Escolha o que deseja fazer\n");
		verificaOndeEstaJogo();
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
	
	public void verificaOndeEstaJogo() {
		if(config.estaAi()) {
			config.printaConfigMessages();
		}
		else if(!config.estaAi() && !explore.exploreIniciada()) {
			explore.setExploreIniciada(true);
			explore.setEstaAi(true);
		}
		if(explore.estaAi()) {
			explore.printaExploreMessages();
		}
	}
	
	public void verificaOndeEstaJogoTrata(String valor) {
		if(config.estaAi()) {
			config.trataInput(valor);
		}
		if(explore.estaAi()) {
		}
	}
}
