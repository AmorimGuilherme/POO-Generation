package poo.funcionario.model;

public class Funcionario {

	private String nome;
	private String cargo;
	private double salario;
	private double peso;
	private double altura;

	public Funcionario() {
	}

	public Funcionario(String nome, String cargo, double salario, double peso, double altura) {
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario;
		this.peso = peso;
		this.altura = altura;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
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
		System.out.println("Funcionárie: " + getNome() + " | Cargo: " + getCargo() + " | Salário: R$" + getSalario()
				+ " | Peso: " + getPeso() + "kgs | Altura: " + getAltura() + "m");
	}

}
