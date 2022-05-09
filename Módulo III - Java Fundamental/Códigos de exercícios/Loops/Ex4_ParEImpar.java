package br.com.bootcamp.GFT.Java.metodos;

import java.util.Scanner;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números ímpares.
 */

public class Ex4_ParEImpar {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int quantosNumeros = 0;
		int i = 0;
		int numero = 0;
		int par = 0, impar = 0;
		
		System.out.println("Quantos números: ");
		quantosNumeros = scan.nextInt();
		
		while (i < quantosNumeros) {
			System.out.println("Número: ");
			numero = scan.nextInt();
			
			if (numero%2 == 0) {
				par++;
			}else {
				impar++;
			}
			i++;
		}
		System.out.println(par + " números pares.");
		System.out.println(impar + " números ímpares.");
	}

}
