package com.teste.teste.entities;

import java.io.Serializable;
import java.time.Instant;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "historico")
public class Historico implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
    private Instant data_entrada;
    private Instant data_saida;
    private String diagnostico;
	@OneToOne
	@JoinColumn(name= "id_paciente")
    private Paciente paciente;
	@OneToOne
	@JoinColumn(name= "id_funcionario")
    private Funcionario funcionario;
	
	public Historico() {
		
	}

	public Historico(Long id, Instant data_entrada, Instant data_saida, String diagnostico, Paciente paciente,
			Funcionario funcionario) {
		super();
		this.id = id;
		this.data_entrada = data_entrada;
		this.data_saida = data_saida;
		this.diagnostico = diagnostico;
		this.paciente = paciente;
		this.funcionario = funcionario;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Instant getData_entrada() {
		return data_entrada;
	}

	public void setData_entrada(Instant data_entrada) {
		this.data_entrada = data_entrada;
	}

	public Instant getData_saida() {
		return data_saida;
	}

	public void setData_saida(Instant data_saida) {
		this.data_saida = data_saida;
	}

	public String getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	
	

	
	
}
