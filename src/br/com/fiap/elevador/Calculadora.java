package br.com.fiap.elevador;

public class Calculadora {
	private double resultado;
	
	public double somar (double valor1, double valor2) {
		resultado = valor1 + valor2;
		return resultado;
	};
	public double subtrair (double valor1, double valor2) {
		resultado = valor1 - valor2;
		return resultado;
	};
}
