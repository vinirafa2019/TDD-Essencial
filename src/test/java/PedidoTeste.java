import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PedidoTeste {

	private Pedido pedido;
	
	@Before
	public void setup() {
		pedido=new Pedido();
	}
	
	@Test
	public void deveConverterNomeSimples() throws Exception {		
		assertEquals("Lionel",pedido.converter("lionel"));
	}
	@Test
	public void deveConverterNomeSimplesMisturado() throws Exception {
		assertEquals("Lionel",pedido.converter("LIonEl"));
	}
		
	private void assertResumoPedido(double valorTotal,double desconto) {
		assertEquals(valorTotal,pedido.valorTotal(),0.0001);
		assertEquals(desconto, pedido.desconto(),0.001);
	}
	@Test
	public void deveAdicionarItemNoPedido() throws Exception {
		pedido.adicionarItem(new ItemPedido("Sabonete", 3.0, 10));
	}

	@Test
	public void deveCalcularValorTotaleDescontoParaPedidoVazio() throws Exception {	
		assertResumoPedido(0.0,0.0);	
	}
	@Test
	public void daveCalcularResumoParaumItemSemDesconto() throws Exception {
		pedido.adicionarItem(new ItemPedido("Sabonete", 5.0, 5));
		assertResumoPedido(25.0,0.0);
	}
	@Test
	public void deveCalcularResumoParaDoisItens() throws Exception {
		pedido.adicionarItem(new ItemPedido("Sabonete", 3.0, 3));
		pedido.adicionarItem(new ItemPedido("Creme dental", 7.0, 3));
		
		
		assertResumoPedido(30,0.0);
	}
}
