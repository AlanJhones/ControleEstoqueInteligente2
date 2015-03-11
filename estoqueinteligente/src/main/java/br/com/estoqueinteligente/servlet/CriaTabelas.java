package br.com.estoqueinteligente.servlet;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CriaTabelas {
	private static EntityManagerFactory entityManagerFactory = Persistence
			.createEntityManagerFactory("EstoqueInteligente");

	public static EntityManager createEntityManager() {
		return entityManagerFactory.createEntityManager();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManager manager = CriaTabelas.createEntityManager();
		manager.close();
	}

}
