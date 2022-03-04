package com.teste.teste.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teste.teste.entities.Historico;
import com.teste.teste.repositories.HistoricoRepository;

@Service
public class HistoricoService {
	
	@Autowired
	private HistoricoRepository repository;
	
	public List<Historico> findAll(){
		return repository.findAll();
	}
	
	public Historico findById(Long id) {
		Optional<Historico> obj = repository.findById(id);
		return obj.get();
	}

}
