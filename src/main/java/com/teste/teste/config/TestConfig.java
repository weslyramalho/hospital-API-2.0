package com.teste.teste.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.teste.teste.entities.Funcionario;
import com.teste.teste.repositories.FuncionarioRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private FuncionarioRepository funcionarioRepository;
	
	@Override
	public void run(String... args) throws Exception {
		Funcionario f1 = new Funcionario(null, 1L, "João Miguel", "Cardiologista", "12345678978", "Medico");
		Funcionario f2 = new Funcionario(null, 1L, "Paulo", "Enfermaria", "12345678978", "Enfermeiro");
		Funcionario f3 = new Funcionario(null, 1L, "Ana", "Emergencia", "12345678978", "Medico");
		Funcionario f4 = new Funcionario(null, 1L, "Maria", "Obstetria", "12345678978", "Medico");
		Funcionario f5 = new Funcionario(null, 1L, "Bia", "Emergencia", "12345678978", "tec enfermagem");

		funcionarioRepository.saveAll(Arrays.asList(f1, f2, f3, f4, f5));
	}

}
