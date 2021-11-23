package com.unicamp.mc322.Movimento;

import com.unicamp.mc322.Estrutura.*;

import java.util.ArrayList;

public class Exploration {
	private ArrayList<Island> islandList;
	private ArrayList<Island> visitedIsland;
	private ArrayList<Gate> gateList;
	
	public Exploration() {
		this.islandList=new ArrayList<Island>();
		this.visitedIsland=new ArrayList<Island>();
		this.gateList=new ArrayList<Gate>();
		this.islandList.add(criailhaInicial());
	}
	
	private Island criailhaInicial() {
		int andares=1;
		Island primeira=new Island(new Position(95,95),new Position(105,105),new Aleatorio().getType(),andares);
		return primeira;
	}
	
	private void criaNilhas(int N,int andares) {
		N=N-1;//a primeira ja foi criada
		for(int i=0;i<N;i++) {
			Position novo=new Position();
			do{
				novo.geraNovaPosicao();
			}
			while(this.islandList.get(i).pointBelongIsland(novo));	
			Island nova=new Island(novo,new Aleatorio().getType(),andares);
		}
	}
	
}
