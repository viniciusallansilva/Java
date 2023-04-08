package com.unicamp.mc322.lab07;

public class Running {

	public static void main(String[] args) {
		AirPoo software=new AirPoo();
		software.addPontoInteresse("Parque Ibirabuera", new Posicao(20,-30));
		software.addPontoInteresse("catedral Metropolitana", new Posicao(5,40));
		
		Apartamento AP1=new Apartamento("AP14",new Posicao(10,10), 150, 3,2,1,true);
		Apartamento AP2=new Apartamento("Taquaral Flat 14", new Posicao(10,10), 150, 3, 2, 1, true);
		Apartamento AP3=new Apartamento("AP99", new Posicao(-15,7), 180, 2,2,9, false);
		
		Casa casa1=new Casa("DECOURT01", new Posicao(37,81), 450, 5, 4, true);
		
		Mansao mansao1=new Mansao("GASTEI01RIM", new Posicao(10,10), 2000, 1200);
		
		Redes redes1=new Redes("RED1", new Posicao(40,10), 20);
		
		Experiencia exp1=new Experiencia("RODIZIOPIZZA", new Posicao(80,20), 10, 59, 39);
		
		software.addApartamento(AP1);
		software.addApartamento(AP2);
		software.addApartamento(AP3);
		software.addCasa(casa1);
		software.addMansao(mansao1);
		software.addRedes(redes1);
		software.addExperiencia(exp1);
		
		software.imprimeInformacoes();
		
		Reserva res1=software.criaReserva("AP14", 3, 2, 2);
		Reserva res2=software.criaReserva("RODIZIOPIZZA", 1, 2, 2);
		Reserva res3=software.criaReserva("DECOURT01", 10, 2, 0);
		Reserva res4=software.criaReserva("GASTEI01RIM", 5, 5, 0);
		Reserva res5=software.criaReserva("RED1", 10, 5, 0);
		
		res1.printaValorReserva();
		res2.printaValorReserva();
		res3.printaValorReserva();
		res4.printaValorReserva();
		res5.printaValorReserva();
		
	}

}
