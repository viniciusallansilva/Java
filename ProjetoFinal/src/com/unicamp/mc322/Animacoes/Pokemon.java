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
	
	public Pokemon (Position ponto) {
		this.ponto=ponto;
	}
	
	private void Captura() {
		int d = dicesDistance.PlayDices();
		int k = dicesDifficulty.PlayDices();
	
	}
}
