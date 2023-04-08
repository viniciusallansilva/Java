package com.unicamp.mc322.lab13;

public class Order implements IOrder{
	private int turn;
	private PersonPT pessoa;
	private Codigo codigo;
	
	public Order(PersonPT nova) {
		this.turn=0;
		this.pessoa=nova;
		this.codigo=new Codigo();
	}
	
	@Override
	public void incrementaTurno() {
		this.turn+=1;
	}
	@Override
	public int getTurnosEsperando() {
		return this.turn;
	}
	@Override
	public Codigo getCodigoProduto() {
		return this.codigo;
	}
	@Override
	public void imprimeReduzido() {
		System.out.println("Nome: "+pessoa.getName()+"\n");
		this.codigo.printaCodigo();
	}
	@Override
	public void imprimeFull() {
		imprimeReduzido();
		System.out.println("CPF: "+this.pessoa.getCPF()+"\n");
		System.out.println("Idade: "+(this.pessoa.getIdade())+"\n");
	}
	@Override
	public PersonPT getPeople() {
		return this.pessoa;
	}
}
