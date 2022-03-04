package com.teste.teste.resources;

import java.time.Instant;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teste.teste.entities.Paciente;

@RestController
@RequestMapping(value = "/pacientes")
public class PacienteResource {
	
	@GetMapping
	public ResponseEntity<Paciente> findAll(){
		Paciente u1 = new Paciente(null, "João Miguel lopes", Instant.parse("2015-05-22T15:21:22Z"), "45678925454"); 
		return ResponseEntity.ok().body(u1);
	}

}