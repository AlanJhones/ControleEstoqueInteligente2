package br.com.estoqueinteligente.servlet;

import javax.persistence.Persistence;

public class CriaTabelas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Persistence.createEntityManagerFactory("EstoqueInteligente");
	
		}catch(Exception e){
			System.out.println("Erro: "+e.getMessage());
		}
		
	}

}
