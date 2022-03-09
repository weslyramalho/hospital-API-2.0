package com.teste.teste.resources;

import java.net.URI;
import java.time.Instant;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.teste.teste.adapters.HistoricoAdapters;
import com.teste.teste.entities.Historico;
import com.teste.teste.entities.HospitalizacaoPorPaciente;
import com.teste.teste.entities.Historico;
import com.teste.teste.entities.Paciente;
import com.teste.teste.services.FuncionarioService;
import com.teste.teste.services.HistoricoService;
import com.teste.teste.services.PacienteService;

@RestController
@RequestMapping(value = "/historico")
public class HistoricoResource {
	
	@Autowired
	public HistoricoService service;
	
	@Autowired
	public PacienteService paciente;
	
	@Autowired
	public FuncionarioService funcionario;
	
	HistoricoAdapters historicoAdapters = new HistoricoAdapters();	
	
	@GetMapping
	public ResponseEntity<List<Historico>> findAll(){
		List<Historico> list= service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Historico> findById(@PathVariable Long id){
		Historico obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
	@PostMapping
	public ResponseEntity<Historico> insert(@RequestBody Historico obj){
		obj = service.insert(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).body(obj);
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id){
		service.delete(id);
		return ResponseEntity.noContent().build();
	}
	
	@PutMapping(value = "/{id}")
	public ResponseEntity<Historico> update(@PathVariable Long id, @RequestBody Historico obj){
		obj = service.update(id, obj);
		return ResponseEntity.ok().body(obj);
				
	}
	
	@GetMapping("/pacientes")
	public ResponseEntity<List<HospitalizacaoPorPaciente>> hospitalizacaoPorPaciente(){
		List<Paciente> pacientes = paciente.findAll();
		List<Historico> historicos = service.findAll();
		
		List<HospitalizacaoPorPaciente> hospitalizacaoPorPacientes = historicoAdapters
				.adHospitalizacaoPorPaciente(historicos, pacientes);
		
		return new ResponseEntity<>(hospitalizacaoPorPacientes, HttpStatus.OK);
	}


}