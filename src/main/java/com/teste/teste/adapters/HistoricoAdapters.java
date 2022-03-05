package com.teste.teste.adapters;

import java.util.List;
import java.util.stream.Collectors;

import org.aspectj.weaver.NewConstructorTypeMunger;

import com.teste.teste.entities.Funcionario;
import com.teste.teste.entities.Historico;
import com.teste.teste.entities.HospitalizacaoPorPaciente;
import com.teste.teste.entities.MedicosPorDepartamento;
import com.teste.teste.entities.Paciente;

public class HistoricoAdapters {
	
	
	public List<MedicosPorDepartamento> adMedicosPorDepartamento(List<Historico> historicos, List<Funcionario> funcionarios){
		List<MedicosPorDepartamento> medicosPorDepartamentos =funcionarios.stream().map(f -> {
			List<Historico> historicoList = historicos.stream().filter(h -> h.getPaciente().getId().equals(f.getId()))
					.collect(Collectors.toList());
			
			return new MedicosPorDepartamento(f, historicoList);
		}).collect(Collectors.toList());
		return medicosPorDepartamentos;
	}
	
	public List<HospitalizacaoPorPaciente> adHospitalizacaoPorPaciente(List<Historico> historicos, List<Paciente> pacientes){
		List<HospitalizacaoPorPaciente> hospitalizacaoPorPacientes =pacientes.stream().map(p -> {
			List<Historico> historicoList = historicos.stream().filter(h -> h.getPaciente().getId().equals(p.getId()))
					.collect(Collectors.toList());
			
			return new HospitalizacaoPorPaciente(p, historicoList);
		}).collect(Collectors.toList());
		return hospitalizacaoPorPacientes;
	}
	
	

}
