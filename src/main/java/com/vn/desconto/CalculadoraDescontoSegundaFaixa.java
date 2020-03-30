package com.vn.desconto;

public class CalculadoraDescontoSegundaFaixa extends CalculadoraFaixaDEsconto{

	public CalculadoraDescontoSegundaFaixa(CalculadoraFaixaDEsconto proximo) {
		super(proximo);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected double calcular(double valorTotal) {
		if(valorTotal>800.0 && valorTotal<=1000.0) 
			return valorTotal*0.06;
		return -1;
	}

}
