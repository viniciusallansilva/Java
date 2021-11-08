package com.unicamp.mc322.ProjetoFinal;

import java.util.Scanner;

public class Game {
	private boolean exitSelected;
	
	Scanner read=new Scanner(System.in);
	
	public void start() {
		exitSelected =false;
		System.out.println("Game started!\n");
		
		while(!exitSelected) {
			drawBoard();
			readInput();
			updateBoard();
		}
		System.out.println("Game terminated. Bye!\n");
	}
	
	private void drawBoard() {
		System.out.println("What you want do?\n");
	}
	
	private void readInput() {
		String aux=read.next();
		if(aux.equals("end")) {
			this.exitSelected=true;
		}
	}
	
	private void updateBoard() {
	
	}
}
