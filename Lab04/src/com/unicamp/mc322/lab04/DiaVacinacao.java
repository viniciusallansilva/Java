package com.unicamp.mc322.lab04;

public class DiaVacinacao {
	private DiasSemana dia;
	private Date data;
	private int maxVagas;
	private int numAtendidos;
	
	public DiaVacinacao(DiasSemana dia,int maxVagas, Date data) {
		this.dia=dia;
		this.data=data;
		this.maxVagas=maxVagas;
		this.numAtendidos=0;
		
	}
	
	public void incrementaVacinacao() {
		this.numAtendidos=this.numAtendidos+1;
	}
	
	public int getNumAtendidos() {
		return this.numAtendidos;
	}
	
	public void setDia(DiasSemana dia) {
		this.dia=dia;
	}
	
	public void setData(Date data) {
		this.data=data;
	}
	
	public DiasSemana getDia() {
		return this.dia;
	}
	
	public Date getData() {
		return this.data;
	}
	
	public void printaDia() {
		String nova=this.dia.name();
		System.out.println(nova+" ");
	}
	
	public int retornaVagasDisponiveis() {
		return (maxVagas-numAtendidos);
	}
}
