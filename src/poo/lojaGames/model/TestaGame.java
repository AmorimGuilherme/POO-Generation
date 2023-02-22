package poo.lojaGames.model;

public class TestaGame {

	public static void main(String[] args) {

		Produto pS5 = new Produto("Playstation 5", "Sony", "Slim", 2021, 4100.0);
		Produto xBox = new Produto("Xbox 3600", "Microsoft", "Turbo", 2009, 1200.0);

		pS5.visualizar();
		xBox.visualizar();

	}

}
