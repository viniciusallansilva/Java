package com.unicamp.mc322.Estrutura;

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
		System.out.println("Position: "+this.x+","+this.y+"\n");
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


}
