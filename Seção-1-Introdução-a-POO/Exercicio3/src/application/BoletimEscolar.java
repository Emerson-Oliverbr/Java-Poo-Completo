package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class BoletimEscolar {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		System.out.println("Nome do aluno: ");
		aluno.nome = sc.nextLine();
		System.out.println("Digite as três notas do aluno:");
		aluno.nota1 = sc.nextDouble();
		aluno.nota2 = sc.nextDouble();
		aluno.nota3 = sc.nextDouble();
		System.out.printf("Nota final = %.2f\n" , aluno.mediaFinal());
		
		if(aluno.mediaFinal() > 60.0) {
			System.out.println("APROVADO");
		}
		else {
			System.out.println("REPROVADO");
			System.out.printf("FALTARAM %.2f PONTOS\n" , aluno.notaRestante());
		}
		
		sc.close();
	}
}
