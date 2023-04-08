package com.unicamp.mc322.lab07;

import java.util.ArrayList;

public class AirPoo {
	private ArrayList<Residencia> listaResidencia;
	private ArrayList<Experiencia> listaExperiencia;
	private ArrayList<PontosInteresse> listaInteresses;
	private ArrayList<Identificador> listaIdentificador;
	private ArrayList<Reserva> listaReserva;
	
	
	public AirPoo() {
		this.listaResidencia= new ArrayList<Residencia>();
		this.listaExperiencia=new ArrayList<Experiencia>();
		this.listaInteresses= new ArrayList<PontosInteresse>();
		this.listaIdentificador= new ArrayList<Identificador>();
		this.listaReserva=new ArrayList<Reserva>();
	}
	
	public void addPontoInteresse(String nome,Posicao endereco) {
		listaInteresses.add(new PontosInteresse(nome, endereco));
	}
	
	public void addApartamento(Apartamento novo) {
		Identificador tag=new Identificador();
		while(procuraIdentificador(tag.getTag())) {
			tag=new Identificador();
		}
		novo.setTag(tag);
		listaResidencia.add(novo);
	}
	
	public void addCasa(Casa nova) {
		Identificador tag=new Identificador();
		while(procuraIdentificador(tag.getTag())) {
			tag=new Identificador();
		}
		nova.setTag(tag);
		listaResidencia.add(nova);
	}
	
	public void addMansao(Mansao nova) {
		Identificador tag=new Identificador();
		while(procuraIdentificador(tag.getTag())) {
			tag=new Identificador();
		}
		nova.setTag(tag);
		listaResidencia.add(nova);
	}
	
	public void addRedes(Redes nova) {
		Identificador tag=new Identificador();
		while(procuraIdentificador(tag.getTag())) {
			tag=new Identificador();
		}
		nova.setTag(tag);
		listaResidencia.add(nova);
	}
	
	public void addExperiencia(Experiencia novaExp) {
		Identificador tag=new Identificador();
		while(procuraIdentificador(tag.getTag())) {
			tag=new Identificador();
		}
		novaExp.setTag(tag);
		listaExperiencia.add(novaExp);
	}
	
	public void addReservas(Reserva novaReserva) {
		listaReserva.add(novaReserva);
	}
	
	public Reserva criaReserva(String nome, int numDias, int numPessoas, int numMenores) {
		Residencia nova= encontraResidencia(nome);
		Experiencia novaExp=encontraExperiencia(nome);
		if(nova!=null) {
			return nova.criaReserva(numPessoas, numMenores, numDias);
		}
		else if (novaExp!=null){
			return novaExp.criaReserva(numPessoas, numMenores, numDias);
		}
		else {
			System.out.println("Impossivel realizar reserva, local nao encontrado\n");
			return null;
		}
		
	}
	
	public void imprimeInformacoes() {
		System.out.println("-----RESIDENCIAS-----\n");
		for(int i=0;i<listaResidencia.size();i++) {
			listaResidencia.get(i).imprimeInfo(listaInteresses);
			System.out.println("-------------------------\n");
		}
		System.out.println("-----EXPERIENCIA-----\n");
		for(int j=0;j<listaExperiencia.size();j++) {
			listaExperiencia.get(j).imprimeInfo(listaInteresses);
		}
		System.out.println("-----PONTOS DE INTERESSE-----\n");
		for(int k=0;k<listaInteresses.size();k++) {
			listaInteresses.get(k).printaInfo();
		}
	}
	
	
	private boolean procuraIdentificador(String tagAtual) {
		for(int i=0;i<listaIdentificador.size();i++) {
			if(listaIdentificador.get(i).identificadorEhIgual(tagAtual)) {
				return true;
			}
		}
		return false;
	} 
	
	private Residencia encontraResidencia(String nome) {
		for(int i=0;i<listaResidencia.size();i++) {
			if(this.listaResidencia.get(i).getNome().equals(nome)) {
				return this.listaResidencia.get(i);
			}
		}
		return null;
	}
	
	private Experiencia encontraExperiencia(String nome) {
		for(int i=0;i<listaExperiencia.size();i++) {
			if(this.listaExperiencia.get(i).getNome().equals(nome)) {
				return this.listaExperiencia.get(i);
			}
		}
		return null;
	}
}
