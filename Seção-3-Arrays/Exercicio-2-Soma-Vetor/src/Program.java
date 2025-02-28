import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Quantos numeros você vai digitar? ");
		int n = sc.nextInt();
		System.out.println();
		double[] valores = new double[n];
		
		for(int i=0; i<n; i++) {
			sc.nextLine();
			System.out.print("Digite um numero: ");
			valores[i] = sc.nextDouble();			
		}	
		
		System.out.println();
		System.out.print("VALORES = ");		
		for(int i=0; i<n; i++) {
			System.out.print(valores[i] + " ");
		}
		
		System.out.println();
		
		double soma = 0.0;
		for(int i=0; i<n; i++) {
			soma = soma + valores[i];
		}
		
		System.out.printf("SOMA = %.2f%n" , soma);
		
		double media = soma / n;
		
		System.out.printf("MEDIA: %.2f%n", media);
		
		sc.close();
	}

}
