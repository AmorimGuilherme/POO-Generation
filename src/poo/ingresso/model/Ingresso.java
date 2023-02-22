package poo.ingresso.model;

public class Ingresso {

	private String show;
	private String tipo;
	private String local;
	private int quantidade;
	private double valor;

	public Ingresso() {

	}

	public Ingresso(String show, String tipo, String local, int quantidade, double valor) {
		this.show = show;
		this.tipo = tipo;
		this.local = local;
		this.quantidade = quantidade;
		this.valor = valor;
	}

	public String getShow() {
		return show;
	}

	public void setShow(String show) {
		this.show = show;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
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
		System.out.println("Show: " + getShow() + "\nTipo: " + getTipo() + "\nLocal: " + getLocal() + "\nQuantidade: "
				+ getQuantidade() + "\nValor: R$" + getValor() + "\n");
	}

}
