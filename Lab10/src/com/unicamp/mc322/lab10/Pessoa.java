package com.unicamp.mc322.lab10;

public class Pessoa {
	protected String nome;
	protected int cpf;
	protected Data nascimento;
	protected int cartaoCredito;
	
	public Pessoa(String nome, int cpf, Data data, int cartao) {
		this.nome=nome;
		this.cpf=cpf;
		this.nascimento=data;
		this.cartaoCredito=cartao;
	}
	
	public void imprimeInformacoes() {
		System.out.println("CPF: "+this.cpf+"\n");
		System.out.println("Cartao: "+this.cartaoCredito+"\n");
	}
}
