package entities;

public class Aluno {
	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double mediaFinal() {
		return (nota1 + nota2 + nota3);
	}
	
	public double notaRestante() {
		return 60.0 - mediaFinal();
	}
}
