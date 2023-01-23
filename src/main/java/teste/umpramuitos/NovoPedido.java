package teste.umpramuitos;

import infra.DAO;
import modelo.basico.Produto;
import modelo.umpramuitos.ItemPedido;
import modelo.umpramuitos.Pedido;

public class NovoPedido {
	
	public static void main(String[] args) {
		
		DAO<Object> dao = new DAO<>();
		
		Pedido pedido = new Pedido();
		Produto produto = new Produto("Smart TV", 1487.34);
		ItemPedido item = new ItemPedido(pedido, produto, 10);
		
		dao.abrirT()
		.incluir(produto)
		.incluir(pedido)
		.incluir(item)
		.fecharT()
		.fechar();
	}

}