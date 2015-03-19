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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((dt_Lancamento == null) ? 0 : dt_Lancamento.hashCode());
		result = prime * result
				+ ((hr_Lancamento == null) ? 0 : hr_Lancamento.hashCode());
		result = prime * result + (int) (id_historico ^ (id_historico >>> 32));
		result = prime * result
				+ ((quantidade == null) ? 0 : quantidade.hashCode());
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
		Historico other = (Historico) obj;
		if (dt_Lancamento == null) {
			if (other.dt_Lancamento != null)
				return false;
		} else if (!dt_Lancamento.equals(other.dt_Lancamento))
			return false;
		if (hr_Lancamento == null) {
			if (other.hr_Lancamento != null)
				return false;
		} else if (!hr_Lancamento.equals(other.hr_Lancamento))
			return false;
		if (id_historico != other.id_historico)
			return false;
		if (quantidade == null) {
			if (other.quantidade != null)
				return false;
		} else if (!quantidade.equals(other.quantidade))
			return false;
		return true;
	}
	
	
	
	
}
