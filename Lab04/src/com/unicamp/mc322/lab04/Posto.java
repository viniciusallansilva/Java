package com.unicamp.mc322.lab04;

public class Posto {
	private static final int MAX_DIAS_VACINACAO_POSTO = 3;
	
	private String nome;
	private Position endereco;
	private int maximoVagasDiaria;
	private DiaVacinacao[] listaDeDias;
	
	public Posto(String nome,Position endereco,int maximoVagas) {
		this.nome=nome;
		this.endereco=endereco;
		this.maximoVagasDiaria=maximoVagas;
		this.listaDeDias=new DiaVacinacao[MAX_DIAS_VACINACAO_POSTO];
		for(int i=0;i<this.listaDeDias.length;i++) {
			listaDeDias[i]=null;
		}
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public Position getEndereco() {
		return this.endereco;
	}
	
	public void addDiasVacinacao(DiasSemana dia,Date data) {
		this.listaDeDias[retornaIndiceVazioDias(listaDeDias)]=new DiaVacinacao(dia, this.maximoVagasDiaria,data);
		
	}
	
	public void incrementaVacinaDia(int indice) {
		if(this.listaDeDias[indice].getNumAtendidos()==this.maximoVagasDiaria) {
			System.out.println("Numero atendimento chegou ao seu limite diario\n");
		}
		else {
			this.listaDeDias[indice].incrementaVacinacao();
		}
	}
	
	public void setDiaSemana(DiasSemana dia,int indice) {
		this.listaDeDias[indice].setDia(dia);
	}
	
	public void deleteDiaSemana(DiasSemana dia) {
		boolean diaExiste=false;
		for(int i=0;i<this.listaDeDias.length;i++) {
			if(this.listaDeDias[i].getDia().equals(dia)) {
				diaExiste=true;
				this.listaDeDias[i]=null;
			}
		}
		if(diaExiste==false) {
			System.out.println("Dia não existe\n");
		}
	}
	
	public void printInformation() {
		System.out.println("Nome Posto de Saúde: "+this.nome+"\n");
		this.endereco.imprimeEndereco();
		System.out.println("Dias de funcionamento:\n");
		for(int i=0;i<retornaIndiceVazioDias(listaDeDias);i++) {
			listaDeDias[i].printaDia();
			System.out.println(listaDeDias[i].retornaVagasDisponiveis()+" vagas disponiveis nesses dia\n");
		}
		System.out.println("------------------\n");
		
	}
	
	public Date retornaVagaMaisProxima() {
		for(int i=0;i<retornaIndiceVazioDias(listaDeDias);i++) {
			if(listaDeDias[i].retornaVagasDisponiveis()>0) {
				return listaDeDias[i].getData();
			}
		}
		return null;
	}
	
	private int retornaIndiceVazioDias(DiaVacinacao[] lista) {
		for(int i=0;i<lista.length;i++) {
			if(lista[i]==null) {
				return i;
			}
		}
		return 0;
	
	}
}
