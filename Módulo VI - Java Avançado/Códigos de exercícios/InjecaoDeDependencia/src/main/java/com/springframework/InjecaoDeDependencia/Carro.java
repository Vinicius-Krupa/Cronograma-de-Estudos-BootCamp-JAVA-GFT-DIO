package com.springframework.InjecaoDeDependencia;

public class Carro implements Veiculo {
	
	@Override
	public void acao() {
		System.out.println("É um carro.");
	}

}
