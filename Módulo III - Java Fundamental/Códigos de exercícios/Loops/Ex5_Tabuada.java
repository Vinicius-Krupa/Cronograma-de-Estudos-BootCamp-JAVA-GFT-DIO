package br.com.bootcamp.GFT.Java.metodos;

import java.util.Scanner;

/*
Desenvolva um gerador de tabuada.
O usuário deve informar de qual número ele deseja ver a tabuada.
A saída deve ser conforme o exemplo abaixo:

Tabuada de 5:
5 X 1 = 5
5 X 2 = 10
...
5 X 10 = 50
 */

public class Ex5_Tabuada {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int tabuada = 0;
		
		System.out.println("Tabuada: ");
		tabuada = scan.nextInt();
		
		System.out.println("Tabuada de " + tabuada + ": ");
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(tabuada + " X " + i + " = " + tabuada * i);
		}
		
	}

}
