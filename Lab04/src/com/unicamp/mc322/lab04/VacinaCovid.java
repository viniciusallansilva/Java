package com.unicamp.mc322.lab04;

public class VacinaCovid {
	private static final int MAX_PACIENTE = 100;
	private static final int MAX_POSTO = 100;
	
	private int idadeMinima;
	private Pacientes[] listaPacientes;
	private Posto[] listaPosto;
	private Reserva[] listaReserva;
	
	public VacinaCovid() {
		this.listaPacientes = new Pacientes[MAX_PACIENTE];
		for(int i=0;i<listaPacientes.length;i++) {
			this.listaPacientes[i]=null;
		}
		this.listaPosto = new Posto[MAX_POSTO];
		for(int j=0;j<listaPacientes.length;j++) {
			this.listaPosto[j]=null;
		}
		this.listaReserva=new Reserva[MAX_PACIENTE];
		for(int k=0;k<listaReserva.length;k++) {
			this.listaReserva[k]=null;
		}
	}
	
	public Posto retornaPosto(String nome) {
		for(int i=0;i<retornaIndiceVazioPosto(listaPosto);i++) {
			if(listaPosto[i].getNome().equals(nome)) {
				return listaPosto[i];
			}
		}
		return null;
	}
	

	
	public void setIdadeMinimaAtendida(int indadeMinima) {
		this.idadeMinima=indadeMinima;
	}
	
	public void cadastrarUsuario(String nome ,String cpf ,Date aniversario ,Position endereco) {
		boolean possuiCadastro=false;
		for(int i=0;i<retornaIndiceVazioPacientes(listaPacientes);i++) {
			if(this.listaPacientes[i].getCpf().equals(cpf)) {
				possuiCadastro=true;
			}
		}
		if(possuiCadastro) {
			System.out.println("Usuário já cadastrado\n");
		}
		else{
			int indice=retornaIndiceVazioPacientes(listaPacientes);
			listaPacientes[indice]=new Pacientes(nome,cpf,aniversario,endereco);
		}
	}
	
	public void cadastrarPosto(String nome, Position endereco, int maxVagas) {
		boolean possuiCadastro=false;
		for(int i=0;i<retornaIndiceVazioPosto(listaPosto);i++) {
			if(this.listaPosto[i].getNome().equals(nome)) {
				possuiCadastro=true;
			}
		}
		if(possuiCadastro) {
			System.out.println("Posto Já Cadastrado\n");
		}
		else {
			int indice=retornaIndiceVazioPosto(listaPosto);
			listaPosto[indice]=new Posto(nome,endereco,maxVagas);
		}
	}
	
	public void imprimirSituacaoPostos() {
		for(int i=0;i<retornaIndiceVazioPosto(listaPosto);i++) {
			listaPosto[i].printInformation();
		}
	}
	
	public void imprimirCadastroUsuarios() {
		for(int i=0;i<retornaIndiceVazioPacientes(listaPacientes);i++) {
			listaPacientes[i].printInformation();
		}
	}
	
	public void imprimirReservas() {
		for(int i=0;i<retornaIndiceVazioReserva(listaReserva)-1;i++) {
			listaReserva[i].imprimeReserva();
		}
	}
	
	public Reserva agendar(String cpf,String nomePosto) {
		if(!verificaCadastro(cpf)) {
			System.out.println("Paciente nao cadastrado, agendamento nao efetuado\n");
			return null;
		}
		if(!verificaIdade(cpf)) {
			System.out.println("Paciente nao tem a idade minima, agendamento nao efetuado\n");
			return null;
		}
		if(verificaReserva(cpf)) {
			System.out.println("Paciente ja possui uma reserva, agendamento nao efetuado\n");
			return null;
		}
		Posto postoDesejado=retornaPosto(nomePosto);
		int indice=retornaIndiceVazioReserva(listaReserva);
		listaReserva[indice]=new Reserva(cpf,postoDesejado.retornaVagaMaisProxima(),nomePosto);
		System.out.println("Agendamento realizado com sucesso\n");
		return listaReserva[indice];
	}
	
	public Reserva agendarPerto(String cpf) {
		if(!verificaCadastro(cpf)) {
			System.out.println("Paciente nao cadastrado, agendamento nao efetuado\n");
			return null;
		}
		if(!verificaIdade(cpf)) {
			System.out.println("Paciente nao tem a idade minima, agendamento nao efetuado\n");
			return null;
		}
		if(verificaReserva(cpf)) {
			System.out.println("Paciente ja possui uma reserva, agendamento nao efetuado\n");
			return null;
		}
		Pacientes user=getPacientePeloCpf(cpf);
		Posto postoMaisPerto=postoMaisProximo(user.getEndereco());
		int indice=retornaIndiceVazioReserva(listaReserva);
		listaReserva[indice]=new Reserva(cpf,postoMaisPerto.retornaVagaMaisProxima(),postoMaisPerto.getNome());
		System.out.println("Agendamento realizado com sucesso\n");
		return listaReserva[indice];
		
	}
	
	public Reserva agendaCedo(String cpf) {
		if(!verificaCadastro(cpf)) {
			System.out.println("Paciente nao cadastrado, agendamento nao efetuado\n");
			return null;
		}
		if(!verificaIdade(cpf)) {
			System.out.println("Paciente nao tem a idade minima, agendamento nao efetuado\n");
			return null;
		}
		if(verificaReserva(cpf)) {
			System.out.println("Paciente ja possui uma reserva, agendamento nao efetuado\n");
			return null;
		}
		Posto postoMaisCedo=getPostoMaisCedo();
		int indice=retornaIndiceVazioReserva(listaReserva);
		listaReserva[indice]=new Reserva(cpf,postoMaisCedo.retornaVagaMaisProxima(),postoMaisCedo.getNome());
		System.out.println("Agendamento realizado com sucesso\n");
		return listaReserva[indice];
	}
	
	private int retornaIndiceVazioPacientes(Pacientes[] lista) {
		int indice=0;
		while(lista[indice]!=null && indice<lista.length) {
			indice++;
		}
		return indice;
	}
	
	private int retornaIndiceVazioPosto(Posto[] lista) {
		int indice=0;
		while(lista[indice]!=null && indice<lista.length) {
			indice++;
		}
		return indice;
	}
	
	private int retornaIndiceVazioReserva(Reserva[] lista) {
		int indice=0;
		while(lista[indice]!=null && indice<lista.length) {
			indice++;
		}
		return indice;
	}
	
	private boolean verificaCadastro(String cpf) {
		boolean usuarioCadastrado=false;
		for(int i=0;i<retornaIndiceVazioPacientes(listaPacientes);i++) {
			if(listaPacientes[i].getCpf().equals(cpf)) {
				usuarioCadastrado=true;
			}
		}
		return usuarioCadastrado;
	}
	
	private boolean verificaIdade(String cpf) {
		boolean pacienteTemIdade=false;
		for(int i=0;i<retornaIndiceVazioPacientes(listaPacientes);i++) {
			if(listaPacientes[i].getCpf().equals(cpf)) {
				if(listaPacientes[i].getDate().calculaIdade()>=idadeMinima) {
					pacienteTemIdade=true;
				}
			}
		}
		return pacienteTemIdade;
	}
	
	private boolean verificaReserva(String cpf) {
		boolean pacienteTemReserva=false;
		for(int i=0;i<retornaIndiceVazioReserva(listaReserva);i++) {
			if(listaReserva[i].getCpf().equals(cpf)) {
				pacienteTemReserva=true;
			}
		}
		return pacienteTemReserva;
	}
	
	
	private Posto postoMaisProximo(Position endereco) {
		Posto maisProximo=listaPosto[0];
		double menorDistancia=maisProximo.getEndereco().calculaDistancia(endereco);
		int indicePostoPerto=0;
		for(int i=0;i<retornaIndiceVazioPosto(listaPosto);i++) {
			if(listaPosto[i].getEndereco().calculaDistancia(endereco)<menorDistancia) {
				menorDistancia=listaPosto[i].getEndereco().calculaDistancia(endereco);
				indicePostoPerto=i;
			}
		}
		return listaPosto[indicePostoPerto];
	}
	
	private Pacientes getPacientePeloCpf(String cpf) {
		for(int i=0;i<retornaIndiceVazioPacientes(listaPacientes);i++) {
			if(listaPacientes[i].getCpf().equals(cpf)) {
				return listaPacientes[i];
			}
		}
		return null;
	}
	
	private Posto getPostoMaisCedo() {
		Posto maisCedo=listaPosto[0];
		Date dataCedo=maisCedo.retornaVagaMaisProxima();
		int indice=0;
		Date auxiliar;
		for(int i=0;i<retornaIndiceVazioPosto(listaPosto);i++) {
			auxiliar=dataCedo;
			dataCedo=calculaDataCedo(dataCedo, listaPosto[i].retornaVagaMaisProxima());
			if(auxiliar!=dataCedo) {
				indice=i;
			}
		}
		return listaPosto[indice];
	}
	
	private Date calculaDataCedo(Date data1,Date data2) {
		if(data1.getAno()<data2.getAno()){
			return data1;
		}
		else if(data1.getAno()==data2.getAno()){
			if(data1.getMes()<data2.getMes()){
				return data1;
			}
			else if(data1.getMes()==data2.getMes()) {
				if(data1.getDia()<data2.getDia()) {
					return data1;
				}
			}
			
		}
		return data2;
	}
}
