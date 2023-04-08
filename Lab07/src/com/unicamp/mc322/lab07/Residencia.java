package com.unicamp.mc322.lab07;

import java.util.ArrayList;

public class Residencia {
	protected String nome;
	protected Posicao endereco;
	protected double aluguel;
	protected Identificador tag;
	
	public Residencia(String nome, Posicao endereco, double aluguel) {
		this.nome=nome;
		this.endereco=endereco;
		this.aluguel=aluguel;
	}
	
	public void imprimeInfo(ArrayList<PontosInteresse> pontos) {
		System.out.println("NOME: "+nome+"\n");
		this.tag.printaTag();
		this.endereco.printaEndereco();
		System.out.println("Valor Diario Aluguel: "+this.aluguel+"\n");
		this.endereco.printaDistanciaPontos(pontos);
	}
	
	public void setTag(Identificador Tag) {
		this.tag=Tag;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public Reserva criaReserva(int numPessoas, int numMenores, int numDias) {
		Reserva nova=new Reserva(this.tag,numPessoas,numMenores,numDias);
		return nova;
	}
	
}
