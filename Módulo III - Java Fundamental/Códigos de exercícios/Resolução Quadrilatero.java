package br.com.bootcamp.GFT.Java.metodos;

public class Main {

	public static void main(String[] args) {

		// Retorno (indicando o tipo de dado do método, podemos armazer seus valores em variáveis
		System.out.println("Exercício retornos");
		
		double areaQuadrado = Quadrilatero.area(3);
		System.out.println("Área do quadrado: " + areaQuadrado);
		
		double areaRetangulo = Quadrilatero.area(5d, 5d);
		System.out.println("Área do retângulo: " + areaRetangulo);
		
		double areaTrapezio = Quadrilatero.area(7, 8, 9);
		System.out.println("Área do trapézio: " + areaTrapezio);
		
		float areaLosango = Quadrilatero.area(5f, 5f);
		System.out.println("Área do losango: " + areaLosango);
		
		
		
		/* Quadrilátero - Exercício usando métodos void (não retorna valor, portanto, não podemos guardar os valores em uma variável
		 
		System.out.println("Exercício quadrilátero");
		Quadrilatero.area(3);
		Quadrilatero.area(5d, 5d);
		Quadrilatero.area(7, 8, 9);
		Quadrilatero.area(5f, 5f);
		*/

	}

}
