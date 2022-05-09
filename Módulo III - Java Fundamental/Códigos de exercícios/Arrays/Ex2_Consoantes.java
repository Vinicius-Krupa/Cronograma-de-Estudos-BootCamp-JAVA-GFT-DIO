package br.com.bootcamp.GFT.Java.Arrays;

import java.util.Scanner;

/*
Faça um programa que leia um vetor de 6 caracteres,
e diga quantas consoantes foram lidas.
Imprima as consoantes.
 */

public class Ex2_Consoantes {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[] consoantes = new String[6];
		int quantidadeConsoantes = 0;
		
		for(int i = 0; i < consoantes.length; i++) {
			System.out.println("Letra: ");
			String letra = scan.next();
			
			if ( !(letra.equalsIgnoreCase("a") ||
				   letra.equalsIgnoreCase("e") ||
				   letra.equalsIgnoreCase("i") ||
				   letra.equalsIgnoreCase("o") ||
				   letra.equalsIgnoreCase("u"))) {
				
				consoantes[i] = letra;
				quantidadeConsoantes++;
			}
			
		}
		
		System.out.print("Consoantes: ");
		for (String consoante : consoantes) {
			if (consoante != null)
			System.out.print(consoante + " ");
		}
		System.out.println("\nQuantidade de consoantes: " + quantidadeConsoantes);
	}
		
}


