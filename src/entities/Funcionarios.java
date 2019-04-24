package entities;

public class Funcionarios {
	
	private int id;
	private String name;
	private double salario;
	
	public Funcionarios() {
	}

	public Funcionarios(String name, double salario) {
		this.name = name;
		this.salario = salario;
	}
	
	public Funcionarios(int id, String name, double salario) {
		this.id = id;
		this.name = name;
		this.salario = salario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void increasesalary(double porcentage) {
		salario += salario * porcentage / 100.0;
		}
	


}
