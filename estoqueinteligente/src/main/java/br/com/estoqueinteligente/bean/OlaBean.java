package br.com.estoqueinteligente.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "ola")
@ViewScoped
public class OlaBean {

	private String nome;
	private String sobrenome;
	private String nomeCompleto;
	public void dizerOla() {
	this.nomeCompleto = this.nome.toUpperCase()
	+ " " + this.sobrenome;
	}
	public String getNome() {
	return nome;
	}
	public void setNome(String nome) {
	this.nome = nome;
	}
	public String getSobrenome() {
	return sobrenome;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

}
