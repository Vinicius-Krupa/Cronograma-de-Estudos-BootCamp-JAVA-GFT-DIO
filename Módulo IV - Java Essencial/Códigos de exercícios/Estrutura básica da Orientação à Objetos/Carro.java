package Exerc�cios;

/*
Classe de exemplo para o exerc�cio da aula de Orienta��o � Objetos
 */

// Classe
class Carro extends Veiculo{
	
	// Atributos
	String cor;
	String modelo;
	int capacidadeTanque;
	
	// Construtor
	Carro() {
		
	}
	// Sobrecarga do construtor
	Carro(String cor, String modelo, int capacidadeTanque) {
		this.cor = cor;
		this.modelo = modelo;
		this.capacidadeTanque = capacidadeTanque;
	}
	
	// Get e Set
	void setCor(String cor) {
		this.cor = cor;
	}
	
	String getCor() {
		return cor;
	}
	
	void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	String getModelo() {
		return modelo;
	}
	
	void setCapacidadeTanque(int capacidadeTanque) {
		this.capacidadeTanque = capacidadeTanque;
	}
	
	int getCapacidadeTanque() {
		return capacidadeTanque;
	}
	
	// M�todo
	double totalValorTanque(double valorCombustivel) {
		return capacidadeTanque * valorCombustivel;
	}
	
	
}

