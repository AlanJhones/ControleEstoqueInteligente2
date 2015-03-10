package br.com.estoqueinteligente.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

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
@Table(name = "estoque")
public class estoque implements Serializable {
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
		private long id_estoque;
		private BigDecimal quantidade;
		private Date dt_lancamento;
		private produto produto;
		
		@Id
		@GeneratedValue
		public long getId_estoque() {
			return id_estoque;
		}
		public void setId_estoque(long id_estoque) {
			this.id_estoque = id_estoque;
		}
		@Column(precision = 10, scale = 2)
		public BigDecimal getQuantidade() {
			return quantidade;
		}
		public void setQuantidade(BigDecimal quantidade) {
			this.quantidade = quantidade;
		}
		
		@ManyToOne(optional = false)
		@JoinColumn(name = "fk_produto")
		public produto getProduto() {
			return produto;
		}
		@Temporal (TemporalType.DATE)
		@Column(name = "dt_lancamento")
		public Date getDt_lancamento() {
			return dt_lancamento;
		}
				
		public void setDt_lancamento(Date dt_lancamento) {
			this.dt_lancamento = dt_lancamento;
		}
		public void setProduto(produto produto) {
			this.produto = produto;
		}
	
		
		
		
}
