package com.vn.desconto;

public abstract class CalculadoraFaixaDEsconto {

	private CalculadoraFaixaDEsconto proximo;

	public CalculadoraFaixaDEsconto(CalculadoraFaixaDEsconto proximo) {
		this.proximo = proximo;
	}

	public double desconto(double valorTotal) {
		double desconto = calcular(valorTotal);
		
		if(desconto == -1) 
			return proximo.desconto(valorTotal);
			return desconto;				
	}
	protected abstract double calcular(double valorTotal);
	
}
