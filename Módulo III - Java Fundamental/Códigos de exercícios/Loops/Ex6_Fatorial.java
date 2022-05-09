package br.com.bootcamp.GFT.Java.metodos;

import java.util.Scanner;

/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5! = 120
 */

public class Ex6_Fatorial {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
				
		System.out.println("Fatorial de: ");
		int fatorial = scan.nextInt();
		
		int multiplicacao = 1;
		
		System.out.print(fatorial + "! = ");
		
		for(int i = fatorial; i >= 1; i--) {
			multiplicacao = multiplicacao * i; // 1 * 5 = 5 -> 5 * 4 = 20 -> 20 * 3 = 60 -> 60 * 2 = 120 -> 120 * 1 = 120
		}
		
		System.out.println(multiplicacao);
		
	}

}
