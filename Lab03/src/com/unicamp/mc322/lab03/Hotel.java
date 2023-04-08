package com.unicamp.mc322.lab03;


class Hotel {
	private static final int MAX_VIP = 10;
	private static final int MAX_QUARTOS=100;
	
	private String nome;
	private String endereco;
	private String telefone;
	private float precoQuartoNormal;
	private float precoQuartoVip;
	private Room[] listaDeQuartos= new Room[MAX_QUARTOS];
	
	public Hotel(String nomeNovo,String enderecoNovo, String telefoneNovo,float precoNormal, float precoVip) {
		iniciaListaDeQuartos();
		this.nome=nomeNovo;
		this.endereco=enderecoNovo;
		this.telefone=telefoneNovo;
		this.precoQuartoNormal=precoNormal;
		this.precoQuartoVip=precoVip;
	}
	
	public boolean verificaDisponibilidade(int indice) {
		if(indice<=calculaQuartosTotais() && retornaQuarto(indice).getOcupacaoQuarto()==false) {
			return true;
		}
		else {
			return false;
		}
	}
	public Room retornaQuarto(int indice) {
		return this.listaDeQuartos[indice];
	}
	
	private int calculaQuartosVip() {
		int quantidade=0;
		for(int i=0;i<calculaQuartosTotais();i++) {
			if(retornaQuarto(i).getEhVip()==true) {
				quantidade++;
			}
		}
		return quantidade;
	}
	
	private void iniciaListaDeQuartos() {
		for(int i=0;i<MAX_QUARTOS;i++) {
			this.listaDeQuartos[i]=null;
		}
	}
	
	private int calculaQuartosTotais() {
		int quantidade=0;
		for(int i=0;i<MAX_QUARTOS;i++) {
			if(this.listaDeQuartos[i]!=null) {
				quantidade++;
			}
		}
		return quantidade;
	}
	
	private int calculaQuartosDisponiveis() {
		int soma=0;
		for(int i=0;i<calculaQuartosTotais();i++) {
			if(retornaQuarto(i).getOcupacaoQuarto()==false) {
				soma++;
			}
		}
		return soma;
	}
	
	public float getPrecoNormal() {
		return this.precoQuartoNormal;
	}
	
	public float getPrecoVip() {
		return this.precoQuartoVip;
	}
	
	public void addQuarto(Room novoQuarto) {
		if(novoQuarto.getEhVip()==true && calculaQuartosVip()>=MAX_VIP) {
			System.out.println("O limite de quartos VIP eh 10\n");
		}
		else if(novoQuarto.getEhVip()==false && calculaQuartosVip()<MAX_VIP) {
			System.out.println("Os primeiros quartos devem ser VIP\n");
		}
		else if(novoQuarto.getEhVip()==false && calculaQuartosVip()>=MAX_QUARTOS){
			System.out.println("Nao pode adicionar mais quartos, chegou-se no limite\n");
		}
		boolean auxiliar=true;
		int indice=0;
		while(auxiliar) {
			if(this.listaDeQuartos[indice]==null) {
				this.listaDeQuartos[indice]=novoQuarto;
				auxiliar=false;
			}
			else {
				indice++;
			}
		}
	}
	
	public void printaQuartosDisponiveis() {
		System.out.println("INFORMAÇÕES SOBRE DISPONIBILIDADES DE QUARTOS\n");
		for(int i=0;i<calculaQuartosTotais();i++) {
			if(retornaQuarto(i).getOcupacaoQuarto()==false) {
				System.out.println("Quarto disponivel de numero: "+i+"\n");
			}
		}
	}
	
	public void printaPrecoDiaria() {
		System.out.println("OS PRECOS DAS DIARIAS SAO\n");
		System.out.println("Quarto Normal: "+this.precoQuartoNormal+"\n");
		System.out.println("Quarto VIP: "+this.precoQuartoVip+"\n");
	}
	
	public void printaInformacoes() {
		System.out.println("Bem vindo ao Hotel: "+this.nome+"\n");
		System.out.println("Nosso endereco: "+this.endereco+"\n");
		System.out.println("Nosso telefone para contato: "+this.telefone+"\n");
		System.out.println("Atualmente temos "+calculaQuartosDisponiveis()+" Disponiveis.\n");
		for(int i=0;i<calculaQuartosTotais();i++) {
			if(retornaQuarto(i).getOcupacaoQuarto()==false) {
				System.out.println("Quarto: "+i);
				if(retornaQuarto(i).getEhVip()==true) {
					System.out.println(" Tipo: VIP, Preco diaria: "+this.precoQuartoVip+", ");
				}
				else {
					System.out.println(" Tipo: normal, Preco diaria: "+this.precoQuartoNormal+", ");
				}
				System.out.println("Servicos: ");
				if(retornaQuarto(i).getFumante()==true) {
					System.out.println("Aceita fumantes, ");
				}
				else {
					System.out.println("Nao Aceita fumantes, ");
				}
				if(retornaQuarto(i).getTemAr()==true) {
					System.out.println("Tem Ar Condicionado\n");
				}
				else {
					System.out.println("Nao Tem Ar Condicionado\n");
				}
			}
		}
	}
}
