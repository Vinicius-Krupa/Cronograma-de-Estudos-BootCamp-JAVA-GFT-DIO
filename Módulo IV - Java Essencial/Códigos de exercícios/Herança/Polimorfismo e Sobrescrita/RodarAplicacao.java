package Exerc�cios;

/*
 * Classe de exemplo para o exerc�cio da aula de orienta��o � Objetos
 */

public class RodarAplicacao {

	public static void main(String[] args) {

		ClasseMae[] classes = new ClasseMae[] {new ClasseFilha1(), new ClasseFilha2(), new ClasseMae()};
		
		// Polimorfismo ou n�o
		for (ClasseMae classe : classes) {
			classe.metodo1();
		}
		
		System.out.println("");
		
		for (ClasseMae classe : classes) {
			classe.metodo1();
		}
		
		System.out.println("");
		
		// Sobrescrita
		ClasseFilha2 classeFilha2 = new ClasseFilha2();
		classeFilha2.metodo2();
		
	}

}
