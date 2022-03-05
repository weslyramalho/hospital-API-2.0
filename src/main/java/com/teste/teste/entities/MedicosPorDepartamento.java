package com.teste.teste.entities;

import java.util.List;

public class MedicosPorDepartamento {
	private Funcionario funcionario;
	
	private List<Historico> historicos;

	public MedicosPorDepartamento() {
	}

	public MedicosPorDepartamento(Funcionario funcionario, List<Historico> historicos) {
		this.funcionario = funcionario;
		this.historicos = historicos;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public List<Historico> getHistoricos() {
		return historicos;
	}

	public void setHistoricos(List<Historico> historicos) {
		this.historicos = historicos;
	}
	
	

	
}
