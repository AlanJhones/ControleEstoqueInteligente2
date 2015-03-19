package br.com.estoqueinteligente.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name = "pedidoitens")
public class Pedidoitens implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long id_pedido_itens;
	private BigDecimal quantidade;
	private BigDecimal vl_liquido;
	private BigDecimal vl_total;
	private BigDecimal vl_desconto;
	
	private Produto produto;
	private Pedido pedido;
	
	@Id
	@GeneratedValue
	public long getId_pedido_itens() {
		return id_pedido_itens;
	}
	public void setId_pedido_itens(long id_pedido_itens) {
		this.id_pedido_itens = id_pedido_itens;
	}
	@Column(precision = 13, scale = 2)
	public BigDecimal getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(BigDecimal quantidade) {
		this.quantidade = quantidade;
	}
	@Column(precision = 13, scale = 2)
	public BigDecimal getVl_liquido() {
		return vl_liquido;
	}
	public void setVl_liquido(BigDecimal vl_liquido) {
		this.vl_liquido = vl_liquido;
	}
	@Column(precision = 13, scale = 2)
	public BigDecimal getVl_total() {
		return vl_total;
	}
	public void setVl_total(BigDecimal vl_total) {
		this.vl_total = vl_total;
	}
	@Column(precision = 13, scale = 2)
	public BigDecimal getVl_desconto() {
		return vl_desconto;
	}
	public void setVl_desconto(BigDecimal vl_desconto) {
		this.vl_desconto = vl_desconto;
	}
	@ManyToOne(optional = false)
	@JoinColumn(name = "fk_produto")
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ (int) (id_pedido_itens ^ (id_pedido_itens >>> 32));
		result = prime * result + ((pedido == null) ? 0 : pedido.hashCode());
		result = prime * result + ((produto == null) ? 0 : produto.hashCode());
		result = prime * result
				+ ((quantidade == null) ? 0 : quantidade.hashCode());
		result = prime * result
				+ ((vl_desconto == null) ? 0 : vl_desconto.hashCode());
		result = prime * result
				+ ((vl_liquido == null) ? 0 : vl_liquido.hashCode());
		result = prime * result
				+ ((vl_total == null) ? 0 : vl_total.hashCode());
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
		Pedidoitens other = (Pedidoitens) obj;
		if (id_pedido_itens != other.id_pedido_itens)
			return false;
		if (pedido == null) {
			if (other.pedido != null)
				return false;
		} else if (!pedido.equals(other.pedido))
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
		if (vl_desconto == null) {
			if (other.vl_desconto != null)
				return false;
		} else if (!vl_desconto.equals(other.vl_desconto))
			return false;
		if (vl_liquido == null) {
			if (other.vl_liquido != null)
				return false;
		} else if (!vl_liquido.equals(other.vl_liquido))
			return false;
		if (vl_total == null) {
			if (other.vl_total != null)
				return false;
		} else if (!vl_total.equals(other.vl_total))
			return false;
		return true;
	}
	@ManyToOne(optional = false)
	@JoinColumn(name = "fk_pedido")
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	
	}
