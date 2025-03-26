package br.com.engsenai.calculadora_poligonos.dao;

import java.util.Scanner;

import br.com.engsenai.calculadora_poligonos.model.Quadrado;
import br.com.engsenai.calculadora_poligonos.ui.Menu;

public class QuadradoDao {
	
	public static void criarQuadrado() {
		Quadrado quadrado = new Quadrado();
		
		System.out.println();
		System.out.println("Criando um objeto quadrado...");
		System.out.print("Qual o lado do quadrado? ");
		
		// Criar um objeto scanner
		Scanner leitor = new Scanner(System.in);
		
		quadrado.setLado(leitor.nextDouble());
		
		quadrado.mostrarDados();
		
		Menu.continuar(leitor, "Celso");
		
	}

}
