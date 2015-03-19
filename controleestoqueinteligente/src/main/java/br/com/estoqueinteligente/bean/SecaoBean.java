package br.com.estoqueinteligente.bean;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.estoqueinteligente.model.Secao;
import br.com.estoqueinteligente.util.JpaUtil;

public class SecaoBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Secao> secoes;

	public List<Secao> getSecoes() {
		return secoes;
	}

	private EntityManager manager = JpaUtil.getEntityManager();

	public void consulta() {

		TypedQuery<Secao> query = manager
				.createQuery("from secao", Secao.class);
		this.secoes = (List<Secao>) query.getResultList();

	}
	public void adicionar(Secao secao){
		this.manager.persist(secao);
	}

}
