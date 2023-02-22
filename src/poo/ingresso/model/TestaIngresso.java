package poo.ingresso.model;

public class TestaIngresso {

	public static void main(String[] args) {

		Ingresso rodeio = new Ingresso("Boiadeiro", "VIP", "Barretos", 2, 150.0);
		Ingresso rap = new Ingresso("Rap Festival", "Pista", "Espaço das Americas", 5, 240.0);

		rodeio.visualizar();
		rap.visualizar();

	}

}
