package Exerc�cios;

/*
 * Classe de exemplo para o exerc�cio da aula de Orienta��o � Objetos
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
