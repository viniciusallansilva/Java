package com.unicamp.mc322.Estrutura;

import java.util.Random;
import java.lang.Math;

public class Aleatorio {
	private Random aleaotiro;
	public Aleatorio() {
		this.aleaotiro= new Random();
	}
	
	public Type getType() {
		int numero=this.aleaotiro.nextInt(6);
		if(numero==0) {
			return Type.water;
		}
		if(numero==1) {
			return Type.fire;
		}
		if(numero==2) {
			return Type.grass;
		}
		if(numero==3) {
			return Type.eletric;
		}
		if(numero==4) {
			return Type.pyshic;
		}
		return Type.dragon;
	}
	
	public int getIntDez() {
		int numero=this.aleaotiro.nextInt(10);
		return numero;
	}
	
	public int getNumber(double range) {
		int n=(int)range;
		int numero=this.aleaotiro.nextInt(n);
		return numero;
	}
	
	public String getChar() {
		int numero=this.aleaotiro.nextInt(26);
		String stringRandom=devolveLetraCorresponde(numero);
		return stringRandom;
	}
	
	private String devolveLetraCorresponde(int indice) {
		if(indice==0) {
			return "A";
		}
		else if(indice==0) {
			return "B";
		}
		else if(indice==1) {
			return "C";
		}
		else if(indice==2) {
			return "D";
		}
		else if(indice==3) {
			return "E";
		}
		else if(indice==4) {
			return "F";
		}
		else if(indice==5) {
			return "G";
		}
		else if(indice==6) {
			return "H";
		}
		else if(indice==7) {
			return "I";
		}
		else if(indice==8) {
			return "J";
		}
		else if(indice==9) {
			return "K";
		}
		else if(indice==10) {
			return "L";
		}
		else if(indice==11) {
			return "M";
		}
		else if(indice==12) {
			return "N";
		}
		else if(indice==13) {
			return "O";
		}
		else if(indice==14) {
			return "P";
		}
		else if(indice==15) {
			return "Q";
		}
		else if(indice==16) {
			return "R";
		}
		else if(indice==17) {
			return "S";
		}
		else if(indice==18) {
			return "T";
		}
		else if(indice==19) {
			return "U";
		}
		else if(indice==20) {
			return "V";
		}
		else if(indice==21) {
			return "W";
		}
		else if(indice==22) {
			return "X";
		}
		else if(indice==23) {
			return "Y";
		}
		return "Z";
	}
}