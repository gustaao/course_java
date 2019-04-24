package entities;

public class Employee {

	public String name;
	public double grossSalary;
	public double tax;

	public double netsalary() {
		return grossSalary;
	}

	public double increasesalary(double porcentage) {
	  return grossSalary + ((grossSalary * porcentage)/100); 
	}

	
	public String toString() {
		return "Employee "+ name +", $ " + String.format("%.2f", (grossSalary - tax));
		
	}
}
