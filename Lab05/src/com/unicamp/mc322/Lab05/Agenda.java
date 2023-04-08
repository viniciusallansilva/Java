package com.unicamp.mc322.Lab05;

import java.time.*;
import java.util.*;

public class Agenda {
	private LocalDateTime hoje;
	private ArrayList<Lembrete> listaLembrete = new ArrayList();
	private ArrayList<Evento> listaEventos = new ArrayList();
	
	public Agenda() {
		this.hoje=LocalDateTime.now();
	}
	
	public Month getMonth() {
		return this.hoje.getMonth();
	}
	
	public DayOfWeek getDay() {
		return this.hoje.getDayOfWeek();
	}
	
	public void addLembrete() {
		
	}
	
	public void addLembreMensal() {
		
	}
	
	public void addLembreteDias() {
		
	}
}
