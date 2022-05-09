package br.com.bootcamp.GFT.Java.metodos;

/* Exercícios de boas práticas para diminuir o tamanho das operações
 * 
 */


public class Operadores {

	public static void main(String[] args) {

		double salarioMensal = 11893.58d;
		double salarioMedio = 10500d;
		
		int quantidadeDependentes = 4;
		int mediaDependentes = 2;
		
		System.out.println((salarioMensal < salarioMedio) && (quantidadeDependentes >= mediaDependentes)); // ferindo as boas práticas
		
		boolean salarioBaixo = salarioMensal < salarioMedio;
		boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;
		
		System.out.println((salarioBaixo) && (muitosDependentes)); // está melhor, mas podemos diminuir mais
		
		boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);
		
		System.out.println("Recebe auxílio: " + recebeAuxilio); // melhor jeito
	}

}
