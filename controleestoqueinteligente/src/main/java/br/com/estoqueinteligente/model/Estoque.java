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
@Table(name = "estoque")
public class Estoque implements Serializable {
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
		private long id_estoque;
		private BigDecimal quantidade;
		private Date dt_lancamento;
		private Produto produto;
		
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
		public Produto getProduto() {
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
		public void setProduto(Produto produto) {
			this.produto = produto;
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result
					+ ((dt_lancamento == null) ? 0 : dt_lancamento.hashCode());
			result = prime * result + (int) (id_estoque ^ (id_estoque >>> 32));
			result = prime * result
					+ ((produto == null) ? 0 : produto.hashCode());
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
			Estoque other = (Estoque) obj;
			if (dt_lancamento == null) {
				if (other.dt_lancamento != null)
					return false;
			} else if (!dt_lancamento.equals(other.dt_lancamento))
				return false;
			if (id_estoque != other.id_estoque)
				return false;
			if (produto == null) {
				if (other.produto != null)
					return false;
			} else if (!produto.equals(other.produto))
				return false;
			if (quantidade == null) {
				if (other.quantidade != null)
					return false;
			} else if (!quantidade.equals(other.quantidade))
				return false;
			return true;
		}
	
		
		
		
}
