package com.unicamp.mc322.lab03;

class User {
	private String nome;
	private String cpf;
	private String data;
	private String genero;
	private float saldo;
	private float valorPago;
	private boolean eFumante;
	
	public User(String nomeUser,String cpfUser, String dataUser, String geneUser, float saldoUser, boolean fumante) {
		this.nome=nomeUser;
		this.cpf=cpfUser;
		this.data=dataUser;
		this.genero=geneUser;
		this.saldo=saldoUser;
		this.eFumante=fumante;
		this.valorPago=0;
	}
	
	public void setValorPago(float valor) {
		this.valorPago=valor;
	}
	
	public float getValorPago() {
		return this.valorPago;
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
	
	public void setData(String novaData) {
		this.data=novaData;
	}
	
	public String getData() {
		return this.data;
	}
	
	public void setGenero(String novoGenero) {
		this.genero=novoGenero;
	}
	
	public String getGenero() {
		return this.genero;
	}
	
	public void setSaldo(float novoSaldo) {
		this.saldo=novoSaldo;
	}
	
	public float getSaldo() {
		return this.saldo;
	}
	
	public void setFumante(boolean novoFumante) {
		this.eFumante=novoFumante;
	}
	
	public boolean getFumante() {
		return this.eFumante;
	}
	
	public void imprimeInformacoes() {
		System.out.println("Nome: "+getNome()+"\n");
		System.out.println("CPF: "+getCpf()+"\n");
		System.out.println("Data de nascimento: "+getData()+"\n");
		System.out.println("Genero: "+getGenero()+"\n");
		System.out.println("Saldo na conta: R$ "+getSaldo()+"\n");
		System.out.println("E fumante? "+getFumante()+"\n");
	}
}
