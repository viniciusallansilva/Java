package com.unicamp.mc322.lab13;

public class MyStrategy extends Strategy{
	
	public MyStrategy() {
		
	}
	
	@Override
	public double calcularScore(IOrder element) {
		//se a idade da pessoa for maior que 60, calcula um numero aleatorio entre 0 e 10
		//se a idade da pessoa for menor , calcul entre 10 e 100;
		
		double score=0;
		Aleatorio ale=new Aleatorio();
		if((element.getPeople().getIdade())>=60) {
			score=ale.getInt()*10;
		}
		else {
			score=ale.getInt();
		}
		return score;
	}

}
