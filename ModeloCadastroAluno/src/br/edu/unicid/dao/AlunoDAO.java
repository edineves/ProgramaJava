package br.edu.unicid.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.edu.unicid.model.Aluno;
import br.edu.unicid.util.ConnectionFactory;


public class AlunoDAO {	

	private Aluno leitor;
	private Connection conn; // conecta com o banco de dados
	private PreparedStatement ps; // permite executar querys
	private ResultSet rs; // tabela

	public AlunoDAO() throws Exception {
		try {
				conn = ConnectionFactory.getConnection();

		} catch (Exception erro) {
				throw new Exception("Erro " + erro.getMessage());
		}
	}

	public void salvar(Aluno leitor) throws Exception {
			try {
				String sql = "INSERT INTO Aluno(RGM, Nome, DataNascimento, CPF, Email, End, Municipio, Estado, Celular, Curso, Campus, Periodo, Disciplina, Semestre, Notas, Faltas)" 
			    + "values (?,?,?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
				ps = conn.prepareStatement(sql);
				
				ps.setInt(1, leitor.getRGM());
				ps.setString(2, leitor.getNome());
				ps.setInt(3, leitor.getDataNascimento());
				ps.setInt(4, leitor.getCPF());
				ps.setString(5, leitor.getEmail());
				ps.setString(6, leitor.getEnd());
				ps.setString(7, leitor.getMunicipio());
				ps.setString(8, leitor.getEstado());
				ps.setInt(9, leitor.getCelular());
				ps.setString(10, leitor.getCurso());
				ps.setString(11, leitor.getCampus());
				ps.setString(12, leitor.getPeriodo());
				ps.setString(13, leitor.getDisciplina());
				ps.setString(14, leitor.getSemestre());
				ps.setFloat(15, leitor.getNotas());
				ps.setInt(16, leitor.getFaltas());				
				ps.executeUpdate();	
				
			} catch (Exception erro) {
				throw new Exception("Erro " + erro.getMessage());
			}
		}

		public void alterar(Aluno leitor) throws Exception {
			try {
				String sql = "UPDATE tbLeitor SET RGM=?, Nome=?, DataNascimento=?,CPF=?,Email=?,"
						+ "End=?,Municipio=?,Estado=?,Celular=?,Curso=?,Campus=?, Periodo=?. Discipçina=?, Semestre=?, Notas=?, Faltas=?" + "WHERE Aluno=?";
				ps = conn.prepareStatement(sql);				
				ps.setInt(1, leitor.getRGM());
				ps.setString(2, leitor.getNome());
				ps.setInt(3, leitor.getDataNascimento());
				ps.setInt(4, leitor.getCPF());
				ps.setString(5, leitor.getEmail());
				ps.setString(6, leitor.getEnd());
				ps.setString(7, leitor.getMunicipio());
				ps.setString(8, leitor.getEstado());
				ps.setInt(9, leitor.getCelular());
				ps.setString(10, leitor.getCurso());
				ps.setString(11, leitor.getCampus());
				ps.setString(12, leitor.getPeriodo());
				ps.setString(13, leitor.getDisciplina());
				ps.setString(14, leitor.getSemestre());
				ps.setFloat(15, leitor.getNotas());
				ps.setInt(16, leitor.getFaltas());	
				ps.executeUpdate();		
				
				
			} catch (Exception erro) {
				throw new Exception("Erro " + erro.getMessage());
			}
		}

		public void excluir(int codLeitor) throws Exception {
			try {
				String sql = "DELETE FROM tbLeitor " + "WHERE codLeitor=?";
				ps = conn.prepareStatement(sql);
				ps.setInt(1, codLeitor);
				ps.executeUpdate();
			} catch (Exception erro) {
				throw new Exception("Erro " + erro.getMessage());
			}

		}

		public List<Aluno> listarTodos() throws Exception {

			try {

				List<Aluno> leitores = new ArrayList<Aluno>();

				String sql = "SELECT * FROM Aluno";

				ps = conn.prepareStatement(sql);
				rs = ps.executeQuery();

				while (rs.next()) {

					leitor = new Aluno();
					leitor.setRGM(rs.getInt(1));
					leitor.setNome(rs.getString(2));
					leitor.setCurso(rs.getString(3));

					leitores.add(leitor);
				}

				return leitores;

			} catch (Exception e) {
				throw new Exception("Erro: " + e.getMessage());
			}

		}

		public Aluno consultar(int codLeitor) throws Exception {

			try {

				leitor = new Aluno();

				String sql = "SELECT * FROM tbLeitor WHERE codLeitor=?";

				ps = conn.prepareStatement(sql);
				ps.setInt(1, codLeitor);
				rs = ps.executeQuery();

				while (rs.next()) {
					leitor.setRGM(rs.getInt(1));
					leitor.setNome(rs.getString(2));
					leitor.setCurso(rs.getString(3));
				}

				return leitor;

			} catch (Exception e) {
				throw new Exception("Erro: " + e.getMessage());
			}

		}

	}

	
	
	
	
	
	
	
	
	
	
