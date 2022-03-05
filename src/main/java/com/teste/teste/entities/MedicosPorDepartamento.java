package com.teste.teste.entities;

import java.util.List;

public class MedicosPorDepartamento {
	private Integer quantidade;
	
	private List<Funcionario> funcionario;

	public MedicosPorDepartamento() {
	}

	public MedicosPorDepartamento(Integer quantidade, List<Funcionario> funcionario) {
		this.quantidade = quantidade;
		this.funcionario = funcionario;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public List<Funcionario> getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(List<Funcionario> funcionario) {
		this.funcionario = funcionario;
	}
	
	

	

}
