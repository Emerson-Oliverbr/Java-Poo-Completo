import java.util.Scanner;
import java.util.Locale;

public class Calculator {

	public static void main(String[] args) {
		menu();
	}

	static void menu() {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("Qual operação matematica deseja fazer? ");
		System.out.println("Digite 1 - Soma");
		System.out.println("Digite 2 - Subtração");
		System.out.println("Digite 3 - Divisão");
		System.out.println("Digite 4 - Multiplicaçao");
		System.out.println("Digite 5 - Sair");
		System.out.println("------------------------");
		System.out.println("Selecione uma opção: ");
		short opcao = sc.nextShort();		
		
		switch (opcao) {
		case 1:
			soma();
			break;
		case 2:
			subtracao();
			break;
		case 3:
			divisao();
			break;
		case 4:
			multiplicacao();
			break;
		case 5: 
			System.out.println("Encerrando o programa...");
            System.exit(0);
			break;
		default:
			System.out.println("Opção inválida. Tente novamente.");
			menu();
		}

		sc.close();
	}

	static void soma() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o primeiro valor: ");
		float valor1 = sc.nextFloat();
		System.out.print("Digite o segundo valor: ");
		float valor2 = sc.nextFloat();
		System.out.println();

		float resultado = valor1 + valor2;
		System.out.println("O resultado da soma é: " + resultado);
		
		menu();
		
		sc.close();
	}

	static void subtracao() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o primeiro valor: ");
		float valor1 = sc.nextFloat();
		System.out.print("Digite o segundo valor: ");
		float valor2 = sc.nextFloat();
		System.out.println();

		float resultado = valor1 - valor2;
		System.out.println("O resultado da subtraçao é: " + resultado);

		menu();
		
		sc.close();
	}

	static void divisao() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o primeiro valor: ");
		float valor1 = sc.nextFloat();
		System.out.print("Digite o segundo valor: ");
		float valor2 = sc.nextFloat();
		System.out.println();

		float resultado = valor1 / valor2;
		System.out.println("O resultado da divisao é: " + resultado);
		
		menu();
		
		sc.close();
	}

	static void multiplicacao() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o primeiro valor: ");
		float valor1 = sc.nextFloat();
		System.out.print("Digite o segundo valor: ");
		float valor2 = sc.nextFloat();
		System.out.println();

		float resultado = valor1 * valor2;
		System.out.println("O resultado da multiplicacao é: " + resultado);
		
		menu();
		
		sc.close();
	}

}
