package poo.curso.model;

public class TestaCurso {

	public static void main(String[] args) {

		Curso historia = new Curso("História", "Graduação", "Historiadores", 55, false);
		Curso engenhariaEolica = new Curso("Engenharia Eólica", "Pós Graduação", "FEI", 40, true);

		historia.visualizar();
		engenhariaEolica.visualizar();

	}

}
