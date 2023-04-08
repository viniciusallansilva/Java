package com.unicamp.mc322.Lab05;

public class Lembrete {
	private String descricao;
	
	public Lembrete() {
		String padrao="Adicione um lembrete";
		this.descricao=padrao;
	}
	
	public void setDescricao(String novaDescricao) {
		this.descricao=novaDescricao;
	}
	public void printaInformacao() {
		System.out.println("---DESCRICAO---");
		System.out.println(descricao);
		System.out.println("\n");
	}
}
