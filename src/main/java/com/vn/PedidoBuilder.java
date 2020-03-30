package com.vn;

import com.vn.desconto.CalculadoraDescontoPrimeiraFaixa;
import com.vn.desconto.CalculadoraDescontoSegundaFaixa;
import com.vn.desconto.CalculadoraDescontoTerceiraFaixa;
import com.vn.desconto.CalculadoraFaixaDEsconto;
import com.vn.desconto.SemDesconto;

public class PedidoBuilder {

	private Pedido intancia;
	
	public PedidoBuilder() {
		CalculadoraFaixaDEsconto calculadoraFaixaDEsconto= 
				new CalculadoraDescontoTerceiraFaixa(
					new CalculadoraDescontoSegundaFaixa(
						new CalculadoraDescontoPrimeiraFaixa(
							new SemDesconto(null))));
		intancia=new Pedido(calculadoraFaixaDEsconto);
	}
	public PedidoBuilder comItem(double valorUnitario,int quantidade) {
		intancia.adicionarItem(new ItemPedido("Gerado", valorUnitario, quantidade));
		return this;
	}
	public Pedido construir() {
		return intancia;
	}
}
