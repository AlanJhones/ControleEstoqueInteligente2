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
@Table(name = "pedido")
public class pedido implements Serializable{

	/**1L
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long id_pedido;
	private BigDecimal Vl_liquido;
	private BigDecimal vl_total;
	private BigDecimal vl_desconto;
	private Date dt_pedido;
	private usuario usuario;
	private Cliente cliente;
	@Id
	@GeneratedValue
	public long getId_pedido() {
		return id_pedido;
	}
	public void setId_pedido(long id_pedido) {
		this.id_pedido = id_pedido;
	}
	public BigDecimal getVl_liquido() {
		return Vl_liquido;
	}
	public void setVl_liquido(BigDecimal vl_liquido) {
		Vl_liquido = vl_liquido;
	}
	public BigDecimal getVl_total() {
		return vl_total;
	}
	public void setVl_total(BigDecimal vl_total) {
		this.vl_total = vl_total;
	}
	public BigDecimal getVl_desconto() {
		return vl_desconto;
	}
	public void setVl_desconto(BigDecimal vl_desconto) {
		this.vl_desconto = vl_desconto;
	}
	@Temporal(TemporalType.TIME)
	@Column(name =  "dt_pedido")
	public Date getDt_pedido() {
		return dt_pedido;
	}
	public void setDt_pedido(Date dt_pedido) {
		this.dt_pedido = dt_pedido;
	}
	@ManyToOne(optional = false)
	@JoinColumn(name = "fk_pessoa")
	public usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(usuario usuario) {
		this.usuario = usuario;
	}
	@ManyToOne(optional = false)
	@JoinColumn(name = "fk_cliente")
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	
}
