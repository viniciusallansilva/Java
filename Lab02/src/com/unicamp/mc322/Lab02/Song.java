package com.unicamp.mc322.Lab02;

class Song {
	private String nomeMusica;
	private String generoMusica;
	private String artistaMusica;
	private float tempoMusica;
	
	Song(String nomeDaMusica, String generoDaMusica, String artista, float tempoDaMusica) {
		nomeMusica=nomeDaMusica;
		generoMusica=generoDaMusica;
		artistaMusica=artista;
		tempoMusica=tempoDaMusica;
	}
	
	String getNomeMusica() {
		return this.nomeMusica;
	}
	
	float getTempoMusica() {
		return this.tempoMusica;
	}
	
	String getGenMusica() {
		return this.generoMusica;
	}
	
	String getArtistaMusica() {
		return this.artistaMusica;
	}
		
	void editarNomeMusica(String novoNome) {
		this.nomeMusica=novoNome;
	}
		
	void editarGeneroMusica(String novoGenero) {
		this.generoMusica=novoGenero;
	}
		
	void editarArtistaMusica(String novoArtista) {
		this.artistaMusica=novoArtista;
	}
		
	void editarTempoMusica(float novoTempo) {
		this.tempoMusica=novoTempo;
	}
		
}
