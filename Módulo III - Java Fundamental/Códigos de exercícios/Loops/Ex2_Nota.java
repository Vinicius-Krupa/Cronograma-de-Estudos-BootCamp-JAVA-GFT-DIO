package br.com.bootcamp.GFT.Java.metodos;

import java.util.Scanner;

/*
Fa�a um programa que pe�a uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inv�lido e continue pedindo
at� que o usu�rio informe um valor v�lido.
 */

public class Ex2_Nota {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int nota;
		
		System.out.println("De (0 � 10) Digite a nota :");
		nota = scan.nextInt();
		
		while (nota < 0 || nota > 10) {
			System.out.println("Nota inv�lida, digite novamente: ");
			nota = scan.nextInt();
		}
		
		System.out.println("Nota = " + nota);

	}

}
