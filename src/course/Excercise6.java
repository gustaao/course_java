package course;

import java.util.Locale;
import java.util.Scanner;
import entities.Employee;

public class Excercise6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Employee employe = new Employee();
		
		System.out.println("Enter name:");
		employe.name = sc.next();
		sc.next();
		System.out.println("Enter Salary:");
		employe.grossSalary = sc.nextDouble();
		System.out.println("Enter Tax:");
		employe.tax = sc.nextDouble();
		
		System.out.println(employe);
		
		System.out.println("Which porcentage to increase salary? ");
		employe.increasesalary(sc.nextDouble());
		System.out.println("Updated data: " + employe.name +", $ "+employe.grossSalary );
		sc.close();

	}

}
