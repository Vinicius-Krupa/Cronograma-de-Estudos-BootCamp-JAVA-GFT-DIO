package br.com.bootcamp.GFT.Java.Arrays;

/*
Crie um veto de 6 números inteiros
e mostre-os na ordem inversa.
 */

public class Ex1_OrdemInversa {

	public static void main(String[] args) {

		int[] vetor = {9, -5, 22, 51, -17, 102};
		int i = 0;
		
		System.out.println("Vetor: ");
		
		while(i <= vetor.length-1) {
			System.out.print(vetor[i] + " ");
			i++;
		}
		System.out.println("\nVetor inverso: ");
		
		for(i = (vetor.length-1); i >= 0; i--) {
			System.out.print(vetor[i] + " ");
		}
	}

}
