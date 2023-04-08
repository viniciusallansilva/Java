package com.unicamp.mc322.lab10;

public class Passageiro extends Pessoa{
	public Passageiro(String nome, int cpf, Data data, int cartao) {
		super(nome,cpf,data,cartao);
	}
	@Override
	public void imprimeInformacoes() {
		System.out.println("Passageiro: "+this.nome+"\n");
		super.imprimeInformacoes();
	}
}
