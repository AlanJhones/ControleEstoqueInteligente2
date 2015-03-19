package br.com.estoqueinteligente.bean;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.estoqueinteligente.model.Usuario;
import br.com.estoqueinteligente.util.JpaUtil;

public class UsuarioBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private List<Usuario> usuarios;

	/**
	 * @return the usuarios
	 */
	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	private EntityManager manager = JpaUtil.getEntityManager();

	public void consulta() {

		TypedQuery<Usuario> query = manager.createQuery("from usuario",
				Usuario.class);
		this.usuarios = (List<Usuario>) query.getResultList();

	}

	public void adicionar(Usuario usuario) {
		this.manager.persist(usuario);
	}

	public Usuario porID(long id) {
		return this.manager.find(Usuario.class, id);
	}
}
