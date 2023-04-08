package com.unicamp.mc322.lab10;

import java.util.ArrayList;

public class Motorista extends Pessoa{
	private ArrayList<Veiculo> listaVeiculo;
	private int cnh;
	
	public Motorista(String nome, int cpf, Data data, int cartao, int carteira) {
		super(nome,cpf,data,cartao);
		this.listaVeiculo= new ArrayList<Veiculo>();
		this.cnh=carteira;
	}
	
	public void addVeiculo(Veiculo novo) {
		this.listaVeiculo.add(novo);
	}
	
	@Override
	public void imprimeInformacoes() {
		System.out.println("Motorista: "+this.nome+"\n");
		super.imprimeInformacoes();
		System.out.println("Carteira de Motorista: "+this.cnh+"\n");
	}
}
