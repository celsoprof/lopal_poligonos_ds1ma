package br.com.engsenai.calculadora_poligonos.model;

public class Trapezio {

	private double baseMaior;
	private double baseMenor;
	private double altura;

	public void setBaseMaior(double baseMaior) {
		this.baseMaior = baseMaior;
	}

	public void setBaseMenor(double baseMenor) {
		this.baseMenor = baseMenor;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double calcularArea() {
		return (baseMaior + baseMenor) * altura / 2;
	}
	
	public void mostrarDados() {
		System.out.println("-----------------------");
		System.out.println("DADOS DO TRAPÉZIO");
		System.out.println("-----------------------");
		System.out.println("BASE MAIOR: " + baseMaior);
		System.out.println("BASE MENOR: " + baseMenor);
		System.out.println("ALTURA: " + altura);
		System.out.println("ÁREA: " + calcularArea());
		System.out.println("-----------------------");
	}

}
