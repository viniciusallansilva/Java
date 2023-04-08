package com.unicamp.mc322.lab13;

import java.util.ArrayList;

public class CrazyDS implements ICrazyDS {
	private Strategy atualStrategy;
	private ArrayList<IOrder> listOrder;
	
	
	public CrazyDS(Strategy novo) {
		this.atualStrategy=novo;
		this.listOrder=new ArrayList<IOrder>();
		this.listOrder.clear();
	}
	
	@Override
	public void addElement(IOrder novo) {
		this.listOrder.add(novo);
	}
	@Override
	public void removeElemento(IOrder element) {
		if(this.listOrder.size()==0) {
			throw new CrazyDSException();
		}
		this.listOrder.remove(element);
	}
	@Override
	public IOrder peekElement() {
		maiorScore();
		if(this.listOrder.size()==0) {
			throw new CrazyDSException();
		}
		return maiorScore();
	}
	@Override
	public void printElements() {
		for(int i=0;i<this.listOrder.size();i++) {
			this.listOrder.get(i).imprimeReduzido();
		}
	}
	
	public IOrder getElementAt(int indice) {
		if(this.listOrder.size()<indice) {
			throw new CrazyDSException();
		}
		return this.listOrder.get(indice);
	}
	
	private IOrder maiorScore() {
		IOrder p1=this.listOrder.get(0);
		if(this.listOrder.size()==0) {
			throw new CrazyDSException();
		}
		for(int i=1;i<this.listOrder.size();i++) {
			if(this.atualStrategy.calcularScore(p1)<this.atualStrategy.calcularScore(this.listOrder.get(i))) {
				p1=this.listOrder.get(i);
			}
		}
		return p1;
	}
}
