package com.unicamp.mc322.lab07;

public class Reserva {
	private Identificador tagAlugada;
	private int numMaxPessoas;
	private int numMenoresIdade;
	private int numDias;
	private double valor;
	
	public Reserva(Identificador tag, int numPessoas, int numMenores, int numDias) {
		this.numDias=numDias;
		this.tagAlugada=tag;
		this.numMaxPessoas=numPessoas;
		this.numMenoresIdade=numMenores;
	}
	
	public Reserva(Identificador tag, int numPessoas, int numMenores) {
		this.numDias=1;
		this.tagAlugada=tag;
		this.numMaxPessoas=numPessoas;
		this.numMenoresIdade=numMenores;
	}
	
	public void setValor(double valor) {
		this.valor=valor;
	}
	
	public void printaValorReserva() {
		System.out.println("Valor da Reserva total é: "+this.valor+"\n");
	}
	
}
