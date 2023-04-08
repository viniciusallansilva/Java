package com.unicamp.mc322.lab04;

public class Reserva {
	private String cpf;
	private Date data;
	private String nomePosto;
	
	public Reserva(String cpf,Date data,String nomePosto) {
		this.cpf=cpf;
		this.data=data;
		this.nomePosto=nomePosto;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public void imprimeReserva() {
		System.out.println("---AGENDAMENTO---");
		System.out.println("CPF: "+this.cpf+"\n");
		this.data.imprimeDate();
		System.out.println("Nome Posto: "+this.nomePosto);
		System.out.println("--------------------");
	}
}
