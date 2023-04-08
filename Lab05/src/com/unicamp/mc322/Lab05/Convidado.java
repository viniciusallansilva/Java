package com.unicamp.mc322.Lab05;

public class Convidado {
	private String nome;
	private String email;
	private int telefone;
	
	public Convidado(String nome, String email, int telefone) {
		this.nome=nome;
		this.email=email;
		this.telefone=telefone;
	}
	
	public String getNome() {
		return this.nome;
	}
}
