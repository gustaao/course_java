package entities;

public class Estudent {

	public String nomeAluno;
	public double nota1;
	public double nota2;
	public double nota3;

	public String nome() {
		return nomeAluno;
	}

	public double nota() {
		return nota1 + nota2 + nota3;

	}

	public double missingPoints() {
		if (nota() < 60.0) {
		return 60.0 - nota();
		}
		else {
		return 0.0;
		}
	}
}
