package com.unicamp.mc322.lab10;

public class Runner {

	public static void main(String[] args) {
		Passageiro marcos=new Passageiro("Marcos",145678789,new Data(15,07,1998),369874);
		
		Motorista maria=new Motorista("Maria",248679108,new Data(12,02,1997), 987654,483530);
		
		Luxo lux1=new Luxo(2009,new Placa("ABC",1234));
		Comum com1=new Comum(2013,new Placa("OOP",2020));
		
		maria.addVeiculo(lux1);
		lux1.addMotorista(maria);
		maria.addVeiculo(com1);
		com1.addMotorista(maria);
		
		Passageiro joao=new Passageiro("Joao",654973652,new Data(03,01,2022),785632);
		
		Viagens viagem1=new Viagens(marcos,maria,lux1,500,2);	
		viagem1.executarParada();
		viagem1.executarParada();
		viagem1.finalizaViagem();
		
		Viagens viagem2=new Viagens(marcos,joao,maria,com1,2000,5);
		viagem2.executarParada();
		viagem2.executarParada();
		viagem2.executarParada();
		viagem2.descePassageiro(joao);
		viagem2.executarParada();
		viagem2.executarParada();
		viagem2.finalizaViagem();
		
		Viagens viagem3=new Viagens(joao,maria,lux1,700,3);
		viagem3.executarParada();
		viagem3.executarParada();
		viagem3.executarParada();
		viagem3.finalizaViagem();
		
		
	}

}
