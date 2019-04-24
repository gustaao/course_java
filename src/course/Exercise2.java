package course;

import java.util.Locale;
import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your full name:");
		String fullName = sc.nextLine();
		
		System.out.println("How many bedrooms are in your house?");
		int bedroom = sc.nextInt();
		
		System.out.println("Enter product price:");
		double price = sc.nextDouble();
		
		System.out.println("Enter your last name, age and height");
		String lastName = sc.next();
		int age = sc.nextInt();
		double height = sc.nextDouble();

		System.out.println(fullName);
		System.out.println(bedroom);
		System.out.printf("%.2f %n",price);
		System.out.println(lastName);
		System.out.println(age);
		System.out.printf("%.2f %n",height);
		
		sc.close();
		
	}

}
