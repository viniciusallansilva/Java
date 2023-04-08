package com.unicamp.mc322.lab10;

public class Comum extends Veiculo{
	private final double preco=3;
	private final double precoAdicional=2;
	private final double precoParada=1.5;
	
	public Comum(int ano,Placa placa) {
		super(ano,placa);
	}
	
	public double getPrecoParada() {
		return this.precoParada;
	}
	
	public double getPreco() {
		return this.preco;
	}
	
	public double getPrecoAdicional() {
		return this.precoAdicional;
	}
}
