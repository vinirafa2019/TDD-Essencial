package com.vn.desconto;

public class CalculadoraDescontoTerceiraFaixa extends CalculadoraFaixaDEsconto{



	public CalculadoraDescontoTerceiraFaixa(CalculadoraFaixaDEsconto proximo) {
		super(proximo);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected double calcular(double valorTotal) {
		 if(valorTotal>1000.0) 
				return valorTotal*0.08;
			
		return -1;
	}

}
