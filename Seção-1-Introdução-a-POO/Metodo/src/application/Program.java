package application;

import java.util.Scanner;
import java.util.Locale;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle x = new Triangle();
		Triangle y = new Triangle();
		
		System.out.println("Insira as medias do triangulo x: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Insira as medias do triangulo y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
	
		double areaX = x.area();		
		double areaY = y.area();
		
		System.out.printf("Area do Triangulo X: %.4f%n", areaX);
		System.out.printf("Area do Triangulo Y: %.4f%n", areaY);
		
		if(areaX > areaY) {
			System.out.println("Maior area é X");
		}
		else {
			System.out.println("Maior area é Y");
		}
		
		sc.close();
	}

}
