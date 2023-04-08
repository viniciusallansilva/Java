package com.unicamp.mc322.lab13;

public class PriorityScore extends Strategy{

	public PriorityScore() {
		
	}
	
	@Override
	public double calcularScore(IOrder element) {
		//PersonAge/100 + (7/100)*turnosEsperando
		double score=(element.getPeople().getIdade())/100;
		score=score+(7/100)*element.getTurnosEsperando();
		return score;
	}
	
}
