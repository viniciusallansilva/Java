package com.unicamp.mc322.lab07;

import java.lang.Math;

import java.util.ArrayList;

public class Posicao {
	private double x;
	private double y;
	
	public Posicao(double newX, double newY) {
		this.x=newX;
		this.y=newY;
	}
	
	public double getX() {
		return this.x;
	}
	
	public double getY() {
		return this.y;
	}
	
	public void printaEndereco() {
		System.out.println("X: "+this.x+", Y: "+this.y+"\n");
	}
	
	public void printaDistanciaPontos(ArrayList<PontosInteresse> pontos) {
		double distancia=0;
		for(int i=0;i<pontos.size();i++) {
			System.out.println("Ponto turistico: "+pontos.get(i).getNome()+"\n");
			distancia=Math.pow((this.x-pontos.get(i).getPosicao().getX()), 2)+Math.pow((this.y-pontos.get(i).getPosicao().getY()), 2);
			distancia=Math.sqrt(distancia);
			System.out.println("Distancia: "+distancia+"\n");
		}
	}
}
