package br.com.bootcamp.GFT.Java.metodos;

import java.util.Scanner;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
 */

public class Ex3_MaiorEMedia {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int soma = 0, numeros = 0, maiorNumero = 0;
		int i = 0;
		
		do {
			System.out.println("Digite um número: ");
			numeros = scan.nextInt();
			
			soma += numeros;
			
			if (numeros > maiorNumero) {
				maiorNumero = numeros;
			}
			i++;
		} while (i < 5); 
		
		System.out.println("O maior número foi " + maiorNumero);
		System.out.println("A média dos números é " + soma / 5);
		
	}

}
