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
public class pedidoitens implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long id_pedido_itens;
	private BigDecimal quantidade;
	private BigDecimal vl_liquido;
	private BigDecimal vl_total;
	private BigDecimal vl_desconto;
	
	private produto produto;
	private pedido pedido;
	
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
	public produto getProduto() {
		return produto;
	}
	public void setProduto(produto produto) {
		this.produto = produto;
	}
	@ManyToOne(optional = false)
	@JoinColumn(name = "fk_pedido")
	public pedido getPedido() {
		return pedido;
	}
	public void setPedido(pedido pedido) {
		this.pedido = pedido;
	}
	
	}
