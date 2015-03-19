package br.com.estoqueinteligente.DAO;

import br.com.estoqueinteligente.abstracts.GenericDAO;
import br.com.estoqueinteligente.model.Cliente;

public class ClienteDao extends GenericDAO<Cliente>{

	public ClienteDao() {
		super(Cliente.class);
		// TODO Auto-generated constructor stub
	}
	
	public void delete (Cliente cliente){
		super.delete(cliente.getId_cliente(), Cliente.class);
	}
	
	@Override
	public void save(Cliente entity) {
		// TODO Auto-generated method stub
		super.save(entity);
	}

}
