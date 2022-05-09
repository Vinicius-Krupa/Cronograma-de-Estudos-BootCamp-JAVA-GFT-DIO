package br.com.bootcamp.GFT.Java.metodos;

import java.util.Scanner;

/*
Fa�a um programa que leia 5 n�meros
e informe o maior n�mero
e a m�dia desses n�meros.
 */

public class Ex3_MaiorEMedia {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int soma = 0, numeros = 0, maiorNumero = 0;
		int i = 0;
		
		do {
			System.out.println("Digite um n�mero: ");
			numeros = scan.nextInt();
			
			soma += numeros;
			
			if (numeros > maiorNumero) {
				maiorNumero = numeros;
			}
			i++;
		} while (i < 5); 
		
		System.out.println("O maior n�mero foi " + maiorNumero);
		System.out.println("A m�dia dos n�meros � " + soma / 5);
		
	}

}
