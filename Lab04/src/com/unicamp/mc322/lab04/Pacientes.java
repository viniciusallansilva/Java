package com.unicamp.mc322.lab04;

public class Pacientes{
	private String nome;
	private String cpf;
	private Date birthday;
	private Position endereco;
	
	public Pacientes(String nome,String cpf, Date birthday, Position endereco) {
		this.nome=nome;
		this.cpf=cpf;
		this.birthday=birthday;
		this.endereco=endereco;
	}
	
	
	public void setNome(String novoNome) {
		this.nome=novoNome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setCpf(String novoCpf) {
		this.cpf=novoCpf;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public void setDate(Date novaDate) {
		this.birthday=novaDate;
	}
	
	public Date getDate() {
		return this.birthday;
	}
	
	public void setEndereco(Position novoEndereco) {
		this.endereco=novoEndereco;
	}
	
	public Position getEndereco() {
		return this.endereco;
	}
	
	public void printInformation() {
		System.out.println("Nome Paciente: "+this.nome+"\n");
		System.out.println("CPF Paciente: "+this.cpf+"\n");
		this.birthday.imprimeDate();
		this.endereco.imprimeEndereco();
		System.out.println("-----------------------------\n");
	}
}
