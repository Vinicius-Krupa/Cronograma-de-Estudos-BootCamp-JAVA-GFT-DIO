package br.com.bootcamp.GFT.Java.Arrays;

import java.util.Random;

/*
Faça um programa que leia 20 números inteiros aleatóios (entre 0 e 100)
armazene-os num vetor.
Ao final mostre os números e seus sucessores.
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
		
		System.out.print("Números aleatórios: ");
		for (int numero : numerosAleatorios) {
			System.out.print(numero + " ");
		}
		
		System.out.print("\nSucessores dos números aleatórios: ");
		for (int numero : numerosAleatorios) {
			System.out.print((numero + 1) + " ");
		}
	
	
	}
	

}
