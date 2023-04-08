package com.unicamp.mc322.lab10;

public class Luxo extends Veiculo{
	private double preco=7;
	private double precoAdicional=3.5;
	private final double precoParada=2.7;
	
	public Luxo(int ano,Placa placa) {
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
