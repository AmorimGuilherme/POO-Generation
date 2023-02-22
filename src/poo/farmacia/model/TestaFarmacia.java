package poo.farmacia.model;

public class TestaFarmacia {

	public static void main(String[] args) {

		Farmacia benegripe = new Farmacia("Benegrip", "Hypera Pharma", "Amarela", 15, 20.0);
		Farmacia xarope = new Farmacia("Xarope", "Xarope Pharma", "Branca", 35, 82.0);

		benegripe.visualizar();
		xarope.visualizar();

	}

}
