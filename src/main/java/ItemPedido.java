
public class ItemPedido {
	public String descricao;
	public double valorunitario;
	public int qtd;

	public ItemPedido(String descricao, double valorunitario, int qtd) {
		this.descricao = descricao;
		this.valorunitario = valorunitario;
		this.qtd = qtd;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValorunitario() {
		return valorunitario;
	}

	public void setValorunitario(double valorunitario) {
		this.valorunitario = valorunitario;
	}

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
}