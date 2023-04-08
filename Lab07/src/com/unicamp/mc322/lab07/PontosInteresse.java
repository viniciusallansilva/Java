package com.unicamp.mc322.lab07;

public class PontosInteresse {
	private Posicao endereco;
	private String nome;
	
	public PontosInteresse(String nome, Posicao endereco) {
		this.nome=nome;
		this.endereco=endereco;
	}
	
	public void printaInfo() {
		System.out.println("Nome: "+this.nome);
		endereco.printaEndereco();
	}
	
	public Posicao getPosicao() {
		return this.endereco;
	}
	
	public String getNome() {
		return this.nome;
	}
}
