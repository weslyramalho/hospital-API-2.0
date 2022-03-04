package com.teste.teste.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teste.teste.entities.Funcionario;

@RestController
@RequestMapping(value = "/funcionarios")
public class FuncionariosResource {
	
	@GetMapping
	public ResponseEntity<Funcionario> findAll(){
		Funcionario u1 = new Funcionario(null, 1L, "Maria Brown", "efermagem", "45678925454", "Medico" ); 
		return ResponseEntity.ok().body(u1);
	}

}