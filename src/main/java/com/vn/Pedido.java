package com.vn;

import java.util.ArrayList;
import java.util.List;

import com.vn.desconto.CalculadoraFaixaDEsconto;
import com.vn.exception.QauntidadeItensInvalidaException;

public class Pedido {

	private List<ItemPedido>itens = new ArrayList<>() ;
	
	private CalculadoraFaixaDEsconto calculadoraFaixaDEsconto;
	
	
	public Pedido(CalculadoraFaixaDEsconto calculadoraFaixaDEsconto) {
		this.calculadoraFaixaDEsconto = calculadoraFaixaDEsconto;
	}

	public String converter(String nome) {
		
		return nome.substring(0,1).toUpperCase()+nome.substring(1).toLowerCase();
	}

	private void ValidarQuantidadeItens(ItemPedido itemPedido) {
		if(itemPedido.getQtd()<0)
			throw new QauntidadeItensInvalidaException();
	}
	
	public void adicionarItem(ItemPedido itemPedido) {
		ValidarQuantidadeItens(itemPedido);
		itens.add(itemPedido);
		
	}

	public ResumoPedido resumo() {
		double valorTotal = itens.stream().mapToDouble(i -> i.getValorunitario()*i.getQtd()).sum();
		double desconto= calculadoraFaixaDEsconto.desconto(valorTotal);
		return new ResumoPedido(valorTotal,desconto);
	}



}
