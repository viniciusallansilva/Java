package com.unicamp.mc322.Animacoes;

import com.unicamp.mc322.Estrutura.*;

public class Fruit {
	private Position ponto;
	private String name;
	private double hpRestore;
	
	public Fruit (Position ponto, String name, double hpRestore) {
		this.ponto = ponto;
		this.name = name;
		this.hpRestore = hpRestore;
	}
	
	public Position getPonto() {
		return ponto;
	}
	
	public String getName() {
		return name;
	}
	
	public double getHpRestore() {
		return hpRestore;
	}
	
	public static Fruit gerarFruit(Position ponto) {
		String[][] fruits = {
				{"Cherry", "5"},
				{"Berry", "10"},
				{"Caxi", "20"},
				{"Grapes", "30"},
				{"Kiwi", "50"}
		};		
		Aleatorio aleatorio = new Aleatorio();
		int fruitPos = aleatorio.getNumber(fruits.length);
		String [] fruit = fruits[fruitPos];
		
		return new Fruit(
				ponto,
				fruit[0],
				Double.parseDouble(fruit[1])
		);
	}
	

}