package com.teste.teste.adapters;

import java.util.List;
import java.util.stream.Collectors;

import org.aspectj.weaver.NewConstructorTypeMunger;

import com.teste.teste.entities.Funcionario;
import com.teste.teste.entities.Historico;
import com.teste.teste.entities.MedicosPorDepartamento;

public class HistoricoAdapters {
	
	
	public List<MedicosPorDepartamento> medicosPorDepartamento(List<Historico> historicos, List<Funcionario> funcionarios){
		List<MedicosPorDepartamento> medicosPorDepartamentos =funcionarios.stream().map(f -> {
			List<Historico> historicoList = historicos.stream().filter(h -> h.getPaciente().getId().equals(f.getId()))
					.collect(Collectors.toList());
			
			return new MedicosPorDepartamento(f, historicoList);
		}).collect(Collectors.toList());
		return medicosPorDepartamentos;
	}

}
