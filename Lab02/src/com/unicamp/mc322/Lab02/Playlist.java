package com.unicamp.mc322.Lab02;

import java.util.ArrayList;

class Playlist {
	private String nomePlaylist;
	private String generoPlaylist;
	private ArrayList<Song>	lista_de_musica= new ArrayList<Song>();
	private int indiceOndeParouMusica;
	
	int quantasMusicas() {
		return this.lista_de_musica.size();
	}
		
	
	Playlist(String nomeDaPlaylist, String generoDaPlaylist) {
		nomePlaylist=nomeDaPlaylist;
		generoPlaylist=generoDaPlaylist;
		indiceOndeParouMusica=0;
	}
	
	
	
	
	String getNomePlaylist() {
		return this.nomePlaylist;
	}
	
	
	
	
	
	String getGeneroPlaylist() {
		return this.generoPlaylist;
	}
	
	
	
	
	void addSong(Song novoSong) {
		this.lista_de_musica.add(novoSong);
	}
	
	
	
	
	void removerMusica(Song musicaParaRemover) {
		if(this.lista_de_musica.contains(musicaParaRemover)) {
			this.lista_de_musica.remove(musicaParaRemover);
		}
		else {
			System.out.println("Essa música não existe na PlayList\n");
		}
	}
	
	
	
	
	Song menorMusica() {
		float menorTempo=this.lista_de_musica.get(0).getTempoMusica();
		float tempoComparacao;
		Song menorSom;
		menorSom=this.lista_de_musica.get(0);
		for(int i=0;i<this.lista_de_musica.size();i++) {
			tempoComparacao=this.lista_de_musica.get(i).getTempoMusica();
			if(tempoComparacao<menorTempo) {
				menorTempo=tempoComparacao;
				menorSom=this.lista_de_musica.get(i);			
			}
		}
		return menorSom;
	}
	
	
	
	Song maiorMusica() {
		float maiorTempo=this.lista_de_musica.get(0).getTempoMusica();
		float tempoComparacao;
		Song maiorSom=this.lista_de_musica.get(0);
		for(int i=0;i<quantasMusicas();i++) {
			tempoComparacao=this.lista_de_musica.get(i).getTempoMusica();
			if(tempoComparacao>maiorTempo) {
				maiorTempo=tempoComparacao;
				maiorSom=this.lista_de_musica.get(i);			
			}
		}
		return maiorSom;
	}
	
	
	
	
	float tempoMedio() {
		float tempoMedio=0;
		for(int i=0;i<quantasMusicas();i++) {
			tempoMedio=tempoMedio+this.lista_de_musica.get(i).getTempoMusica();
		}
		tempoMedio=tempoMedio/this.lista_de_musica.size();
		return tempoMedio;
	}
	
	
	
	
	float tempoTotal() {
		float tempoTotal=0;
		for(int i=0;i<quantasMusicas();i++) {
			tempoTotal=tempoTotal+this.lista_de_musica.get(i).getTempoMusica();
		}
		return tempoTotal;
	}
	
	
	
	
	String artistaComMaisMusica() {
		if(quantasMusicas()==0) {
			System.out.println("Lista Vazia\n");
			return null;
		}
		String artistaMaisMusica=this.lista_de_musica.get(0).getArtistaMusica();
		int maiorSomaDeMusica=0;
		String artistaVerificado;
		int somaDeMusica=0;
		for(int i=0;i<quantasMusicas();i++) {
			artistaVerificado=this.lista_de_musica.get(i).getArtistaMusica();
			somaDeMusica=0;
			for(int j=0;j<quantasMusicas();j++) {
				if(this.lista_de_musica.get(j).getArtistaMusica()==artistaVerificado) {
					somaDeMusica++;
				}
				if(j==quantasMusicas() && somaDeMusica>maiorSomaDeMusica) {
					maiorSomaDeMusica=somaDeMusica;
					artistaMaisMusica=artistaVerificado;
				}
			}
		}
		return artistaMaisMusica;
	}
	
	void printaNomesMusicas() {
		System.out.println("Songs:\n");
		for(int i=0;i<quantasMusicas();i++) {
			System.out.println("-"+this.lista_de_musica.get(i).getNomeMusica()+"-"+this.lista_de_musica.get(i).getArtistaMusica()+"\n");
		}
	}
	
	
	
	
	Song play(boolean suffle) {
		while(suffle==true && quantasMusicas()!=0) {
			int random = 0 + (int) (Math.random() * quantasMusicas());		
			Song musicaAleatoria=this.lista_de_musica.get(random);
			if(musicaAleatoria!=this.lista_de_musica.get(indiceOndeParouMusica)) {
				return musicaAleatoria;
			}
		}
		this.indiceOndeParouMusica++;
		if(this.indiceOndeParouMusica==quantasMusicas()) {
			this.indiceOndeParouMusica=0;
		}
		return this.lista_de_musica.get(indiceOndeParouMusica);
	}
		
}
