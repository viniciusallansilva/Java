package com.unicamp.mc322.Lab05;

import java.util.*;

import java.time.*;


public class LembreteMensal extends Lembrete{
	private Month mes;
	
	public LembreteMensal() {
		this.mes=LocalDateTime.now().getMonth();
	}
	
	public void setMonth(Month novoMes) {
		this.mes=novoMes;
	}
	@Override
	public void printaInformacao() {
		super.printaInformacao();
		System.out.println("Repetirá todo: "+this.mes+"\n");
	}
}
