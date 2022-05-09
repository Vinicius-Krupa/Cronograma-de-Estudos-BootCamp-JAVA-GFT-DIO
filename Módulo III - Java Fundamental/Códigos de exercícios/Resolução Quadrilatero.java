package br.com.bootcamp.GFT.Java.metodos;

public class Main {

	public static void main(String[] args) {

		// Retorno (indicando o tipo de dado do m�todo, podemos armazer seus valores em vari�veis
		System.out.println("Exerc�cio retornos");
		
		double areaQuadrado = Quadrilatero.area(3);
		System.out.println("�rea do quadrado: " + areaQuadrado);
		
		double areaRetangulo = Quadrilatero.area(5d, 5d);
		System.out.println("�rea do ret�ngulo: " + areaRetangulo);
		
		double areaTrapezio = Quadrilatero.area(7, 8, 9);
		System.out.println("�rea do trap�zio: " + areaTrapezio);
		
		float areaLosango = Quadrilatero.area(5f, 5f);
		System.out.println("�rea do losango: " + areaLosango);
		
		
		
		/* Quadril�tero - Exerc�cio usando m�todos void (n�o retorna valor, portanto, n�o podemos guardar os valores em uma vari�vel
		 
		System.out.println("Exerc�cio quadril�tero");
		Quadrilatero.area(3);
		Quadrilatero.area(5d, 5d);
		Quadrilatero.area(7, 8, 9);
		Quadrilatero.area(5f, 5f);
		*/

	}

}
