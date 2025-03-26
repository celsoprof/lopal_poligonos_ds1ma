package br.com.engsenai.calculadora_poligonos.model;

public class Quadrado{
	
	private double lado;
	
	public void setLado(double lado) {
		this.lado = lado;
	}
	
	private double calcularArea() {
		double area = Math.pow(lado, 2);
		return area;
	}
	
	private double calcularPerimetro() {
		double perimetro = lado * 4;
		return perimetro;
	}
	
	public void mostrarDados() {
		System.out.println("-----------------------");
		System.out.println("DADOS DO QUADRADO");
		System.out.println("-----------------------");
		System.out.println("LADO: " + lado);
		System.out.println("ÁREA: " + calcularArea());
		System.out.println("PERÍMETRO: " + calcularPerimetro());
		System.out.println("-----------------------");
	}
	
}
