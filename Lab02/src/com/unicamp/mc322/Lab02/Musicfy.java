package com.unicamp.mc322.Lab02;

public class Musicfy {
	public static void main(String[] args) {
		User user1 = new User("Marcos Paulo", "777.777.777-77", "09/01/1999", "Masculino", true);
		User user2 = new User("Cookiezi", "111.111.11-11", "09/01/1999", "Masculino", false);
		User vini= new User("Vinicius Allan da Silva","478-424-428-00","09/01/1999", "Masculino", false);
		
		Song song1 = new Song("Seven Nation Army", "Rock", "The White Stripes", 100);
		Song song2 = new Song("Crazy Train", "Rock", "Ozzy Osbourne", 90);
		Song song3 = new Song("Feels", "Pop", "Calvin Harris", 80);
		Song song4 = new Song("Roar", "Pop", "Katy Perry", 70);
		Song song5 = new Song("Anima", "Hardcore", "Xi", 60);
		Song song6 = new Song("Freedom Dive", "Hardcore", "Xi", 50);
		Song song7 = new Song("Teo", "Hardcore", "Omoi", 40);
		Song song8 = new Song("Sleepwalking", "Metalcore", "Bring Me The Horizon", 30);
		
		Playlist rockPlaylist = new Playlist("Awesome Rock Songs", "Rock");
		rockPlaylist.addSong(song1);
		rockPlaylist.addSong(song2);
		rockPlaylist.addSong(song3);
		rockPlaylist.addSong(song4);
		
		Playlist osuPlaylist = new Playlist("Osu Memories", "hardcore");
		osuPlaylist.addSong(song5);
		osuPlaylist.addSong(song6);
		osuPlaylist.addSong(song7);
		
		Playlist metalcorePlaylist = new Playlist("Best of Metalcore", "Metalcore");
		metalcorePlaylist.addSong(song8);
		

		user1.addPlaylist(rockPlaylist);
		user1.addPlaylist(metalcorePlaylist);
		user2.addPlaylist(osuPlaylist);
		
		user1.showPlaylists();
		System.out.println("");
		user2.showInformation();
		System.out.println("");
		vini.showInformation();
		System.out.println("");
		vini.showPlaylists();
		System.out.println("");
      
		Song asong1 = osuPlaylist.play(false);
		Song asong2 = osuPlaylist.play(true);
		Song asong3 = osuPlaylist.play(true);
		
		song1.editarTempoMusica(110);
		song2.editarArtistaMusica("Michael Jacson");
		song3.editarGeneroMusica("Gospel");
		song4.editarNomeMusica("É O AMOR");
		
		Song menorMusica=rockPlaylist.menorMusica();
		Song maiorMusica=rockPlaylist.maiorMusica();
		float tempoMedio=rockPlaylist.tempoMedio();
		float tempoTotal=rockPlaylist.tempoTotal();
		
		String artistaComMaisMusica=rockPlaylist.artistaComMaisMusica();
		
	}
}
