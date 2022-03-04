package com.teste.teste.resources;

import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teste.teste.entities.Funcionario;
import com.teste.teste.entities.Historico;
import com.teste.teste.entities.Paciente;

@RestController
@RequestMapping(value = "/historico")
public class HistoricoResource {
	
	@Autowired
	public Histo
	@GetMapping
	public ResponseEntity<Historico> findAll(){
		return ResponseEntity.ok().body();
	}

}