package com.unicamp.mc322.Movimento;

import java.lang.Math;

import java.util.ArrayList;

import com.unicamp.mc322.Animacoes.*;
import com.unicamp.mc322.Estrutura.*;

public class Island {
	private final static int TAM_MAXIMO_ILHA=10;
	private Position rightUp;
	private Position leftDown;
	private Position pontoNascimento;
	
	private Type IslandType;
	private int floorQuantity; 
	
	private ArrayList<Position> pontosComecaPonte;
	
	public Island(Position newRightUp, Position newLeftDown,Type newType,int floor) {
		this.rightUp=newRightUp;
		this.leftDown=newLeftDown;
		this.IslandType=newType;
		this.floorQuantity=floor;
		this.pontosComecaPonte=new ArrayList<Position>();
		this.pontoNascimento=pontoMedio();
	}
	
	public Island(Position newRightUp,Type newType,int floor) {
		this.rightUp=newRightUp;
		this.leftDown=geraOutroPontoProximo(newRightUp);
		this.IslandType=newType;
		this.floorQuantity=floor;
		this.pontosComecaPonte=new ArrayList<Position>();
		this.pontoNascimento=pontoMedio();
	}
	
	public boolean pointBelongIsland(Position point) {
		if((point.getX()>this.leftDown.getX() && point.getX()<this.rightUp.getX())){
			if(point.getY()>this.leftDown.getY() && point.getY()<this.rightUp.getY()) {
				return true;
			}
		}
		return false;
	}
	
	public int tamanhoArrayPontoPonte() {
		return this.pontosComecaPonte.size();
	}
	
	public Position getPontoPonteIlha(int indice) {
		return this.pontosComecaPonte.get(indice);
	}
	
	
	private Position geraOutroPontoProximo(Position primeiro) {
		//nova posicao tem que ser menor que 10 e menor que a primeira
		Position novo=new Position();
		while((Math.abs(novo.getX()-primeiro.getX())<TAM_MAXIMO_ILHA)&&(novo.getX()>=primeiro.getX())) {
			novo.geraNovaPosicao();
		}
		while((Math.abs(novo.getY()-primeiro.getY())<TAM_MAXIMO_ILHA)&&(novo.getY()>=primeiro.getY())) {
			novo.geraNovaPosicao();
		}
		return novo;
	}
	
	public void geraPontoBordaIlha() {
		Aleatorio ale=new Aleatorio();
		double x=0;
		double y=0;
		int number=ale.getNumber(4);
		if(number==0) {
			x=this.leftDown.getX();
			y=ale.getNumber(this.rightUp.getY()-this.leftDown.getY())+this.leftDown.getY();
			Position nova=new Position(x,y);
			this.pontosComecaPonte.add(nova);
		}
		if(number==1) {
			y=this.leftDown.getY();
			x=ale.getNumber(this.rightUp.getX()-this.leftDown.getX())+this.leftDown.getX();
			Position nova=new Position(x,y);
			this.pontosComecaPonte.add(nova);
		}
		if(number==2) {
			x=this.rightUp.getX();
			y=ale.getNumber(this.rightUp.getY()-this.leftDown.getY())+this.leftDown.getY();
			Position nova=new Position(x,y);
			this.pontosComecaPonte.add(nova);
		}
		if(number==3) {
			y=this.rightUp.getY();
			x=ale.getNumber(this.rightUp.getX()-this.leftDown.getX())+this.leftDown.getX();
			Position nova=new Position(x,y);
			this.pontosComecaPonte.add(nova);
		}
	}
	
	private Position pontoMedio() {
		return new Position((this.rightUp.getX()+this.leftDown.getX())/2,(this.rightUp.getY()+this.leftDown.getY())/2);
	}
	
	private void printaIsland() {
		this.rightUp.printPosition();
		this.leftDown.printPosition();
		System.out.println(this.IslandType);
	}
	
	public void addPontoComecaPonte(Position ponto) {
		this.pontosComecaPonte.add(ponto);
	}
	public boolean ehPossivelAndar(Player jogador) {
		Position point=jogador.getPosition();
		point.setX(point.getX()+1);
		if(pointBelongIsland(point)==false) {
			System.out.println("Chegou no extremo direito da ilha, impossível mover, escolha outra opcao\n");
			return false;
		}
		point.setX(point.getX()-2);
		if(pointBelongIsland(point)==false) {
			System.out.println("Chegou no extremo esquerdo da ilha, impossível mover, escolha outra opcao\n");
			return false;
		}
		point.setX(point.getX()+1);
		point.setX(point.getY()+1);
		if(pointBelongIsland(point)==false) {
			System.out.println("Chegou no máximo da ilha, impossível subir, escolha outra opcao\n");
			return false;
		}
		point.setX(point.getY()-2);
		if(pointBelongIsland(point)==false) {
			System.out.println("Chegou no mínimo da ilha, impossível descer, escolha outra opcao\n");
			return false;
		}
		point.setX(point.getY()+1);
		return true;
	}
}
