package com.unicamp.mc322.lab04;

import java.lang.Math;

public class Position {
	private double X;
	private double Y;
	
	public Position(float x,float y) {
		this.X=x;
		this.Y=y;
	}
	
	public void imprimeEndereco() {
		System.out.println("Endereco: "+this.X+","+this.Y+"\n");
	}
	
	public double getX() {
		return this.X;
	}
	public double getY() {
		return this.Y;
	}
	
	public double calculaDistancia(Position endereco) {
		double distancia=Math.sqrt(Math.pow((this.X-endereco.getX()), 2)+Math.pow((this.Y-endereco.getY()), 2));
		return distancia;
	}
}
