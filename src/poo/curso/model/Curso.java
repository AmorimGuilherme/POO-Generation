package poo.curso.model;

public class Curso {

	private String nomeCurso;
	private String tipo;
	private String nomeEscola;
	private int quantidadeAlunos;
	private boolean posGraduacao;

	public Curso() {

	}

	public Curso(String nomeCurso, String tipo, String nomeEscola, int quantidadeAlunos, boolean posGraduacao) {
		super();
		this.nomeCurso = nomeCurso;
		this.tipo = tipo;
		this.nomeEscola = nomeEscola;
		this.quantidadeAlunos = quantidadeAlunos;
		this.posGraduacao = posGraduacao;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public int getQuantidadeAlunos() {
		return quantidadeAlunos;
	}

	public void setQuantidadeAlunos(int quantidadeAlunos) {
		this.quantidadeAlunos = quantidadeAlunos;
	}

	public boolean isPosGraduacao() {
		return posGraduacao;
	}

	public void setPosGraduacao(boolean posGraduacao) {
		this.posGraduacao = posGraduacao;
	}

	public void visualizar() {
		System.out.println("Nome: " + getNomeCurso() + "\nTipo: " + getTipo() + "\nEscola: " + getNomeEscola()
				+ "\nQuantidade alunos: " + getQuantidadeAlunos() + "\nPós Graduação: " + isPosGraduacao() + "\n");
	}

}
