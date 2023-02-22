package poo.lojaGames.model;

public class Produto {

	private String nome;
	private String marca;
	private String modelo;
	private int ano;
	private double valor;

	public Produto() {

	}

	public Produto(String nome, String marca, String modelo, int ano, double valor) {
		this.nome = nome;
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public void visualizar() {
		System.out.println("Nome do Produto: " + getNome() + "\nMarca: " + getMarca() + "\nModelo: " + getModelo()
				+ "\nValor: R$" + getValor() + "\nAno: " + getAno() + "\n");
	}

}
