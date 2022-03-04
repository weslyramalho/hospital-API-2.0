package com.teste.teste.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teste.teste.entities.Funcionario;
import com.teste.teste.repositories.FuncionarioRepository;

@Service
public class FuncionarioService {
	
	@Autowired
	private FuncionarioRepository repository;
	
	public List<Funcionario> findAll(){
		return repository.findAll();
	}
	
	public Funcionario findById(Long id) {
		Optional<Funcionario> obj = repository.findById(id);
		return obj.get();
	}

}
