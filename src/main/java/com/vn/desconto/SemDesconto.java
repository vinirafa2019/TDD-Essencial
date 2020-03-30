package com.vn.desconto;

public class SemDesconto extends CalculadoraFaixaDEsconto{

	public SemDesconto(CalculadoraFaixaDEsconto proximo) {
		super(proximo);
	}

	@Override
	protected double calcular(double valorTotal) {
		return 0;
	}
	

}
