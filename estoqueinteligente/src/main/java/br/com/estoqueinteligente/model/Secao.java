package br.com.estoqueinteligente.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "secao")
public class Secao implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id_secao;
	private String tipo_secao;
	@Id
	@GeneratedValue
	public int getId_secao() {
		return id_secao;
	}
	public void setId_secao(int id_secao) {
		this.id_secao = id_secao;
	}
	@Column(length = 80)
	public String getTipo_secao() {
		return tipo_secao;
	}
	public void setTipo_secao(String tipo_secao) {
		this.tipo_secao = tipo_secao;
	}
	
	
	
}
