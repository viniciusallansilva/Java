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
	private Messages info;
	
	private int nPokemons;
	private int nItems;
	private int nBridges;
	private int nGates;
	private int nIslands;
	private int nElevators;
	private Position pontoNascimento;
	
	public Exploration() {
		this.islandList=new ArrayList<Island>();
		this.visitedIsland=new ArrayList<Island>();
		this.gateList=new ArrayList<Gate>();
		this.bridgeList=new ArrayList<Bridge>();
		this.elevatorList=new ArrayList<Elevator>();
		this.pokemonList=new ArrayList<Pokemon>();
		this.itemsList=new ArrayList<Items>();
		this.islandList.add(criailhaInicial());
		this.info=new Messages();
		this.pontoNascimento=new Position(100,100);
	}
	
	private Island criailhaInicial() {
		int andares=1;
		Island primeira=new Island(new Position(95,95),new Position(105,105),new Aleatorio().getType(),andares);
		primeira.addPontoComecaPonte(new Position(95,95));
		return primeira;
	}
	
	public void criaNilhas(int N,int andares) {
		N=N-1;//a primeira ja foi criada
		//crio um ponto inicial nao pertencente a uma ilha anterior
		for(int i=0;i<N;i++) {
			Position novo=new Position();
			do{
				novo.geraNovaPosicao();
			}
			while(this.islandList.get(i).pointBelongIsland(novo));	
			this.islandList.add(new Island(novo,new Aleatorio().getType(),andares));
		}
	}
	
	public void gerarNPokemons(int N) {
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
			//this.pokemonList.add(new Pokemon(nova));
		}
	}
	
	public void gerarNItens(int N) {
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
	
	public void gerarNPontesNaIlha(int N) {
		Position ponto1;
		Position ponto2=this.islandList.get(0).getPontoPonteIlha(0);
		for(int i=0;i<this.islandList.size();i++) {
			for(int v=0;v<N;v++) {
				this.islandList.get(i).geraPontoBordaIlha();
			}
		}
		for(int j=0;j<this.islandList.size();j++) {
			for(int k=0;k<this.islandList.get(j).tamanhoArrayPontoPonte();k++) {
				ponto1=this.islandList.get(j).getPontoPonteIlha(k);
				for(int l=0;l<this.islandList.size();l++) {
					for(int m=0;m<this.islandList.get(l).tamanhoArrayPontoPonte();m++) {
						if(l!=j) {
							if(ponto1.ponto1EhMaisPerto(this.islandList.get(l).getPontoPonteIlha(m),ponto2)) {
								ponto2=this.islandList.get(l).getPontoPonteIlha(m);
							}
						}
					}
				}
				this.bridgeList.add(new Bridge(ponto1,ponto2));
			}
		}
	}
	
	public void gerarNportais(int N) {
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
	
	public void interpretaConfig(Configuracao config) {
		this.nPokemons=config.getNPokemons();
		this.nIslands=config.getNIsland();
		this.nBridges=config.getNBridges();
		this.nElevators=config.getNElevators();
		this.nGates=config.getNGates();
		this.nItems=config.getNItems();
	}
	
	public boolean achouItem(Player jogador) {
		boolean achouItem=false;
		for(int i=0;i<this.itemsList.size();i++) {
			if(this.itemsList.get(i).getPosition().equals(jogador.getPosition())) {
				achouItem=true;
			}
		}
		return achouItem;
	}
	
	public Items pegarItems(Player jogador) {
		for(int i=0;i<this.itemsList.size();i++) {
			if(this.itemsList.get(i).getPosition().equals(jogador.getPosition())) {
				return this.itemsList.get(i);
			}
		}
		return this.itemsList.get(0);
	}
	
	public void removeItems(Items aux) {
		this.itemsList.remove(aux);
	}
	
	public Position getPontoNascimento() {
		return this.pontoNascimento;
	}
	
	public Island queIlhaJogadorEsta(Player jogador) {
		for(int i=0;i<this.islandList.size();i++) {
			if(this.islandList.get(i).pointBelongIsland(jogador.getPosition())) {
				return this.islandList.get(i);
			}
		}
		return this.islandList.get(0);
	}

}
