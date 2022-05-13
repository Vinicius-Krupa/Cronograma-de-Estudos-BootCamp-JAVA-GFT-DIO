package Exercícios;

/*
 * Classe de exemplo para o exercício da aula de Orientação à Objetos
 */

public class RodarAplicacao {

	public static void main(String[] args) {
		// Criando objeto normalmente
		Funcionario funcionario = new Funcionario();
		// Upcast
		Funcionario gerente = new Gerente();
		Funcionario vendedor = new Vendedor();
		Funcionario faxineiro = new Faxineiro();
		
		// Downcast
		Vendedor vendedor1 = (Vendedor) new Funcionario();
		
	}

}
