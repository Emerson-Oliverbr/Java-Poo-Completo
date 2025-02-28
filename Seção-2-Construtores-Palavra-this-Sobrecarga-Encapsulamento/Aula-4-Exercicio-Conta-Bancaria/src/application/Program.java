package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ContaBancaria;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		ContaBancaria conta;		
		
		System.out.print("Digite o numero da conta: ");
		int number = sc.nextInt();
		System.out.print("Digite o nome do titular da conta: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("A conta tera deposito ininial, (s/n)? ");
		char resp = sc.next().charAt(0);		
		
		double initialDeposit = 0.0;
		double valueDeposit = 0.0;
		double valueWithdraw = 0.0;
		
		if(resp == 's') {
			System.out.print("Informe o valor do deposito inicial: ");
			initialDeposit = sc.nextDouble();
			conta = new ContaBancaria(number, holder, initialDeposit);	
			System.out.println("Dados bancarios: " + conta);
			System.out.println("");
			System.out.print("Informe um valor para deposito: ");
			valueDeposit = sc.nextDouble();
			conta.deposit(valueDeposit);
			System.out.println("Dados bancarios atualizados: " + conta);
			System.out.print("Informe um valor para saque: ");
			valueWithdraw = sc.nextDouble();
			conta.withdraw(valueWithdraw);
			System.out.println("Dados bancarios atualizados: " + conta);			
		}	
		
		else {							
			conta = new ContaBancaria(number, holder);			
			
			System.out.println("Dados bancarios atualizados: " + conta);
			System.out.println();
			System.out.print("Digite um valor para deposito: ");
			valueDeposit = sc.nextDouble();
			conta.deposit(valueDeposit);
			System.out.println("Dados bancarios atualizados: " + conta);	
			System.out.println();
			System.out.print("Digite um valor pa saque: ");
			valueWithdraw = sc.nextDouble();
			conta.withdraw(valueWithdraw);
			System.out.println("Dados bancarios atualizados: " + conta);
		}		
		
		sc.close();
	}

}
