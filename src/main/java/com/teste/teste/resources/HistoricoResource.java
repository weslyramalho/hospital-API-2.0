package com.teste.teste.resources;

import java.time.Instant;

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
	
	@GetMapping
	public ResponseEntity<Historico> findAll(){
		Historico h1 = new Historico(null, Instant.parse("2019-06-20T19:53:07Z"), Instant.parse("2019-07-20T19:53:07Z"), "infecção instetinal", , 1L); 
		return ResponseEntity.ok().body(h1);
	}

}