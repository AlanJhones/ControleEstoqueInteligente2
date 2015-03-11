package br.com.estoqueinteligente.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Table(name = "historico")
public class Historico implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long id_historico;
	private Date dt_Lancamento;
	private Date hr_Lancamento;
	private BigDecimal quantidade;
	
	@Id
	@GeneratedValue
	public long getId_historico() {
		return id_historico;
	}
	public void setId_historico(long id_historico) {
		this.id_historico = id_historico;
	}
	@Temporal(TemporalType.DATE)
	@Column(name =  "dt_Lancamento")
	public Date getDt_Lancamento() {
		return dt_Lancamento;
	}
	public void setDt_Lancamento(Date dt_Lancamento) {
		this.dt_Lancamento = dt_Lancamento;
	}
	@Temporal(TemporalType.TIME)
	@Column(name =  "hr_Lancamento")
	public Date getHr_Lancamento() {
		return hr_Lancamento;
	}
	public void setHr_Lancamento(Date hr_Lancamento) {
		this.hr_Lancamento = hr_Lancamento;
	}
	@Column(precision = 10, scale = 2)
	public BigDecimal getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(BigDecimal quantidade) {
		this.quantidade = quantidade;
	}
	
	
	
	
}
