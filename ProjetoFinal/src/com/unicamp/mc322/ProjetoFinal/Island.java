package com.unicamp.mc322.ProjetoFinal;

import java.util.ArrayList;

public class Island {
	private Position rightUp;
	private Position leftDown;
	
	private ArrayList<Bridge> bridgeList;
	private ArrayList<Elevator> elevatorList;
	private ArrayList<Pokemon> pokemonList;
	private ArrayList<Items> itemsList;
	private Type IslandType;
	private int floorQuantity; 
	
	public Island(Position newRightUp, Position newLeftDown,Type newType,int floor) {
		this.bridgeList=new ArrayList<Bridge>();
		this.elevatorList=new ArrayList<Elevator>();
		this.pokemonList=new ArrayList<Pokemon>();
		this.itemsList=new ArrayList<Items>();
		this.rightUp=newRightUp;
		this.leftDown=newLeftDown;
		this.IslandType=newType;
		this.floorQuantity=floor;
	}
	
	public boolean pointBelongIsland(Position point) {
		if((point.getX()>this.leftDown.getX() && point.getX()<this.rightUp.getX())){
			if(point.getY()>this.leftDown.getY() && point.getY()<this.rightUp.getY()) {
				return true;
			}
		}
		return false;
	}
	
	
	
	public void addBrigde(Bridge newbridge) {
		this.bridgeList.add(newbridge);
	}
	
	public void addElevator(Elevator newElevator) {
		this.elevatorList.add(newElevator);
	}
	
	private boolean pointBelongEdge() {
		return true;
		//desenvolver
	}
}
