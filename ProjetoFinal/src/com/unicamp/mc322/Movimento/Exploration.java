package com.unicamp.mc322.Movimento;

import com.unicamp.mc322.Animacoes.*;
import com.unicamp.mc322.Estrutura.*;

import java.util.ArrayList;

public class Exploration {
	private final static int MAX_ILHAS=200;
	private ArrayList<Island> islandList;
	private ArrayList<Island> visitedIsland;
	private ArrayList<Gate> gateList;
	private ArrayList<Bridge> bridgeList;
	private ArrayList<Elevator> elevatorList;
	private ArrayList<Pokemon> pokemonList;
	private ArrayList<Items> itemsList;
	private boolean estaAqui;
	private boolean exploreIniciada;
	private Messages info;
	
	public Exploration() {
		this.islandList=new ArrayList<Island>();
		this.visitedIsland=new ArrayList<Island>();
		this.gateList=new ArrayList<Gate>();
		this.bridgeList=new ArrayList<Bridge>();
		this.elevatorList=new ArrayList<Elevator>();
		this.pokemonList=new ArrayList<Pokemon>();
		this.itemsList=new ArrayList<Items>();
		this.islandList.add(criailhaInicial());
		this.exploreIniciada=false;
		this.info=new Messages();
		this.info.updateMessages("SUBIR", "DESCER","DIREITA","ESQUERDA");
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
	
	private void gerarNPokemons(int N) {
		Position nova=new Position();
		boolean pontoPertenceIlha=false;
		for(int i=0;i<N;i++) {
			while(pontoPertenceIlha==false) {
				nova.geraNovaPosicao();
				for(int j=0;j<this.islandList.size();j++) {
					if(this.islandList.get(j).pointBelongIsland(nova)==true) {
						pontoPertenceIlha=true;
					}
				}
			}
			this.pokemonList.add(new Pokemon(nova));
		}
	}
	
	private void gerarNItens(int N) {
		Position nova=new Position();
		boolean pontoPertenceIlha=false;
		for(int i=0;i<N;i++) {
			while(pontoPertenceIlha==false) {
				nova.geraNovaPosicao();
				for(int j=0;j<this.islandList.size();j++) {
					if(this.islandList.get(j).pointBelongIsland(nova)==true) {
						pontoPertenceIlha=true;
					}
				}
			}
			this.itemsList.add(new Items(nova));
		}
	}
	
	private void gerarNPontesNaIlha(int N) {
		Position ponto1;
		Position ponto2=this.islandList.get(0).getPontoIlha(0);
		for(int i=0;i<this.islandList.size();i++) {
			for(int v=0;v<N;v++) {
				this.islandList.get(i).geraPontoBordaIlha();
			}
		}
		for(int j=0;j<this.islandList.size();j++) {
			for(int k=0;k<this.islandList.get(j).tamanhoArrayPontoPonte();k++) {
				ponto1=this.islandList.get(j).getPontoIlha(k);
				for(int l=0;l<this.islandList.size();l++) {
					for(int m=0;m<this.islandList.get(l).tamanhoArrayPontoPonte();m++) {
						if(l!=j) {
							if(ponto1.ponto1EhMaisPerto(this.islandList.get(l).getPontoIlha(m),ponto2)) {
								ponto2=this.islandList.get(l).getPontoIlha(m);
							}
						}
					}
				}
				this.bridgeList.add(new Bridge(ponto1,ponto2));
			}
		}
	}
	
	private void gerarNportais(int N) {
		Position nova=new Position();
		boolean pontoPertenceIlha=false;
		for(int i=0;i<N;i++) {
			while(pontoPertenceIlha==false) {
				nova.geraNovaPosicao();
				for(int j=0;j<this.islandList.size();j++) {
					if(this.islandList.get(j).pointBelongIsland(nova)==true) {
						pontoPertenceIlha=true;
					}
				}
			}
			this.gateList.add(new Gate(nova));
		}
	}
	
	public boolean estaAi() {
		return this.estaAqui;
	}
	
	public void printaExploreMessages() {
		this.info.printMessages();
	}
	
	public void setEstaAi(boolean aux) {
		this.estaAqui=aux;
	}
	
	public void setExploreIniciada(boolean aux) {
		this.estaAqui=aux;
	}
	
	public boolean exploreIniciada() {
		return this.exploreIniciada;
	}
	

}
