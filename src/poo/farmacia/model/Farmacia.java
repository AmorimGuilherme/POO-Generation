package poo.farmacia.model;

public class Farmacia {

	private String nomeProduto;
	private String marca;
	private String tarja;
	private int quantidade;
	private double valor;

	public Farmacia() {

	}

	public Farmacia(String nomeProduto, String marca, String tarja, int quantidade, double valor) {
		this.nomeProduto = nomeProduto;
		this.marca = marca;
		this.tarja = tarja;
		this.quantidade = quantidade;
		this.valor = valor;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTarja() {
		return tarja;
	}

	public void setTarja(String tarja) {
		this.tarja = tarja;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public void visualizar() {
		System.out.println("Produto: " + getNomeProduto() + "\nMarca: " + getMarca() + "\nTarja: " + getTarja()
				+ "\nQuantidade: " + getQuantidade() + "\nPreço: R$" + getValor() + "\n");
	}

}
