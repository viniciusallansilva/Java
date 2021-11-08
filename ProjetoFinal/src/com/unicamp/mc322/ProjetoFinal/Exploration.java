package com.unicamp.mc322.ProjetoFinal;

import java.util.ArrayList;

public class Exploration {
	private ArrayList<Island> islandList;
	private ArrayList<Island> visitedIsland;
	private ArrayList<Gate> gateList;
	
	public Exploration() {
		this.islandList=new ArrayList<Island>();
		this.visitedIsland=new ArrayList<Island>();
		this.gateList=new ArrayList<Gate>();
	}
}
