package poo.cliente.model;

public class Cliente {

	private String nome;
	private String sobrenome;
	private int idade;
	private double peso;
	private double altura;

	public Cliente() {

	}

	public Cliente(String nome, String sobrenome, int idade, double peso, double altura) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.idade = idade;
		this.peso = peso;
		this.altura = altura;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public void visualizar() {
		System.out.println("Cliente: " + getNome() + " " + getSobrenome() + " | Idade: " + getIdade() + " | Altura: "
				+ getAltura() + "m | Peso: " + getPeso() + "kgs");
	}

}
