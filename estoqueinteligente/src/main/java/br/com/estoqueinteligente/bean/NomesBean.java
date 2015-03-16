package br.com.estoqueinteligente.bean;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class NomesBean {

	private String nome;
	private ArrayList<String> nomes = new ArrayList<String>();

	public void adicionar() {
		this.nomes.add(nome);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<String> getNomes() {
		return nomes;
	}

}
