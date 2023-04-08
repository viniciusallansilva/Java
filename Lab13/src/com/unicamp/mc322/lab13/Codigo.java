package com.unicamp.mc322.lab13;

public class Codigo {
	private String s1;
	private int i1;
	private String s2;
	
	public Codigo() {
		Aleatorio ale=new Aleatorio();
		this.i1=ale.getInt()+ale.getInt()*10+ale.getInt()*100;
		this.s1=ale.getChar().concat(ale.getChar().concat(ale.getChar()));
		this.s2=ale.getChar().concat(ale.getChar().concat(ale.getChar()));
	}
	
	public void printaCodigo() {
		System.out.println("Codigo: "+this.s1+"-"+this.i1+"-"+this.s2+"\n");
	}
}
