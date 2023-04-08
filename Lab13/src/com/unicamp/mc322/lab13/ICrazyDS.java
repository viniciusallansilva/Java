package com.unicamp.mc322.lab13;

public interface ICrazyDS {

	public void addElement(IOrder novo);
	public void removeElemento(IOrder element);
	public IOrder peekElement();
	public void printElements();
	public IOrder getElementAt(int indice);
}
