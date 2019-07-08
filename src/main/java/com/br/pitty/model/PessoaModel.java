package com.br.pitty.model;

public class PessoaModel {

	private String nome;
	private String email;
	private int idade;
	private int quantidadesMalas;
	
	
	public PessoaModel() {
		
	}
	
	public PessoaModel(String nome, String email, int idade, int quantidadesMalas) {
		this.nome = nome;
		this.email = email;
		this.idade = idade;
		this.quantidadesMalas = quantidadesMalas;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public int getQuantidadesMalas() {
		return quantidadesMalas;
	}


	public void setQuantidadesMalas(int quantidadesMalas) {
		this.quantidadesMalas = quantidadesMalas;
	}


	public String getNome() {
		return nome;
	}
	
	

@Override
public String toString() {
	StringBuilder modelo = new StringBuilder();

	modelo.append("Sabor: " +this.email);
	modelo.append("\n");
	modelo.append("Massa: "+ this.idade);
	modelo.append("Borda: " +this.nome);
	modelo.append("\n");
	modelo.append("Valor: "+ this.quantidadesMalas);
	return super.toString();
	
	
}


}
