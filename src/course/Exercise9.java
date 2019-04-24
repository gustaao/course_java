package course;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.Funcionarios;

public class Exercise9 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Funcionarios> list = new ArrayList<>();
		
		System.out.print("How many employees will be registered?");
		int qtd = sc.nextInt();

		for (int i = 0; i < qtd; i++) {
			System.out.println("Emplyoee #" + i + ":");

			System.out.print("Id:");
			int id = sc.nextInt();

			sc.nextLine();
			System.out.print("Name:");
			String name = sc.nextLine();

			System.out.print("Salary:");
			double salario = sc.nextDouble();

			System.out.println("");
			list.add(new Funcionarios(id, name, salario));
			
		}

		System.out.print("Enter the employee id that will have salary increase : ");
		int id = sc.nextInt();
		
		Funcionarios emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.print("Enter the percentage: ");
			double porcentage = sc.nextDouble();
			emp.increasesalary(porcentage);
		}
		
		// PART 3 - LISTING EMPLOYEES:
		
		System.out.println();
		System.out.println("List of employees:");
		for (Funcionarios obj : list) {
			System.out.println(obj);
		}
		



		sc.close();

	}

}
