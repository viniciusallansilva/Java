package com.unicamp.mc322.lab10;

public class Veiculo {
	private int ano;
	private Placa placa;
	private Motorista motorista;
	private double auxiliar;
	
	public Veiculo(int anoFabricacao,Placa emplacamento) {
		this.ano=anoFabricacao;
		this.placa=emplacamento;
	}
	
	public void addMotorista(Motorista dono) {
		this.motorista=dono;
	}
	
	public double getPrecoParada() {
		return auxiliar;
	}
	
	public double getPreco() {	
		return auxiliar;
	}
	
	public double getPrecoAdicional() {	
		return auxiliar;
	}
	
}
