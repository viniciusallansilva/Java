package com.unicamp.mc322.Animacoes;

import java.util.ArrayList;

public class Skill {
	private String name;
	//private ArrayList<Pokemons> pokemonsList;
	
	public Skill (String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	//Chamar essa habilidade para aumentar as coisas e depois de uma rodada
	//chamar a habilidade debaixo obrigatoriamente para voltar ao normal.
	//Exemplo:poke1 chama habPass -> poke2 faz alguma coisa ->
	//poke1 ataca (e depois do ataque chama habpasvolta pra voltar ao normal após 1 turno
	//mas deixando o poke1 usar esse power up).
	public void HabPassiva(Pokemon pokemon) {//Aumenta o ataque e a defesa em 15%.
		pokemon.setAttack(pokemon.getAttack()+(pokemon.getAttack()*0.15));
		pokemon.setDefense(pokemon.getDefense()+(pokemon.getDefense()*0.15));	
		
	}
	
	public void HabPassVolta (Pokemon pokemon) {//Volta ao normal os atributos deo pokemon.
		pokemon.setAttack(pokemon.getAttack()/1.15);
		pokemon.setDefense(pokemon.getDefense()/1.15);
		
	}
	
}