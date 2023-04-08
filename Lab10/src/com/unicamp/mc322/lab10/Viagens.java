package com.unicamp.mc322.lab10;

import java.util.ArrayList;

public class Viagens {
	private int distanciaTotal;
	private ArrayList<Passageiro> passageirosNoCarro;
	private Motorista moto;
	private Veiculo carro;
	private boolean viagemFinalizada;
	private double precoTotal;
	private int paradasRestantes;
	private Summary relatio;
	
	public Viagens(Passageiro pass, Motorista motorista, Veiculo carro, int distancia, int quantidadeParadas) {
		this.passageirosNoCarro=new ArrayList<Passageiro>();
		this.carro=carro;
		this.viagemFinalizada=false;
		this.distanciaTotal=distancia;
		this.passageirosNoCarro.add(pass);
		this.precoTotal=0;
		this.paradasRestantes=quantidadeParadas;
		this.relatio=new Summary(pass,motorista,carro,distancia,quantidadeParadas);
		this.calculaPrecoInicial();
	}
	
	public Viagens(Passageiro pass, Passageiro pass2,Motorista motorista, Veiculo carro, int distancia,int quantidadeParadas) {
		this.passageirosNoCarro=new ArrayList<Passageiro>();
		this.carro=carro;
		this.viagemFinalizada=false;
		this.distanciaTotal=distancia;
		this.passageirosNoCarro.add(pass);
		this.passageirosNoCarro.add(pass2);
		this.precoTotal=0;
		this.paradasRestantes=quantidadeParadas;
		this.relatio=new Summary(pass, pass2,motorista, carro,distancia,quantidadeParadas);
		this.calculaPrecoInicial();
	}
	
	public void finalizaViagem() {
		if(this.paradasRestantes==0) {
			this.viagemFinalizada=true;
			this.relatio.setPrecoTotal(this.precoTotal);
			this.relatio.imprimeRelatiorio();
			
		}
		else {
			System.out.println("Nao chegou ao final da viagem, ainda falta "+this.paradasRestantes+" paradas!\n");
		}
	}
	public void sobePassageiro(Passageiro subindo) {
		this.passageirosNoCarro.add(subindo);
		this.relatio.addPassageiro(subindo);
	}
	
	public void descePassageiro(Passageiro descendo) {
		this.passageirosNoCarro.remove(descendo);
	}
	
	public void executarParada() {
		if(this.paradasRestantes==0) {
			System.out.println("Ja foram realizadas todas paradas\n");
		}
		else{
			this.paradasRestantes--;
			this.precoTotal+=this.carro.getPrecoParada();
		}
	}
	
	public void calculaPrecoInicial() {
		this.precoTotal+=this.carro.getPreco();
		double auxiliar=(this.distanciaTotal-100)*this.carro.getPrecoAdicional();
		this.precoTotal+=auxiliar;
	}
}
