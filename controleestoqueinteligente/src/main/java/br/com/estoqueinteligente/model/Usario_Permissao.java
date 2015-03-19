package br.com.estoqueinteligente.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "usuario_permissao")
public class Usario_Permissao implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	private long id_usuario_permissao;
	private Usuario usuario;
	private Permissao permissao;
	
	@Id
	@GeneratedValue
	public long getId_usuario_permissao() {
		return id_usuario_permissao;
	}

	public void setId_usuario_permissao(long id_usuario_permissao) {
		this.id_usuario_permissao = id_usuario_permissao;
	}
	@ManyToOne(optional = false)
	@JoinColumn(name = "fk_usuario")
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	@ManyToOne(optional = false)
	@JoinColumn(name = "fk_permissao")
	public Permissao getPermissao() {
		return permissao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ (int) (id_usuario_permissao ^ (id_usuario_permissao >>> 32));
		result = prime * result
				+ ((permissao == null) ? 0 : permissao.hashCode());
		result = prime * result + ((usuario == null) ? 0 : usuario.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usario_Permissao other = (Usario_Permissao) obj;
		if (id_usuario_permissao != other.id_usuario_permissao)
			return false;
		if (permissao == null) {
			if (other.permissao != null)
				return false;
		} else if (!permissao.equals(other.permissao))
			return false;
		if (usuario == null) {
			if (other.usuario != null)
				return false;
		} else if (!usuario.equals(other.usuario))
			return false;
		return true;
	}

	public void setPermissao(Permissao permissao) {
		this.permissao = permissao;
	}
}
