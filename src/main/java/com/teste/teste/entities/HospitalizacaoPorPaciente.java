package com.teste.teste.entities;

import java.util.List;

public class HospitalizacaoPorPaciente {
	
	private Paciente paciente;
	private List<Historico> historicos;
	
	public HospitalizacaoPorPaciente() {
	}

	public HospitalizacaoPorPaciente(Paciente paciente, List<Historico> historicos) {
		this.paciente = paciente;
		this.historicos = historicos;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public List<Historico> getHistoricos() {
		return historicos;
	}

	public void setHistoricos(List<Historico> historicos) {
		this.historicos = historicos;
	}
	
	
	
	
	
	

}
