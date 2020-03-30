package com.vn.desconto;

public class CalculadoraDescontoPrimeiraFaixa extends CalculadoraFaixaDEsconto{

	public CalculadoraDescontoPrimeiraFaixa(CalculadoraFaixaDEsconto proximo) {
		super(proximo);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected double calcular(double valorTotal) {
		if(valorTotal>300.0 && valorTotal<=800.0) 
			return valorTotal*0.04;
		
		return -1;
	}

}
