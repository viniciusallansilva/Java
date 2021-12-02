package com.unicamp.mc322.Animacoes;

import java.util.ArrayList;
import com.unicamp.mc322.Estrutura.*;

public class Pokemon {
	private Position ponto;
	private String name;
	private double hp;
	private double attack;
	private double defense;
	private ArrayList<Type> listType;
	private Dices dicesDistance = new Dices(1, 4);
	private Dices dicesDifficulty = new Dices(2, 4);
	private String type1;
	private String type2;
	private double hpStatic;
	private ArrayList<Fruit> listFruit;
	
	public Pokemon (Position ponto, String name, double hp, double attack, double defense, String type1, String type2, double hpStatic) {
		this.ponto = ponto;
		this.name = name;
		this.hp = hp;
		this.attack = attack;
		this.defense = defense;
		this.type1 = type1;
		this.type2 = type2;
		this.hpStatic = hpStatic;
	}
	
	
	public static Pokemon gerarPokemon(Position ponto) {
		String[][] pokemons = {
				{"Pikachu", "70", "30", "12", "Type.ELECTRIC", "Type.NONE"},
				{"Squirtle", "60", "25", "10", "water", "none"},
				{"Charizard", "100", "45", "20", "fire", "dragon"},
				{"Exeggutor", "90", "40", "17", "grass", "dragon"},
				{"Slowbro", "85", "37", "15", "water", "psychic"},
				{"Lotad", "70", "30", "12", "Type.WATER", "Type.GRASS"},
				{"dragonair", "85", "37", "15", "Type.DRAGON", "Type.NONE"}
				
		};
		
		Aleatorio aleatorio = new Aleatorio();
		int pokemonPos = aleatorio.getNumber(pokemons.length);
		String [] pokemon = pokemons[pokemonPos];
		
		return new Pokemon(
				ponto,
				pokemon[0], 
				Double.parseDouble(pokemon[1]), 
				Double.parseDouble(pokemon[2]), 
				Double.parseDouble(pokemon[3]),
				pokemon[4], pokemon[5], 
				Double.parseDouble(pokemon[1])
		);
	}

	public String getName() {
		return name;
	}
	
	public double getHp() {
		return hp;
	}
	
	public double getAttack() {
		return attack;
	}
	
	public double getDefense() {
		return defense;
	}
	
	public String getType1() {
		return type1;
	}
	
	public String getType2() {
		return type2;
	}
	
	public double getHpStatic() {
		return hpStatic;
	}
	
	public void setHp(double hp) {
		this.hp = hp;
	}
	
	public void setAttack(double attack) {
		this.attack = attack;
	}
	
	public void setDefense(double defense) {
		this.defense = defense;
	}
	
	public void setHpStatic(double hpStatic) {
		this.hpStatic = hpStatic;
	}
	
	public void Captura() {
		int d = dicesDistance.PlayDices();
		int k = dicesDifficulty.PlayDices();
	}
	
	public void Comer(Fruit fruit) {
		double x = (getHp()+ fruit.getHpRestore());
		if (x > getHpStatic()) {
			setHp(getHpStatic());
		} else {
			setHp(x);
		}
	}
}