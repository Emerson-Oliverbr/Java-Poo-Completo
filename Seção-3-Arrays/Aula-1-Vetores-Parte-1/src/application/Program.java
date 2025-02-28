package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		double[] idades = new double[N];
		
		for(int i=0; i<N; i++) {
			idades[i] = sc.nextDouble();
		}
		
		double media = 0.0;
		for(int i=0; i<N; i++) {
			media += idades[i] / N;	
		}
		
		System.out.printf("Media = %.2f\n", media);		
		
		sc.close();
	}
}
