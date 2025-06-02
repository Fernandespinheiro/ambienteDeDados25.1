package br.com.ambienteDeDados.aplication;

import java.sql.Date;

import br.com.ambienteDeDados.DAO.alunoDAO;
import br.com.ambienteDeDados.model.aluno;

public class Main {

	public static void main(String[] args) {
		
		alunoDAO alunoDAO = new alunoDAO();
		aluno aluno = new aluno();
		aluno.setName("joão gabriel");
		aluno.setDataDeNascimento(new Date(0));
		aluno.setmatricula(722);
		
		alunoDAO.save(aluno);

	}

}
