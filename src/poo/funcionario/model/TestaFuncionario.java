package poo.funcionario.model;

public class TestaFuncionario {

	public static void main(String[] args) {

		Funcionario funcionario1 = new Funcionario("José", "Professor", 3500.0, 86.1, 1.79);
		Funcionario funcionario2 = new Funcionario("Ana Maria", "Coordenadora", 5400.0, 68.3, 1.67);

		funcionario1.visualizar();
		funcionario2.visualizar();

	}

}
