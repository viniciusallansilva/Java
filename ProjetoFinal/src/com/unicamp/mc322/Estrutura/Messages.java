package com.unicamp.mc322.Estrutura;

public class Messages {
	private String frase1;
	private String frase2;
	private String frase3;
	private String frase4;
	
	public Messages() {
		
	}
	
	public void printMessages() {
		System.out.println("1: "+frase1+"\n");
		System.out.println("2: "+frase2+"\n");
		System.out.println("3: "+frase3+"\n");
		System.out.println("4: "+frase4+"\n");
		System.out.println("end para finalizar o jogo\n");
	}
	
	public void updateMessages(String s1,String s2,String s3,String s4) {
		this.frase1=s1;
		this.frase2=s2;
		this.frase3=s3;
		this.frase4=s4;
	}
}
