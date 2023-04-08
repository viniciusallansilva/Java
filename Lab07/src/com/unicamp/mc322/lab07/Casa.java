package com.unicamp.mc322.lab07;

import java.lang.Math;

import java.util.ArrayList;

public class Casa extends Residencia{
	private final static int NUM_MAX_COBRACA_PISCINA=7;
	private int numeroQuartos;
	private int numeroBanheiro;
	private boolean piscina;
	
	public Casa(String nome, Posicao endereco, double aluguel, int nQuartos, int nBanheiros, boolean temPiscina) {
		super(nome, endereco, aluguel);
		this.numeroQuartos=nQuartos;
		this.numeroBanheiro=nBanheiros;
		this.piscina=temPiscina;
	}
	@Override
	public void imprimeInfo(ArrayList<PontosInteresse> pontos) {
		super.imprimeInfo(pontos);
		System.out.println("Numero de Quartos: "+this.numeroQuartos+"\n");
		System.out.println("Numero de Banheiros: "+this.numeroBanheiro+"\n");
		System.out.println("Tem Piscina: "+this.piscina+"\n");
	}
	
	@Override
	public Reserva criaReserva(int numPessoas, int numMenores, int numDias) {
		Reserva nova=super.criaReserva(numPessoas, numMenores, numDias);
		nova.setValor(calculaValor(numDias));
		return nova;
	}
	
	private double calculaValor(int numDias){
		double valor=(this.numeroBanheiro/this.numeroQuartos)*this.aluguel;
		if(this.piscina && numDias<=NUM_MAX_COBRACA_PISCINA) {
			valor+=valor*numDias;
		}else if(!this.piscina){
			valor+=valor*numDias;
		}
		else{
			valor+=(valor*NUM_MAX_COBRACA_PISCINA)+(valor*(numDias-NUM_MAX_COBRACA_PISCINA));
		}
		return valor;
	}
}
