package br.com.estoqueinteligente.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Table(name = "cliente")
public class Cliente implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private long id_cliente;
	
	private String nome;	
	private String sobrenome;	
	private String rg;	
	private String cpf;	
	private String endereco;	
	private String complemento;	
	private String bairro;	
	private String estado;
	private Date dt_nascimento;	
	private Date dt_cadastro;	
	private Date dt_ulti_visita;	
	private Date dt_ult_compra;
	
	@Id
	@GeneratedValue
	public long getId_cliente() {
		return id_cliente;
	}
	
	public void setId_cliente(long id_cliente) {
		this.id_cliente = id_cliente;
	}
	@Column(length =  30)
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Column(length =  50)
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	@Column(length =  30)
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	@Column(length =  30)
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	@Column(length =  50)
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	@Column(length =  30)
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	@Column(length =  50)
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	@Column(length =  50)
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	@Temporal (TemporalType.DATE)
	@Column(name = "dt_nascimento")
	public Date getDt_nascimento() {
		return dt_nascimento;
	}
	public void setDt_nascimento(Date dt_nascimento) {
		this.dt_nascimento = dt_nascimento;
	}
	@Temporal (TemporalType.DATE)
	@Column(name = "dt_cadastro")
	public Date getDt_cadastro() {
		return dt_cadastro;
	}
	public void setDt_cadastro(Date dt_cadastro) {
		this.dt_cadastro = dt_cadastro;
	}
	@Temporal (TemporalType.DATE)
	@Column(name = "dt_ulti_visita")
	public Date getDt_ulti_visita() {
		return dt_ulti_visita;
	}
	public void setDt_ulti_visita(Date dt_ulti_visita) {
		this.dt_ulti_visita = dt_ulti_visita;
	}
	@Temporal (TemporalType.DATE)
	@Column(name = "dt_ult_compra")
	public Date getDt_ult_compra() {
		return dt_ult_compra;
	}
	public void setDt_ult_compra(Date dt_ult_compra) {
		this.dt_ult_compra = dt_ult_compra;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bairro == null) ? 0 : bairro.hashCode());
		result = prime * result
				+ ((complemento == null) ? 0 : complemento.hashCode());
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		result = prime * result
				+ ((dt_cadastro == null) ? 0 : dt_cadastro.hashCode());
		result = prime * result
				+ ((dt_nascimento == null) ? 0 : dt_nascimento.hashCode());
		result = prime * result
				+ ((dt_ult_compra == null) ? 0 : dt_ult_compra.hashCode());
		result = prime * result
				+ ((dt_ulti_visita == null) ? 0 : dt_ulti_visita.hashCode());
		result = prime * result
				+ ((endereco == null) ? 0 : endereco.hashCode());
		result = prime * result + ((estado == null) ? 0 : estado.hashCode());
		result = prime * result + (int) (id_cliente ^ (id_cliente >>> 32));
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((rg == null) ? 0 : rg.hashCode());
		result = prime * result
				+ ((sobrenome == null) ? 0 : sobrenome.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Cliente)) {
			return false;
		}
		Cliente other = (Cliente) obj;
		if (bairro == null) {
			if (other.bairro != null) {
				return false;
			}
		} else if (!bairro.equals(other.bairro)) {
			return false;
		}
		if (complemento == null) {
			if (other.complemento != null) {
				return false;
			}
		} else if (!complemento.equals(other.complemento)) {
			return false;
		}
		if (cpf == null) {
			if (other.cpf != null) {
				return false;
			}
		} else if (!cpf.equals(other.cpf)) {
			return false;
		}
		if (dt_cadastro == null) {
			if (other.dt_cadastro != null) {
				return false;
			}
		} else if (!dt_cadastro.equals(other.dt_cadastro)) {
			return false;
		}
		if (dt_nascimento == null) {
			if (other.dt_nascimento != null) {
				return false;
			}
		} else if (!dt_nascimento.equals(other.dt_nascimento)) {
			return false;
		}
		if (dt_ult_compra == null) {
			if (other.dt_ult_compra != null) {
				return false;
			}
		} else if (!dt_ult_compra.equals(other.dt_ult_compra)) {
			return false;
		}
		if (dt_ulti_visita == null) {
			if (other.dt_ulti_visita != null) {
				return false;
			}
		} else if (!dt_ulti_visita.equals(other.dt_ulti_visita)) {
			return false;
		}
		if (endereco == null) {
			if (other.endereco != null) {
				return false;
			}
		} else if (!endereco.equals(other.endereco)) {
			return false;
		}
		if (estado == null) {
			if (other.estado != null) {
				return false;
			}
		} else if (!estado.equals(other.estado)) {
			return false;
		}
		if (id_cliente != other.id_cliente) {
			return false;
		}
		if (nome == null) {
			if (other.nome != null) {
				return false;
			}
		} else if (!nome.equals(other.nome)) {
			return false;
		}
		if (rg == null) {
			if (other.rg != null) {
				return false;
			}
		} else if (!rg.equals(other.rg)) {
			return false;
		}
		if (sobrenome == null) {
			if (other.sobrenome != null) {
				return false;
			}
		} else if (!sobrenome.equals(other.sobrenome)) {
			return false;
		}
		return true;
	}	
	
	
}
