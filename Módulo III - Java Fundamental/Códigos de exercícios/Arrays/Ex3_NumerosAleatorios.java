package br.com.bootcamp.GFT.Java.Arrays;

import java.util.Random;

/*
Fa�a um programa que leia 20 n�meros inteiros aleat�ios (entre 0 e 100)
armazene-os num vetor.
Ao final mostre os n�meros e seus sucessores.
 */

public class Ex3_NumerosAleatorios {

	public static void main(String[] args) {
		Random random = new Random();
		
		int[] numerosAleatorios = new int[20];
		int i = 0;
		
		while(i < numerosAleatorios.length) {
			int numero = random.nextInt(100);
			numerosAleatorios[i] = numero;
			i++;
		}
		
		System.out.print("N�meros aleat�rios: ");
		for (int numero : numerosAleatorios) {
			System.out.print(numero + " ");
		}
		
		System.out.print("\nSucessores dos n�meros aleat�rios: ");
		for (int numero : numerosAleatorios) {
			System.out.print((numero + 1) + " ");
		}
	
	
	}
	

}
