package br.com.bootcamp.GFT.Java.metodos;

/* Exerc�cios de boas pr�ticas para diminuir o tamanho das opera��es
 * 
 */


public class Operadores {

	public static void main(String[] args) {

		double salarioMensal = 11893.58d;
		double salarioMedio = 10500d;
		
		int quantidadeDependentes = 4;
		int mediaDependentes = 2;
		
		System.out.println((salarioMensal < salarioMedio) && (quantidadeDependentes >= mediaDependentes)); // ferindo as boas pr�ticas
		
		boolean salarioBaixo = salarioMensal < salarioMedio;
		boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;
		
		System.out.println((salarioBaixo) && (muitosDependentes)); // est� melhor, mas podemos diminuir mais
		
		boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);
		
		System.out.println("Recebe aux�lio: " + recebeAuxilio); // melhor jeito
	}

}
