package Exerc�cios;

/*
Classe de exemplo para o exerc�cio da aula de Orienta��o � Objetos
 */

public class RodarAplicacao {

	public static void main(String[] args) {
		// Criando o objeto e atribuindo a vari�vel carro1
		Carro carro1 = new Carro();
		
		carro1.setCor("Azul");
		carro1.setModelo("BMW S�rie 3");
		carro1.setCapacidadeTanque(59);
			
		System.out.println(carro1.getModelo());
		System.out.println(carro1.getCor());
		System.out.println(carro1.getCapacidadeTanque());
		System.out.println(carro1.totalValorTanque(6.39));
		
		// Criando o objeto e atribuindo a vari�vel carro2 (usando a sobrecarga Carro(com par�metro)
		Carro carro2 = new Carro("Cinza", "Mercedes-Benz Classe C", 66);
		
		System.out.println(carro2.getModelo());
		System.out.println(carro2.getCor());
		System.out.println(carro2.getCapacidadeTanque());
		System.out.println(carro2.totalValorTanque(6.46));

	}

}
