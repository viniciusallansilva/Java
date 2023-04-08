package com.unicamp.mc322.Lab02;

import java.util.ArrayList;

public class User {
	private String nomeUser;
	private String cpfUser;
	private String dataUser;
	private String generoUser;
	private boolean eh_assinante;
	private ArrayList<Playlist>	minha_lista= new ArrayList<Playlist>();
	private int tamanhoLista;
	
	User(String nomeDoUsuario,String cpfDoUsuario, String dataDoUsuario, String generoDoUsuario, boolean se_eh_assinante) {
		nomeUser=nomeDoUsuario;
		cpfUser=cpfDoUsuario;
		dataUser=dataDoUsuario;
		generoUser=generoDoUsuario;
		eh_assinante=se_eh_assinante;
		tamanhoLista=0;
	}
	
	void addPlaylist(Playlist novaPlaylist) {
		if(eh_assinante==true && tamanhoLista<10) {
			this.minha_lista.add(novaPlaylist);
		}
		else if (eh_assinante==false && tamanhoLista<3){
			this.minha_lista.add(novaPlaylist);
		}
		else {
			System.out.println("Não é possível adicionar uma Nova Playlist\n");
		}
	}
	
	void removePlaylist(Playlist tirarPlaylist) {
		for(int i=0;i<this.minha_lista.size();i++) {
			if(this.minha_lista.get(i)==tirarPlaylist) {
				this.minha_lista.remove(i);
			}
		}
	}
		
	void tranferirPlaylist(User outroUsuario, int indicePlaylist) {
		outroUsuario.minha_lista.add(this.minha_lista.get(indicePlaylist));
	}
		
	void fazerAssinatura() {
		if(this.eh_assinante=true) {
			System.out.println("Usuário: " + this.nomeUser + "Já é assinante!");
		}
		else {
			this.eh_assinante=true;
		}
	}
		
	void cancelarAssinatura() {
		if(this.eh_assinante==false) {
			System.out.println("Usuário: "+ this.nomeUser + "Não tem assinatura!");
		}
		else {
			this.eh_assinante=false;
		}
	}
	
	
	void showPlaylists() {
		System.out.println("User: "+this.nomeUser+"\n");
		System.out.println("Number of Playlists: "+this.minha_lista.size()+"\n");
		int indice=0;
		for(int i=0;i<this.minha_lista.size();i++) {
			indice=i+1;
			System.out.println("Playlist "+indice+": "+ this.minha_lista.get(i).getNomePlaylist()+"\n");
			System.out.println("Number of Songs: "+ this.minha_lista.get(i).quantasMusicas()+"\n");
			if(this.minha_lista.get(i).quantasMusicas()>0) {
				this.minha_lista.get(i).printaNomesMusicas();
			}
		}
	}
	
	void showInformation() {
		System.out.println("Nome: " + this.nomeUser +"\n");
		System.out.println("CPF: " + this.cpfUser +"\n");
		System.out.println("Data de Nascimento: " + this.dataUser +"\n");
		System.out.println("Gênero: " + this.generoUser +"\n");
		if(this.eh_assinante) {
			System.out.println("Possui Assinatura?: Sim\n");
		}
		else {
			System.out.println("Possui Assinatura?: Não\n");
		}
		
	}
}
