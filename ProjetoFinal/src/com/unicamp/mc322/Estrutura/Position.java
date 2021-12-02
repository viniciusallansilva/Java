package com.unicamp.mc322.Estrutura;

import java.lang.Math;

public class Position {
	private final static int X_MAX=200;
	private final static int Y_MAX=200;
	
	private double x;
	private double y;
	
	public Position() {
		Aleatorio ale=new Aleatorio();
		this.x=ale.getNumber(X_MAX);
		this.y=ale.getNumber(Y_MAX);
	}
	
	public Position(double x, double y) {
		setX(x);
		setY(y);
	}
	
	public void setX(double x) {
		this.x=x;
	}
	
	public void setY(double y) {
		this.y=y;
	}
	
	public double getX() {
		return this.x;
	}
	
	public double getY() {
		return this.y;
	}
	
	public void printPosition() {
		System.out.println("Position: "+this.x+";"+this.y+"\n");
	}
	
	public boolean isSamePosition(Position position) {
		if((position.getX()==this.x)&&(position.getY()==this.y)) {
			return true;
		}
		return false;
	}
	
	public void geraNovaPosicao() {
		Aleatorio ale=new Aleatorio();
		this.x=ale.getNumber(X_MAX);
		this.y=ale.getNumber(Y_MAX);
	}
	
	public Position retornPontoMaisPerto(Position ponto1, Position ponto2) {
		if(calculaDistancia(ponto1)<calculaDistancia(ponto2)) {
			return ponto1;
		}
		return ponto2;
	}
	
	public boolean ponto1EhMaisPerto(Position ponto1, Position ponto2) {
		if(calculaDistancia(ponto1)<calculaDistancia(ponto2)) {
			return true;
		}
		return false;
			
	}
	
	public double calculaDistancia(Position ponto) {
		double vertical=this.y-ponto.getY();
		double horizontal=this.x-ponto.getX();
		double aux=(vertical*vertical)+(horizontal*horizontal);
		double dist=Math.sqrt(aux);
		return dist;
	}


}
