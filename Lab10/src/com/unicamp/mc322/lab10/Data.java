package com.unicamp.mc322.lab10;

public class Data {
	private int dia;
	private int mes;
	private int ano;
	
	public Data(int day, int month,int year) {
		this.dia=day;
		this.mes=month;
		this.ano=year;
	}
	
	public void imprimeData() {
		System.out.println("Data: "+this.dia+"/"+this.mes+"/"+this.ano+"\n");
	}
}
