package br.com.estoqueinteligente.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "permissao")
public class Permissao implements Serializable {

	private static final long serialVersionUID = 1L;

	private long id_permissao;
	private String descricao;

	@Id
	@GeneratedValue
	public long getId_permissao() {
		return id_permissao;
	}

	public void setId_permissao(long id_permissao) {
		this.id_permissao = id_permissao;
	}

	@Column(length = 20)
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((descricao == null) ? 0 : descricao.hashCode());
		result = prime * result + (int) (id_permissao ^ (id_permissao >>> 32));
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
		Permissao other = (Permissao) obj;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (id_permissao != other.id_permissao)
			return false;
		return true;
	}

	/**
	 * 
	 */
}
