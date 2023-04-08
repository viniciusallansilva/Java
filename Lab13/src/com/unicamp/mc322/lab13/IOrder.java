package com.unicamp.mc322.lab13;

public interface IOrder {
	
	public void incrementaTurno();
	public int getTurnosEsperando();
	public Codigo getCodigoProduto();
	public void imprimeReduzido();
	public void imprimeFull();
	public PersonPT getPeople();
}
