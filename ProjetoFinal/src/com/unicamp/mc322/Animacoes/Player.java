package com.unicamp.mc322.Animacoes;

import java.util.ArrayList;
import com.unicamp.mc322.Estrutura.*;
import com.unicamp.mc322.Movimento.*;

public class Player {
	private final static int JOGADOR_NAO_ROLOU_DADOS=1000;
	private ArrayList<Pokemon> pokemonList;
	private ArrayList<Items> ItemsList;
	private Island ilha;
	private int movimentosRestantes;
	private Position ponto;
	public Player() {
		this.movimentosRestantes=JOGADOR_NAO_ROLOU_DADOS;
		this.ponto=new Position();
	}
	
	public int movimentosFaltantes() {
		return this.movimentosRestantes;
	}
	
	public void rolarDados() {
		Dices dado=new Dices(2,6);
		this.movimentosRestantes=dado.playDices();
		System.out.println("Precisa ser Movimentado: "+this.movimentosRestantes+"\n");
	}
	
	public void sobe() {
		double a=this.ponto.getY();
		this.ponto.setY(a+1);
		this.movimentosRestantes--;
	}
	
	public void desce() {
		double a=this.ponto.getY();
		this.ponto.setY(a-1);
		this.movimentosRestantes--;
	}
	
	public void direita() {
		double a=this.ponto.getX();
		this.ponto.setX(a+1);
		this.movimentosRestantes--;
	}
	
	public void esquerda() {
		double a=this.ponto.getX();
		this.ponto.setX(a-1);
		this.movimentosRestantes--;
	}
	
	public Position getPosition() {
		return this.ponto;
	}
	
	public void setMovimentosFaltantes(int numero) {
		this.movimentosRestantes=numero;
	}
	
	public void moverPara(Position point) {
		this.ponto=point;
	}
	
	public void addItem(Items novo) {
		this.ItemsList.add(novo);
	}
	
	public void setIlhaJogador(Island ilha) {
		this.ilha=ilha;
	}
	public Island getIlhaEsta() {
		return this.ilha;
	}
}
