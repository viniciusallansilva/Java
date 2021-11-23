package com.unicamp.mc322.Movimento;

import com.unicamp.mc322.Estrutura.Position;

public class Bridge {
	private Position tip1;
	private Position tip2;
	
	public Bridge(Position tipOne, Position tipTwo) {
		this.tip1=tipOne;
		this.tip2=tipTwo;
	}
}
