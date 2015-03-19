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
@Table(name = "pedido")
public class Pedido implements Serializable{

	/**1L
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long id_pedido;
	private BigDecimal Vl_liquido;
	private BigDecimal vl_total;
	private BigDecimal vl_desconto;
	private Date dt_pedido;
	private Usuario usuario;
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
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((Vl_liquido == null) ? 0 : Vl_liquido.hashCode());
		result = prime * result + ((cliente == null) ? 0 : cliente.hashCode());
		result = prime * result
				+ ((dt_pedido == null) ? 0 : dt_pedido.hashCode());
		result = prime * result + (int) (id_pedido ^ (id_pedido >>> 32));
		result = prime * result + ((usuario == null) ? 0 : usuario.hashCode());
		result = prime * result
				+ ((vl_desconto == null) ? 0 : vl_desconto.hashCode());
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
		Pedido other = (Pedido) obj;
		if (Vl_liquido == null) {
			if (other.Vl_liquido != null)
				return false;
		} else if (!Vl_liquido.equals(other.Vl_liquido))
			return false;
		if (cliente == null) {
			if (other.cliente != null)
				return false;
		} else if (!cliente.equals(other.cliente))
			return false;
		if (dt_pedido == null) {
			if (other.dt_pedido != null)
				return false;
		} else if (!dt_pedido.equals(other.dt_pedido))
			return false;
		if (id_pedido != other.id_pedido)
			return false;
		if (usuario == null) {
			if (other.usuario != null)
				return false;
		} else if (!usuario.equals(other.usuario))
			return false;
		if (vl_desconto == null) {
			if (other.vl_desconto != null)
				return false;
		} else if (!vl_desconto.equals(other.vl_desconto))
			return false;
		if (vl_total == null) {
			if (other.vl_total != null)
				return false;
		} else if (!vl_total.equals(other.vl_total))
			return false;
		return true;
	}
	
	
	
}
