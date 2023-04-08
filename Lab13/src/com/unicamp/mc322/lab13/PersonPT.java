package com.unicamp.mc322.lab13;

import java.time.LocalDate;

public class PersonPT {
	private LocalDate data;
	private String cpf;
	private String name;
	
	public PersonPT(LocalDate nova,String cpf,String nome) {
		this.data=nova;
		this.cpf=cpf;
		this.name=nome;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getCPF() {
		return this.cpf;
	}
	
	public int getIdade() {
		return (2021-this.data.getYear());
	}
}
