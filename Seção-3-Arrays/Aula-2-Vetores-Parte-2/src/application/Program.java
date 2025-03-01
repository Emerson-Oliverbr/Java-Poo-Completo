package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		Produto[] produtos = new Produto[n];
		
		for(int i=0; i<n; i++) {
			sc.nextLine();
			String nome = sc.nextLine();
			double preco = sc.nextDouble();
			produtos[i] = new Produto(nome, preco);
		}
		
		double soma = 0.0;		
		for(int i=0; i<n; i++) {
			soma += produtos[i].getPreco();
		}
		
		double media = soma / n;
		
		System.out.printf("Preço Medio = %.2f%n" , media);
		
		sc.close();
	}

}
