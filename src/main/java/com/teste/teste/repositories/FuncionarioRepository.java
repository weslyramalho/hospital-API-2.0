package com.teste.teste.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teste.teste.entities.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long>{

}
