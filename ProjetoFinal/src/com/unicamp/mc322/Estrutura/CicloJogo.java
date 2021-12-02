package com.unicamp.mc322.Estrutura;

import com.unicamp.mc322.Movimento.*;

import com.unicamp.mc322.Animacoes.*;

public class CicloJogo {
	private final static int JOGADOR_NAO_ROLOU_DADOS=1000;
	private boolean estaAqui;
	private boolean movimento;
	private boolean acao;
	private boolean iniciou;
	
	private Messages info;
	private Exploration explore;
	private Player jogador;
	
	private int nPokemons;
	private int nItems;
	private int nBridges;
	private int nGates;
	private int nIslands;
	private int nElevators;
	
	public CicloJogo() {
		this.info=new Messages("","","","","",MomentoJogo.RolarDados);
		this.movimento=true;
		this.explore=new Exploration();
		this.jogador=new Player();
		this.iniciou=false;
	}
	
	public boolean getEstaAqui() {
		return this.estaAqui;
	}
	
	public void setEstaAqui(boolean val) {
		this.estaAqui=val;
	}
	
	public boolean getIniciou() {
		return this.iniciou;
	}
	public void setInicio(boolean aux) {
		this.iniciou=aux;
	}
	
	public void printaCicloMessages() {
		geral();
		this.info.printMessages();
	}
	
	
	
	public void interpretaConfig(Configuracao config) {
		this.nPokemons=config.getNPokemons();
		this.nIslands=config.getNIsland();
		this.nBridges=config.getNBridges();
		this.nElevators=config.getNElevators();
		this.nGates=config.getNGates();
		this.nItems=config.getNItems();
	}
	
	private void geral() {
		
		if(this.movimento) {	
			if(explore.achouItem(jogador)) {
				jogador.addItem(explore.pegarItems(jogador));
				explore.removeItems(explore.pegarItems(jogador));
				
			}
			if(jogador.movimentosFaltantes()==JOGADOR_NAO_ROLOU_DADOS ) {
				this.info.updateMessages("Rolar Dados","","","","",MomentoJogo.RolarDados);
			}
			else if(jogador.movimentosFaltantes()>0 ) {
				this.info.updateMessages("SUBIR", "DESCER", "DIREITA", "ESQUERDA","",MomentoJogo.Direcoes);
			}
			else if(jogador.movimentosFaltantes()==0) {
				this.info.updateMessages("Escolher um dos meus Pokemons", "Usar algum Item","Atacar Pokemon","Tentar Capturar Pokemon","Rolar Dados",MomentoJogo.QualAcao);
				this.acao=true;
				this.movimento=false;
			}
		}
		else if(this.acao) {
				//continuar
		}
	}

	
	public void inicia() {
		explore.criaNilhas(nIslands, 0);
		explore.gerarNPokemons(nPokemons);
		explore.gerarNPontesNaIlha(nBridges);
		explore.gerarNportais(nGates);
		explore.gerarNItens(nItems);
		//explore.gerarNElevator(nElevators);
		jogador.moverPara(explore.getPontoNascimento());
		jogador.setIlhaJogador(explore.queIlhaJogadorEsta(jogador));
	}
	//
	//
	//
	//
	//
	public void trataInput(String valor) {
		if(this.info.getMomento().equals(MomentoJogo.RolarDados)){
			if(valor.equals("1")) {
				jogador.rolarDados();
			}
			else if(valor.equals("2")){
			
			}
			else if(valor.equals("3")) {
			
			}
			else if(valor.equals("4")) {
			
			}
			else if(valor.equals("5")) {
				
			}
		}
		else if(this.info.getMomento().equals(MomentoJogo.Direcoes)) {
			if(jogador.getIlhaEsta().ehPossivelAndar(jogador)) {
				if(valor.equals("1")) {
					jogador.sobe();
				}
				else if(valor.equals("2")){
					jogador.desce();
				}
				else if(valor.equals("3")) {
					jogador.direita();
				}
				else if(valor.equals("4")) {
					jogador.esquerda();
				}
				else if(valor.equals("5")) {
					
				}
				System.out.println("Nova Posicao do personage:");
				System.out.println("Movimentos Restantes: "+jogador.movimentosFaltantes()+"\n");
				jogador.getPosition().printPosition();
			}
			
			
		}
		else if(this.info.getMomento().equals(MomentoJogo.QualAcao)) {
			//implementar
			if(valor.equals("1")){ //escolher meus pokemons
				System.out.println("POKEMON ESCOLHIDO\n");
			}
			else if(valor.equals("2")){//escolher meus items
				System.out.println("ITEM ESCOLHIDO\n");
			}
			else if(valor.equals("3")) {//atacar pokemon
				
			}
			else if(valor.equals("4")) {//tentar capturar
			}
			else if(valor.equals("5")) {//rolar dados
				this.info.updateMessages("Rolar Dados","","","","",MomentoJogo.RolarDados);
				this.jogador.setMovimentosFaltantes(JOGADOR_NAO_ROLOU_DADOS);
				this.acao=false;
				this.movimento=true;
			}
		}
		else if((this.info.getMomento().equals(MomentoJogo.PartidaIniciada))) {
			if(valor.equals("1")) {
			}
			else if(valor.equals("2")){
			}
			else if(valor.equals("3")) {
			}
			else if(valor.equals("4")) {
			}
			else if(valor.equals("5")) {
				
			}
		}
		else if(false) {
			if(valor.equals("1")) {
			}
			else if(valor.equals("2")){
			}
			else if(valor.equals("3")) {
			}
			else if(valor.equals("4")) {
			}
			else if(valor.equals("5")) {
				
			}
		}
		else if(false) {
			if(valor.equals("1")) {
			}
			else if(valor.equals("2")){
			}
			else if(valor.equals("3")) {
			}
			else if(valor.equals("4")) {
			}
			else if(valor.equals("5")) {
				
			}
		}
		
	}
}
