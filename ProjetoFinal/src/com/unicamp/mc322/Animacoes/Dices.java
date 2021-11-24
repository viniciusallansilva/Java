package com.unicamp.mc322.Animacoes;

import java.util.*;

public class Dices {
	int dados; 
	int lados; 
	
	public Dices (int dados, int lados) {
		this.dados = dados;
		this.lados = lados;
		
	}
	
	public int getDados() {
		return dados;
		
	}
	
	public int getLados() {
		return lados;
	}
	
	public int PlayDices() {
		Random random = new Random();
		int aux = 0;
		for (int i = 0; i<(dados+1); i++) {
			int x = random.nextInt((lados - 1)+1) + 1;
			aux = aux + x;
		}
		
		return aux;
	}
	

}
