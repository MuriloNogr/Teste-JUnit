package br.com.fiap.elevador;

public class Pessoa {
	private String nome;
	private double peso;
	public Pessoa(String nome, double peso) {
		super();
		this.nome = nome;
		this.peso = peso;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
}
