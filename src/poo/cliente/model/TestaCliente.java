package poo.cliente.model;

public class TestaCliente {

	public static void main(String[] args) {

		Cliente cliente1 = new Cliente("Guilherme", "Amorim", 24, 75.5, 1.76);
		Cliente cliente2 = new Cliente("Antonio", "Alberto", 47, 78.6, 1.64);

		cliente1.visualizar();
		cliente2.visualizar();

	}

}
