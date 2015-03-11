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
	public void setSecao(Secao secao) {
		this.secao = secao;
	}

	
	
	
}

