package com.unicamp.mc322.lab07;

import java.util.ArrayList;

import java.lang.Math;

public class Mansao extends Residencia{
	private double metrosQuadrado;
	
	public Mansao(String nome, Posicao endereco, double aluguel, double metrosQ) {
		super(nome, endereco, aluguel);
		this.metrosQuadrado=metrosQ;
	}
	
	@Override
	public void imprimeInfo(ArrayList<PontosInteresse> pontos) {
		super.imprimeInfo(pontos);
		System.out.println("Metros Quadrados: "+this.metrosQuadrado+"\n");
	}
	
	@Override
	public Reserva criaReserva(int numPessoas, int numMenores, int numDias) {
		Reserva nova=super.criaReserva(numPessoas, numMenores, numDias);
		nova.setValor(calculaValor(numDias,numPessoas));
		return nova;
	}
	
	private double calculaValor(int numDias, int numPessoas){
		double valor=0;
		for(int i=0;i<numDias;i++) {
			valor=valor+((this.aluguel)*Math.pow((100*numPessoas)/this.metrosQuadrado, i));
		}
		return valor;
	}
}
