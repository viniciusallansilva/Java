package com.unicamp.mc322.lab07;

public class Redes extends Residencia{
	private final static int NUM_MAX_PESSOAS=5;
	public Redes(String nome, Posicao endereco, double aluguel) {
		super(nome,endereco,aluguel);
	}
	
	@Override
	public Reserva criaReserva(int numPessoas, int numMenores, int numDias) {
		if(numPessoas<=NUM_MAX_PESSOAS) {
			Reserva nova=super.criaReserva(numPessoas, numMenores, numDias);
			nova.setValor(calculaValor(numDias,numPessoas));
			return nova;
		}
		System.out.println("Numero excedido de pessoas\n");
		return null;
	}
	
	private double calculaValor(int numDias, int numPessoas){
		double valor=this.aluguel*numPessoas*numDias;
		return valor;
	}
}
