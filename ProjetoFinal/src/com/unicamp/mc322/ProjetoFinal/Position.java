package com.unicamp.mc322.ProjetoFinal;

public class Position {
	private double x;
	private double y;
	
	public Position() {
		
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
}
