package com.unicamp.mc322.lab03;

class Room {
	private boolean quartoEhVip;
	private boolean quartoEstaOcupado;
	private boolean quartoAceitaFumante;
	private boolean quartoTemAr;
	
	public Room(boolean ehVip, boolean aceitaFumante, boolean temAr) {
		quartoEhVip=ehVip;
		quartoAceitaFumante=aceitaFumante;
		quartoTemAr=temAr;
	}
	
	public boolean getOcupacaoQuarto() {
		return this.quartoEstaOcupado;
	}
	
	public void setOcupacaoQuarto(boolean statusOcupacao) {
		this.quartoEstaOcupado=statusOcupacao;
	}
	
	public boolean getEhVip() {
		return this.quartoEhVip;
	}
	
	public boolean getFumante() {
		return this.quartoAceitaFumante;
	}
	
	public boolean getTemAr() {
		return this.quartoTemAr;
	}
}
