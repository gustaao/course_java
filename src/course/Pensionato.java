package course;

import java.util.Locale;
import java.util.Scanner;

import entities.Locatarios;

public class Pensionato {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Locatarios[] quarto = new Locatarios[10];
		
		System.out.print("How many rooms will be rented? ");
		
		for (int i = 1; i < quarto.length; i++) {
			System.out.println();
			System.out.println("Rent #" + i + ":");
			System.out.print("Name: ");

			sc.nextLine();
			
			String nome = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			
			int room = sc.nextInt();
			quarto[room] = new Locatarios(nome, email);

		
		}
		
		System.out.println();
		System.out.println("Busy rooms:");
		for (int i=0; i<10; i++) {
		if (quarto[i] != null) {
		System.out.println(i + ": " + quarto[i]);
		}
		}	
		
			

	sc.close();

}

}
