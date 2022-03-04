package com.teste.teste.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.teste.teste.entities.Funcionario;
import com.teste.teste.entities.Historico;
import com.teste.teste.entities.Paciente;
import com.teste.teste.repositories.FuncionarioRepository;
import com.teste.teste.repositories.HistoricoRepository;
import com.teste.teste.repositories.PacienteRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private FuncionarioRepository funcionarioRepository;
	
	@Autowired 
	private PacienteRepository pacienteRepository;
	
	@Autowired
	private HistoricoRepository historicoRepository;
	
	@Override
	public void run(String... args) throws Exception {
		Funcionario f1 = new Funcionario(null, 1L, "João Miguel", "Cardiologista", "12345678978", "Medico");
		Funcionario f2 = new Funcionario(null, 1L, "Paulo", "Enfermaria", "12345678978", "Enfermeiro");
		Funcionario f3 = new Funcionario(null, 1L, "Ana", "Emergencia", "12345678978", "Medico");
		Funcionario f4 = new Funcionario(null, 1L, "Maria", "Obstetria", "12345678978", "Medico");
		Funcionario f5 = new Funcionario(null, 1L, "Bia", "Emergencia", "12345678978", "tec enfermagem");

		funcionarioRepository.saveAll(Arrays.asList(f1, f2, f3, f4, f5));
		
		Paciente p1 = new Paciente(null, "Natalino", Instant.parse("2015-05-22T15:21:22Z"), "45678925454"); 
		Paciente p2 = new Paciente(null, "Uilliam", Instant.parse("2015-05-22T15:21:22Z"), "45678925454"); 
		Paciente p3 = new Paciente(null, "Ana", Instant.parse("2015-05-22T15:21:22Z"), "45678925454"); 
		Paciente p4 = new Paciente(null, "Natali", Instant.parse("2015-05-22T15:21:22Z"), "45678925454"); 
		Paciente p5 = new Paciente(null, "Bela", Instant.parse("2015-05-22T15:21:22Z"), "45678925454"); 
		
		pacienteRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5));
		
		Historico h1 = new Historico(null, Instant.parse("2015-05-22T15:21:22Z"), Instant.parse("2015-05-22T15:21:22Z"), "Parada cardiaca", p1, f1);
		Historico h2 = new Historico(null, Instant.parse("2015-05-22T15:21:22Z"), Instant.parse("2015-05-22T15:21:22Z"), "Parada cardiaca", p2, f5);
		Historico h3 = new Historico(null, Instant.parse("2015-05-22T15:21:22Z"), Instant.parse("2015-05-22T15:21:22Z"), "Parada cardiaca", p3, f4);
		Historico h4 = new Historico(null, Instant.parse("2015-05-22T15:21:22Z"), Instant.parse("2015-05-22T15:21:22Z"), "Parada cardiaca", p5, f2);
		Historico h5 = new Historico(null, Instant.parse("2015-05-22T15:21:22Z"), Instant.parse("2015-05-22T15:21:22Z"), "Parada cardiaca", p4, f1);
		
		historicoRepository.saveAll(Arrays.asList(h1, h2, h3, h4, h5));
	
	}

}
