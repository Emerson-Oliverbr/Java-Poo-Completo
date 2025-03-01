package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		
		System.out.println("Entre com os dados do produto: ");
		System.out.print("Nome: ");
		product.name = sc.next();
		System.out.print("Preco: ");
		product.price = sc.nextDouble();
		System.out.print("Quantidade: ");
		product.quantity = sc.nextInt();				
		
		System.out.println(product);
		
		System.out.print("Digite a quantidade de produtos a serem adicionadas ao estoque: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println("Dados atualizados: ");
		System.out.println(product);
		
		System.out.print("Digite a quantidade de produtos a serem removidos do estoque: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println("Dados atualizados: ");
		System.out.println(product);
		
		sc.close();
	}

}

