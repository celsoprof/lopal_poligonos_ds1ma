package br.com.engsenai.calculadora_poligonos.dao;

import java.util.Scanner;

import br.com.engsenai.calculadora_poligonos.model.Trapezio;
import br.com.engsenai.calculadora_poligonos.ui.Menu;

public class TrapezioDao {
	
	public static void criarTrapezio() {
		Trapezio trapezio = new Trapezio();
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println();
		System.out.println("Criando um objeto trapézio...");
		
		System.out.print("Informe a base MAIOR: ");
		trapezio.setBaseMaior(leitor.nextDouble());
		
		System.out.print("Informe a base MENOR: ");
		trapezio.setBaseMenor(leitor.nextDouble());
		
		System.out.print("Informe a ALTURA: ");
		trapezio.setAltura(leitor.nextDouble());
		
		trapezio.mostrarDados();
		
		Menu.continuar(leitor, "Celso");
	}

}
