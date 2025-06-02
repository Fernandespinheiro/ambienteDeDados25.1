package br.com.ambienteDeDados.model;

import java.util.Date;
public class aluno {
	
	private int id;
	private String name;
	private int matricula;
	private Date dataDeNascimento;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getmatricula() {
		return matricula;
	}
	public void setmatricula(int matricula) {
		this.matricula = matricula;
	}
	public Date getDataDeNascimento() {
		return dataDeNascimento;
	}
	public void setDataDeNascimento(Date dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	
}
