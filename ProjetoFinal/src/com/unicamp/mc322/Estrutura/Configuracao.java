package com.unicamp.mc322.Estrutura;

public class Configuracao{
	private boolean estaAqui;
	private Messages info;
	private int nPokemons;
	private int nItems;
	private int nBridges;
	private int nGates;
	private int nIslands;
	private int nElevators;
	public Configuracao() {
		this.estaAqui=true;
		this.info=new Messages();
		this.info.updateMessages("Jogar um Mundo Padrao","Gerar Aleatorio","Abri arquivo txt","","",MomentoJogo.Config);
	}
	
	public void padrao() {
		//condicao 1
		this.nPokemons=50;
		this.nItems=50;
		this.nBridges=4;
		this.nGates=200;
		this.nIslands=100;
		this.nElevators=100;
	}
	
	public void abreConfig() {
		//condicao 3
		//implementar
	}
	
	public void geraAleatorio() {
		//condicao 2
		Aleatorio ale=new Aleatorio();
		this.nPokemons=ale.getNumber(100);
		this.nItems=ale.getNumber(100);
		this.nBridges=ale.getNumber(10);
		this.nGates=ale.getNumber(400);
		this.nIslands=ale.getNumber(200);
		this.nElevators=ale.getNumber(200);
	}
	
	public boolean estaAi() {
		return this.estaAqui;
	}
	
	public void printaConfigMessages() {
		this.info.printMessages();
	}
	
	public void trataInput(String input) {
		if(input.equals("1")){
			padrao();
		}
		else if(input.equals("2")) {
			geraAleatorio();
		}
		else if(input.equals("3")) {
			
		}
		//parte de config encerrou
		this.estaAqui=false;
		
	}
	
	public int getNPokemons() {
		return this.nPokemons;
	}
	
	public int getNIsland() {
		return this.nIslands;
	}
	
	public int getNGates() {
		return this.nGates;
	}
	
	public int getNBridges() {
		return this.nBridges;
	}
	
	public int getNItems() {
		return this.nItems;
	}
	
	public int getNElevators() {
		return this.nElevators;
	}
	
}
