package com.unicamp.mc322.lab04;

public class Date {
	private static final int ANO_ATUAL = 2021;
	private static final int MES_ATUAL = 9;
	private static final int DIA_ATUAL = 17;
	private int dia;
	private int mes;
	private int ano;
	
	public Date(int ano,int mes, int dia) {
		this.dia=dia;
		this.mes=mes;
		this.ano=ano;
	}
	
	public int getDia() {
		return this.dia;
	}
	
	public int getMes() {
		return this.mes;
	}
	
	public int getAno() {
		return this.ano;
	}
	
	
	public void imprimeDate() {
		System.out.println("Data: "+this.dia+"/"+this.mes+"/"+this.ano+"\n");
	}
	
	public int calculaIdade() {
	/*Usaremos como referencia a data de criacao do laboratorio 17/09/2021
	obs: eu nao sabia se poderia usar alguma classe obter a data atual*/
	int idade=ANO_ATUAL-this.ano;
	if(this.mes<MES_ATUAL) {
		idade--;
	}
	else if(this.mes==MES_ATUAL && this.dia<DIA_ATUAL) {
		idade--;
	}
	return idade;
	}
	
}
