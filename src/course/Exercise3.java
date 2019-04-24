package course;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		int number3 = sc.nextInt();

		if (number1 > number2 && number1 > number3) {
			System.out.println("Higher = " + number1);
		} else if (number2 > number3) {
			System.out.println("Higher = " + number2);
		} else {
			System.out.println("Higher = " + number3);
		}

		sc.close();

	}

}
