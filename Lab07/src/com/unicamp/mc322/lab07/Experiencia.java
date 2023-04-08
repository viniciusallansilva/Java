package com.unicamp.mc322.lab07;

import java.util.ArrayList;

public class Experiencia {
	private String nome;
	private Posicao endereco;
	private int maxParticipantes;
	private double precoBase;
	private double precoMenorIdade;
	private Identificador tag;
	
	public Experiencia(String nome,Posicao endereco, int maxPessoas, double precoB, double precoM) {
		this.nome=nome;
		this.endereco=endereco;
		this.maxParticipantes=maxPessoas;
		this.precoBase=precoB;
		this.precoMenorIdade=precoM;
	}
	
	public void setTag(Identificador tag) {
		this.tag=tag;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public Reserva criaReserva(int numPessoas, int numMenores, int numDias) {
		Reserva nova=new Reserva(this.tag,numPessoas,numMenores,numDias);
		double valor=0;
		if(numPessoas<=this.maxParticipantes) {	
			valor=(numPessoas-numMenores)*this.precoBase+numMenores*precoMenorIdade;
			nova.setValor(valor);
		}else {
			nova.setValor(valor);
		}
		return nova;
	}
	
	public void imprimeInfo(ArrayList<PontosInteresse> pontos) {
		System.out.println("Nome: "+this.nome+"\n");
		this.endereco.printaEndereco();
		System.out.println("Max pessoas: "+this.maxParticipantes+"\n");
		System.out.println("Preco Base: "+this.precoBase+"\n");
		System.out.println("Preco Menor de Idade: "+this.precoMenorIdade+"\n");
		this.tag.printaTag();
		endereco.printaDistanciaPontos(pontos);
	}
}
