/*NESSA CLASSE SERA O CICLO PRINCIPAL DO JOGO QUE IRÁ FICAR ITERAGINDO COM O USUARIO every moment */
package com.unicamp.mc322.Estrutura;

import com.unicamp.mc322.Movimento.*;

import java.util.Scanner;

public class Game {
	private boolean exitSelected;
	
	Scanner read=new Scanner(System.in);
	StageSequence main=new StageSequence();
	
	public void start() {
		exitSelected =false;
		System.out.println("Game started!\n");
		
		main.atualiza();
		while(!exitSelected) {
			drawBoard();
			updateBoard(readInput());
		}
		System.out.println("Game terminated. Bye!\n");
	}
	
	private void drawBoard() {
		main.atualiza();
		System.out.println("What you want do?\n");
		//printInformationToPlayer();
	}
	
	private String readInput() {
		String aux=read.next();
		if(aux.equals("end")) {
			this.exitSelected=true;
		}
		return aux;
	}
	
	private void updateBoard(String input) {
		main.readString(input);
	}
}
