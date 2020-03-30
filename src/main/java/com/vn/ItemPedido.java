package com.vn;

public class ItemPedido {
	public String descricao;
	public double valorUnitario;
	public int quantidade;

	public ItemPedido(String descricao, double valorUnitario, int quantidade) {
		this.descricao = descricao;
		this.valorUnitario = valorUnitario;
		this.quantidade = quantidade;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValorunitario() {
		return valorUnitario;
	}

	public void setValorunitario(double valorunitario) {
		this.valorUnitario = valorunitario;
	}

	public int getQtd() {
		return quantidade;
	}

	public void setQtd(int qtd) {
		this.quantidade = qtd;
	}
}