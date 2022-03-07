package com.teste.teste.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teste.teste.entities.Paciente;

import com.teste.teste.repositories.PacienteRepository;

@Service
public class PacienteService {
	
	@Autowired
	private PacienteRepository repository;
	
	public List<Paciente> findAll(){
		return repository.findAll();
	}
	
	public Paciente findById(Long id) {
		Optional<Paciente> obj = repository.findById(id);
		return obj.get();
	}
	
	public Paciente insert(Paciente obj) {
		return repository.save(obj);
	}
	public void delete(Long id) {
		repository.deleteById(id);
	}

	public Paciente update(Long id, Paciente obj) {
		Paciente entity = repository.getById(id);
		return repository.save(entity);
		
	}

}
