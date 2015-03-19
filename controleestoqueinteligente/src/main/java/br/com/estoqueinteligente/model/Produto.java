package br.com.estoqueinteligente.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Table(name = "produto")
public class Produto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long id_produto;
	private String descricao;
	private BigDecimal vl_Compra;
	private BigDecimal vl_Venda;	
	private Date dt_cadastro;
	private Date hr_cadastro;
	private Secao secao;
	@Id
	@GeneratedValue
	public long getId_produto() {
		return id_produto;
	}
	public void setId_produto(long id_produto) {
		this.id_produto = id_produto;
	}
	@Column(length =  50)
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	@Column(precision = 13, scale = 2)
	public BigDecimal getVl_Compra() {
		return vl_Compra;
	}
	public void setVl_Compra(BigDecimal vl_Compra) {
		this.vl_Compra = vl_Compra;
	}
	@Column(precision = 13, scale = 2)
	public BigDecimal getVl_Venda() {
		return vl_Venda;
	}
	public void setVl_Venda(BigDecimal vl_Venda) {
		this.vl_Venda = vl_Venda;
	}
	@Temporal(TemporalType.DATE)
	@Column(name =  "dt_cadastro")
	public Date getDt_cadastro() {
		return dt_cadastro;
	}
	public void setDt_cadastro(Date dt_cadastro) {
		this.dt_cadastro = dt_cadastro;
	}
	@Temporal(TemporalType.TIME)
	@Column(name =  "hr_cadastro")
	public Date getHr_cadastro() {
		return hr_cadastro;
	}
	public void setHr_cadastro(Date hr_cadastro) {
		this.hr_cadastro = hr_cadastro;
	}
	@ManyToOne(optional = false)
	@JoinColumn(name = "fk_secao")
	public Secao getSecao() {
		return secao;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((descricao == null) ? 0 : descricao.hashCode());
		result = prime * result
				+ ((dt_cadastro == null) ? 0 : dt_cadastro.hashCode());
		result = prime * result
				+ ((hr_cadastro == null) ? 0 : hr_cadastro.hashCode());
		result = prime * result + (int) (id_produto ^ (id_produto >>> 32));
		result = prime * result + ((secao == null) ? 0 : secao.hashCode());
		result = prime * result
				+ ((vl_Compra == null) ? 0 : vl_Compra.hashCode());
		result = prime * result
				+ ((vl_Venda == null) ? 0 : vl_Venda.hashCode());
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
		Produto other = (Produto) obj;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (dt_cadastro == null) {
			if (other.dt_cadastro != null)
				return false;
		} else if (!dt_cadastro.equals(other.dt_cadastro))
			return false;
		if (hr_cadastro == null) {
			if (other.hr_cadastro != null)
				return false;
		} else if (!hr_cadastro.equals(other.hr_cadastro))
			return false;
		if (id_produto != other.id_produto)
			return false;
		if (secao == null) {
			if (other.secao != null)
				return false;
		} else if (!secao.equals(other.secao))
			return false;
		if (vl_Compra == null) {
			if (other.vl_Compra != null)
				return false;
		} else if (!vl_Compra.equals(other.vl_Compra))
			return false;
		if (vl_Venda == null) {
			if (other.vl_Venda != null)
				return false;
		} else if (!vl_Venda.equals(other.vl_Venda))
			return false;
		return true;
	}
	public void setSecao(Secao secao) {
		this.secao = secao;
	}

	
	
	
}

