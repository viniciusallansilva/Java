package com.unicamp.mc322.lab07;

import java.lang.Math;

import java.util.ArrayList;

public class Apartamento extends Residencia{
	private int numeroQuartos;
	private int numeroBanheiros;
	private int andar;
	private boolean sacada;
	

	public Apartamento(String nome, Posicao endereco, double aluguel, int nQuartos,int nBanheiros,int andar, boolean sacada) {
		super(nome, endereco, aluguel);
		this.numeroQuartos=nQuartos;
		this.numeroBanheiros=nBanheiros;
		this.andar=andar;
		this.sacada=sacada;
	}
	
	@Override
	public void imprimeInfo(ArrayList<PontosInteresse> pontos) {
		super.imprimeInfo(pontos);
		System.out.println("Numero Quartos: "+this.numeroQuartos+"\n");
		System.out.println("Numero Banheiros: "+this.numeroBanheiros+"\n");
		System.out.println("Andar: "+this.andar+"\n");
		System.out.println("Possui Sacada: "+this.sacada+"\n");
	}
	
	@Override
	public Reserva criaReserva(int numPessoas, int numMenores, int numDias) {
		Reserva nova=super.criaReserva(numPessoas, numMenores, numDias);
		nova.setValor(calculaValor(numDias));
		return nova;
	}
	
	private double calculaValor(int numDias){
		double valor=this.aluguel*(this.andar/100);
		if(this.sacada) {
			valor+=this.aluguel;
		}
		valor+=valor*numDias;
		return valor;
	}
	
}
