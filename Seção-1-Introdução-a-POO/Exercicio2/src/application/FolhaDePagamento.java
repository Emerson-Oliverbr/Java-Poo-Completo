package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Funcionario;

public class FolhaDePagamento {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionario funcionario = new Funcionario();
		
		System.out.print("Nome: ");
		funcionario.nome = sc.nextLine();
		System.out.print("Salario bruto: ");
		funcionario.salarioBruto = sc.nextDouble();
		System.out.print("Imposto: ");
		funcionario.imposto = sc.nextDouble();
		System.out.println();
		System.out.println("Funcionario: " + funcionario);
		System.out.println();
		System.out.print("Informe um porcentagem para aumentar o salario: ");
		int aumentoEmPorcentagem = sc.nextInt();		
		funcionario.aumentarSalario(aumentoEmPorcentagem);
		System.out.println();
		System.out.print("Dados atualizados: " + funcionario);
		
		sc.close();
		
	}

}
