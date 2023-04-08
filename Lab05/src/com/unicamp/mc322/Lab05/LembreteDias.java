package com.unicamp.mc322.Lab05;

import java.time.*;
import java.util.*;

public class LembreteDias extends Lembrete{
	private final int MAX_DIA_SEMANA=7;
	private final int MIN_DIA_SEMANA=1;
	private ArrayList<DayOfWeek> listaDeDias = new ArrayList();
	
	public LembreteDias() {
		this.listaDeDias.add(LocalDateTime.now().getDayOfWeek());
	}
	
	public void addDia(DayOfWeek novoDia) {
		if(listaDeDias.size()<MAX_DIA_SEMANA) {
			boolean diaEncontrado=false;
			for(int i=0;i<this.listaDeDias.size();i++) {
				if(this.listaDeDias.get(i).equals(novoDia)) {
					diaEncontrado=true;
				}
			}
			if(diaEncontrado=false) {
				listaDeDias.add(novoDia);
			}
		}
		else{
			System.out.println("Ja foram selecionados todos dias da semana\n");
		}
	}
	
	public void removeDia(DayOfWeek dia) {
		if(listaDeDias.size()>MIN_DIA_SEMANA) {
			boolean diaEncontrado=false;
			for(int i=0;i<this.listaDeDias.size();i++) {
				if(this.listaDeDias.get(i).equals(dia)) {
					this.listaDeDias.remove(i);
					diaEncontrado=true;
				}
				
			}
			if(diaEncontrado=false) {
				System.out.println("O dia ha ser removido nao estava selecionado\n");
			}
		}
		else {
			System.out.println("E necessario que o lembrete seja vinculado a pelos menos 1 dia\n");
		}
		
	}
	
	@Override
	public void printaInformacao() {
		super.printaInformacao();
		System.out.println("Repetira nos dias: ");
		for(int i=0;i<listaDeDias.size();i++) {
			System.out.println(listaDeDias.get(i)+" ");
		}
		System.out.println("\n");
	}
}
