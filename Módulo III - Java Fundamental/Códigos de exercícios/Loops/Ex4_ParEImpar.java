package br.com.bootcamp.GFT.Java.metodos;

import java.util.Scanner;

/*
Fa�a um programa que pe�a N n�meros inteiros,
calcule e mostre a quantidade de n�meros pares
e a quantidade de n�meros �mpares.
 */

public class Ex4_ParEImpar {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int quantosNumeros = 0;
		int i = 0;
		int numero = 0;
		int par = 0, impar = 0;
		
		System.out.println("Quantos n�meros: ");
		quantosNumeros = scan.nextInt();
		
		while (i < quantosNumeros) {
			System.out.println("N�mero: ");
			numero = scan.nextInt();
			
			if (numero%2 == 0) {
				par++;
			}else {
				impar++;
			}
			i++;
		}
		System.out.println(par + " n�meros pares.");
		System.out.println(impar + " n�meros �mpares.");
	}

}
