package com.unicamp.mc322.lab07;

import java.util.Random;

public class Identificador {
	private String tagUnica;
	
	
	//vamos criar uma tag alfanumerica no formato AAA000 3 letras e 3 numeros aleatorios.
	public Identificador() {
		Random random1 = new Random();
		char p = (char)(random1.nextInt(26) + 'a');
		Random random2 = new Random();
		char s = (char)(random2.nextInt(26) + 'a');
		Random random3 = new Random();
		char t = (char)(random3.nextInt(26) + 'a');
		Random random4=new Random();
		int pN=random4.nextInt();
		Random random5=new Random();
		int sN=random5.nextInt();
		Random random6=new Random();
		int tN=random6.nextInt();
		
		String result=""+p+s+t+pN+sN+tN;
		this.tagUnica=result;
	}
	
	public String getTag() {
		return this.tagUnica;
	}
	
	public boolean identificadorEhIgual(String tag1) {
		return this.tagUnica.equals(tag1);
	}
	
	public void printaTag() {
		System.out.println("TAG: "+this.tagUnica+"\n");
	}
}
