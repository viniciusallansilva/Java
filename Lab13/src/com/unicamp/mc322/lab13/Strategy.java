package com.unicamp.mc322.lab13;

public abstract class Strategy implements IOrderingStrategy{
	public Strategy() {
		
	}
	
	@Override
	public  abstract double calcularScore(IOrder element);
}
