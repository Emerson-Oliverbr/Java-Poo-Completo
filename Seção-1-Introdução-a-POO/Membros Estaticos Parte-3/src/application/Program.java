package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculadora;

public class Program {
	
	

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Calculadora calculadora = new Calculadora();
		
		System.out.print("Digite o valor do raio: ");
		double raio = sc.nextDouble();

		double c = calculadora.circunferencia(raio);
		
		double v = calculadora.volume(raio);
		
		System.out.printf("Circunferência: %.2f%n", c);
		System.out.printf("Circunferência: %.2f%n", v);
		System.out.printf("Valor de PI: %.5f%n", calculadora.PI);
		
		
		sc.close();
	}
	
	

}
