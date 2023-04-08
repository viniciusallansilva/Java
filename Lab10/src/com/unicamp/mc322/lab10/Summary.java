package com.unicamp.mc322.lab10;

import java.util.ArrayList;

public class Summary {
	private ArrayList<Passageiro> todosPassageiros;
	private Motorista moto;
	private int distanciaTotal;
	private int paradas;
	private double precoFinal;
	private Veiculo carro;
	
	public Summary(Passageiro pass, Motorista moto, Veiculo car, int distanciaTotal, int paradas ) {
		this.todosPassageiros=new ArrayList<Passageiro>();
		this.carro=car;
		this.todosPassageiros.add(pass);
		this.moto=moto;
		this.distanciaTotal=distanciaTotal;
		this.paradas=paradas;
	}
	
	public Summary(Passageiro pass,Passageiro pass2, Motorista moto, Veiculo car, int distanciaTotal, int paradas ) {
		this.todosPassageiros=new ArrayList<Passageiro>();
		this.carro=car;
		this.todosPassageiros.add(pass);
		this.todosPassageiros.add(pass2);
		this.moto=moto;
		this.distanciaTotal=distanciaTotal;
		this.paradas=paradas;
	}
	
	public void addPassageiro(Passageiro pass) {
		this.todosPassageiros.add(pass);
	}
	
	public void setPrecoTotal(double precoTotal) {
		this.precoFinal=precoTotal;
	}
	
	public void imprimeRelatiorio() {
		System.out.println("------VIAGEM FINALIZADA-----\n");
		System.out.println("Obrigado por utilizar nossos serviços\n");
		System.out.println("RELATORIO:\n");
		for(int i=0;i<this.todosPassageiros.size();i++) {
			this.todosPassageiros.get(i).imprimeInformacoes();
		}
		this.moto.imprimeInformacoes();
		System.out.println("Distancia da viagem: "+this.distanciaTotal+"\n");
		System.out.println("Quantidade de Paradas: "+this.paradas+"\n");
		System.out.println("Preco final: "+this.precoFinal+"\n");
	}
	

}
