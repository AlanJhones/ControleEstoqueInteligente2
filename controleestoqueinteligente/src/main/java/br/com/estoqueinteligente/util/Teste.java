package br.com.estoqueinteligente.util;

import javax.persistence.EntityManager;

import br.com.estoqueinteligente.model.Usuario;

public class Teste {

	public static void main(String[] args) {

		EntityManager manager = JpaUtil.getEntityManager();
		// EntityTransaction
		// trx = manager.getTransaction();
		// trx.begin();

		Usuario usuarioteste = (Usuario) manager.find(Usuario.class,
				Long.parseLong("1"));
		System.out.println();

		System.out.println(Utilitario.gerarSenhaSHA("12345"));

	}
}

/**
 * * Usuario usuario = new Usuario(); usuario.setLogin("admin");
 * usuario.setNome("jõao"); usuario.setSenha(Utilitario.gerarSenhaSHA("12345"));
 * 
 * manager.persist(usuario); trx.commit(); manager.close();
 **/
