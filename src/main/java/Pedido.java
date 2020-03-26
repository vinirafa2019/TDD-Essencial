import java.util.List;

public class Pedido {

	private double valorTotal=0;
	private double desconto=0;
	private List<ItemPedido>itens;
	
	public String converter(String nome) {
		
		return nome.substring(0,1).toUpperCase()+nome.substring(1).toLowerCase();
	}

	public void adicionarItem(ItemPedido ItemPedido) {
		
	}

	public double valorTotal() {
		valorTotal +=ItemPedido.getValorunitario()*ItemPedido.getQtd();
		return valorTotal;
	}

	public double desconto() {
		
		return desconto;
	}

}
