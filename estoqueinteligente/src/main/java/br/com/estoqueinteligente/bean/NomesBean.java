package br.com.estoqueinteligente.bean;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
@ManagedBean (name = "nome")
@ViewScoped
public class NomesBean {
private String nome;
private ArrayList<String> nomes = new ArrayList<String>();

public void addNome(){
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
public void setNomes(ArrayList<String> nomes) {
	this.nomes = nomes;
}

}
