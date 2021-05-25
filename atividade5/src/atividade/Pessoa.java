package atividade;

import java.util.ArrayList;

public abstract class Pessoa {
	
	private String nome;
	private String endereco;
	
	public  Pessoa (String nome, String endereco) {
		this.nome = nome;
		this.endereco = endereco;
	}

	public  String getNome() {
		return this.nome;
	};

	public  String getEndereco() {
		return this.endereco;
	}

	public String toString() {
		String status = "Nome: "+this.getNome()+"|Endere�o: "+this.getEndereco()+"\n";
		return status;
	};
	
	public abstract ArrayList<String> getCursos();

}