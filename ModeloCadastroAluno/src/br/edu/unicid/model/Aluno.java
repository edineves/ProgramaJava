package br.edu.unicid.model;

public class Aluno {
	private int RGM;
	private String Nome;
	private int DataNascimento;
	private int CPF;
	private String Email;
	private String End;
	private String Municipio;
	private String Estado;
	private int Celular;
	private String Curso;
	private String Campus;
	private String Periodo;
	private String Disciplina;
	private String semestre;
	private float Notas;
	private int Faltas;	

	public Aluno() {
	}

	public Aluno(int rGM, String nome, int dataNascimento, int cPF, String email, String end, String municipio,
			String estado, int celular, String curso, String  Campus, String periodo, String Disciplina, String semestre, float notas, int faltas) {
		super();
		this.RGM = rGM;
		this.Nome = nome;
		this.DataNascimento = dataNascimento;
		this.CPF = cPF;
		this.Email = email;
		this.End = end;
		this.Municipio = municipio;
		this.Estado = estado;
		this.Celular = celular;
		this.Curso = curso;
		this. Campus =  Campus;
		this.Periodo = periodo;
		this.Disciplina = Disciplina;
		this.semestre = semestre;
		this.Notas = notas;
		this.Faltas = faltas;		
	
	}

	public int getRGM() {
		return RGM;
	}

	public void setRGM(int rGM) {
		RGM = rGM;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public int getDataNascimento() {
		return DataNascimento;
	}

	public void setDataNascimento(int dataNascimento) {
		DataNascimento = dataNascimento;
	}

	public int getCPF() {
		return CPF;
	}

	public void setCPF(int cPF) {
		CPF = cPF;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getEnd() {
		return End;
	}

	public void setEnd(String end) {
		End = end;
	}

	public String getMunicipio() {
		return Municipio;
	}

	public void setMunicipio(String municipio) {
		Municipio = municipio;
	}

	public String getEstado() {
		return Estado;
	}

	public void setEstado(String estado) {
		Estado = estado;
	}

	public int getCelular() {
		return Celular;
	}

	public void setCelular(int celular) {
		Celular = celular;
	}

	public String getCurso() {
		return Curso;
	}

	public void setCurso(String curso) {
		Curso = curso;
	}
	
	public String getCampus() {
		return Campus;
	}

	public void setCampus(String campus) {
		Curso = campus;
	}
	

	public String getPeriodo() {
		return Periodo;
	}

	public void setPeriodo(String periodo) {
		Periodo = periodo;
	}
	
	public String getDisciplina() {
		return Disciplina;
	}

	public void setDISCIPLINA(String dISCIPLINA) {
		Periodo = dISCIPLINA;
	}	
	

	public String getSemestre() {
		return semestre;
	}

	public void setsemestre(String semestre) {
		this.semestre = semestre;
	}

	public float getNotas() {
		return Notas;
	}

	public void setNotas(float notas) {
		Notas = notas;
	}

	public int getFaltas() {
		return Faltas;
	}

	public void setFaltas(int faltas) {
		Faltas = faltas;
	}	

}