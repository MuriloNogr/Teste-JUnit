package br.com.fiap.elevador;

public class Elevador {
	private int id;
	private double cargaMaxima;
	private double cargaAtual;
	private boolean sinalAlerta;
	
	
	
	public Elevador(int id, double cargaMaxima, double cargaAtual, boolean sinalAlerta) {
		super();
		this.id = id;
		this.cargaMaxima = cargaMaxima;
		this.cargaAtual = cargaAtual;
		this.sinalAlerta = sinalAlerta;
	}
	
	Pessoa pessoa = new Pessoa("Murilo", 70.1);
	Calculadora calculadora = new Calculadora();
	
	public double entrarNoElevador (double cargaAtual, double peso) {
		cargaAtual = calculadora.somar(cargaAtual, pessoa.getPeso());
		System.out.println(cargaAtual);
		return cargaAtual;
	};
	public double sairNoElevador (double cargaAtual, double peso) {
		cargaAtual = calculadora.subtrair(cargaAtual, pessoa.getPeso());
		return cargaAtual;
	};
	
	public boolean avaliarPeso() {
		if (cargaAtual > cargaMaxima) {
	
		}return true;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getCargaMaxima() {
		return cargaMaxima;
	}
	public void setCargaMaxima(double cargaMaxima) {
		this.cargaMaxima = cargaMaxima;
	}
	public double getCargaAtual() {
		return cargaAtual;
	}
	public void setCargaAtual(double cargaAtual) {
		this.cargaAtual = cargaAtual;
	}
	public boolean isSinalAlerta() {
		return sinalAlerta;
	}
	public void setSinalAlerta(boolean sinalAlerta) {
		this.sinalAlerta = sinalAlerta;
	}
	
	
}
