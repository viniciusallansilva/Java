package com.unicamp.mc322.lab04;

public class Runner {

	public static void main(String[] args) {

        VacinaCovid app = new VacinaCovid();
        app.setIdadeMinimaAtendida(60);

        app.cadastrarUsuario("Jose da Silva", "123.456.789-01", 
                              new Date(1960,12,03), new Position(10,30));
        app.cadastrarUsuario("Maria Assuncao", "321.654.987-10", 
                              new Date(1999,4,11), new Position(-43,101));
        app.cadastrarUsuario("vinicius allan da silva", "888.444.222-00", new Date(1999,01,9), new Position(33,65));

        app.cadastrarPosto("SOUSAS", new Position(0,20), 5);
        Posto posto1=app.retornaPosto("SOUSAS");
        posto1.addDiasVacinacao(DiasSemana.DOMINGO,new Date(2021,9,19));
        posto1.addDiasVacinacao(DiasSemana.TERCA, new Date(2021,9,21));
        
        app.cadastrarPosto("BARAO GERALDO", new Position(-20,40), 2);
        Posto posto2=app.retornaPosto("BARAO GERALDO");
        posto2.addDiasVacinacao(DiasSemana.QUINTA,new Date(2021,9,23));
        posto2.addDiasVacinacao(DiasSemana.SEXTA, new Date(2021,9,24));
        
        app.cadastrarPosto("IPAUSSURAMA", new Position(70,60), 10);
        Posto posto3=app.retornaPosto("IPAUSSURAMA");
        posto3.addDiasVacinacao(DiasSemana.QUARTA,new Date(2021,10,13));
        posto3.addDiasVacinacao(DiasSemana.SABADO, new Date(2021,10,23));
        posto3.addDiasVacinacao(DiasSemana.SEGUNDA, new Date(2021,10,4));
        

        Reserva r1 = app.agendar("123.456.789-01", "SOUSAS");
        Reserva r2 = app.agendarPerto("321.654.987-10");
        app.agendaCedo("123.456.789-01");
        app.agendar("000.000.000-00","Posto Qualquer");
        
        app.agendarPerto("888.444.222-00");
        
        app.setIdadeMinimaAtendida(18);
        
        app.agendarPerto("888.444.222-00");

        app.imprimirSituacaoPostos();

        app.imprimirCadastroUsuarios();

	}
}
