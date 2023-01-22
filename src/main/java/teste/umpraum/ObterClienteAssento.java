package teste.umpraum;


import infra.DAO;
import modelo.umpraum.Cliente;



public class ObterClienteAssento {
	public static void main(String[] args) {
		
		DAO<Cliente> daoCliente = new DAO<>(Cliente.class);
		
Cliente cliente = daoCliente.obterPorID(1L);
		
		System.out.println(cliente.getAssento().getNome());
		System.out.println(cliente.getAssento().getCliente().getNome());
		
		daoCliente.fechar();
		
	
		
		
		
		
	}

}
