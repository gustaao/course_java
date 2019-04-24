package course;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int numeroInteiro = sc.nextInt();

		while (numeroInteiro <= 0) {
			System.out.println("Number must be positive! Try again:");
			numeroInteiro = sc.nextInt();
		}

		int Higher = Integer.MIN_VALUE;
		for (int i = 1; i <= numeroInteiro; i++) {
			System.out.println("Value #: " + i + ": ");
			int x = sc.nextInt();
			if (x > Higher) {
				Higher = x;
			}
		}
		System.out.println("Higher = " + Higher);
        sc.close();
	}

}
