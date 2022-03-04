package com.teste.teste.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teste.teste.entities.Funcionario;
import com.teste.teste.entities.Paciente;

public interface HistoricoRepository extends JpaRepository<Paciente, Long>{

}
