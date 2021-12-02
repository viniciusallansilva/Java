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

	public Pokemon (Position ponto, String name, double hp, double attack, double defense, String type1, String type2) {
		this.ponto = ponto;
		this.name = name;
		this.hp = hp;
		this.attack = attack;
		this.defense = defense;
		this.type1 = type1;
		this.type2 = type2;
	}


	public static Pokemon gerarPokemon(Position ponto) {
		String[][] pokemons = {
				{"Pikachu", "10", "10", "10", "electric", ""},
				{"Squirtle", "10", "10", "10", "water", ""},
				{"Charizard", "10", "10", "10", "fire", ""}
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
				pokemon[4], pokemon[5]
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

	public void setHp(double hp) {
		this.hp = hp;
	}

	public void setAttack(double attack) {
		this.attack = attack;
	}

	public void setDefense(double defense) {
		this.defense = defense;
	}

	public void captura() {
		int d = dicesDistance.PlayDices();
		int k = dicesDifficulty.PlayDices();
	}
}
