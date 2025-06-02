package br.com.ambienteDeDados.DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;

import br.com.ambienteDeDados.model.aluno;

public class alunoDAO {
	
	public void save (aluno aluno) {
		String sql = "INSERT INTO aluno(nome,dataDeNascimento, matricula) VALUES (?,?,?)";
		
		Connection conn=null;
		PreparedStatement pstm=null;
		
		try {
			conn = conexaoDB.createConnectionToMySQL();
			pstm = (PreparedStatement)conn.prepareStatement(sql);
			pstm.setString(1, aluno.getName());
			pstm.setDate(2, new Date(aluno.getDataDeNascimento().getTime()));
			
			pstm.execute();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstm!=null) {
					pstm.close();
				}
				if (conn!=null) {
					conn.close();
				}
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
}
