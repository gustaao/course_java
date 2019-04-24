package course;

import java.util.Locale;
import java.util.Scanner;
import entities.Estudent;

public class Excercise7 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Estudent student = new Estudent();
		student.nomeAluno = sc.nextLine();
		student.nota1 = sc.nextDouble();
		student.nota2 = sc.nextDouble();
		student.nota3 = sc.nextDouble();
		System.out.printf("FINAL GRADE: %.2f%n", student.nota());
		if (student.nota() < 60.0) {
		System.out.println("FAILED");
		System.out.printf("MISSING %.2f POINTS%n", student.missingPoints());
		}
		else {
		System.out.println("PASS");
		}
		sc.close();
		
		
		
		
	}

}
